package com.buoyantec;

import org.apache.shiro.mgt.DefaultSessionStorageEvaluator;
import org.apache.shiro.mgt.DefaultSubjectDAO;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import javax.servlet.Filter;
import java.util.HashMap;
import java.util.Map;

@Configuration
@ConditionalOnWebApplication
public class ShiroConfiguration {

        Logger logger = LoggerFactory.getLogger(ShiroConfiguration.class);

    @Bean
    public AuthRealm AuthRealm() {
        logger.info("初始化AuthRealm成功!!\n");
        return new AuthRealm();
    }

    @Bean("securityManager")
    public DefaultWebSecurityManager securityManager(AuthRealm authRealm) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(authRealm);

        // 关闭自带session
        DefaultSessionStorageEvaluator evaluator = new DefaultSessionStorageEvaluator();
        evaluator.setSessionStorageEnabled(false);

        DefaultSubjectDAO subjectDAO = new DefaultSubjectDAO();
        subjectDAO.setSessionStorageEvaluator(evaluator);

        securityManager.setSubjectDAO(subjectDAO);
        logger.info("初始化securityManager成功！\n");

        // 设置自定义缓存(Cache)管理器
        securityManager.setCacheManager(new CustomCacheManager());

        return securityManager;
    }

    @Bean("shiroFilter")
    public ShiroFilterFactoryBean shiroFilterFactoryBean(DefaultWebSecurityManager securityManager) {
        ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();

        Map<String, Filter> filterMap = new HashMap<>();
        filterMap.put("jwt", new JWTFilter());

        factoryBean.setFilters(filterMap);
        factoryBean.setSecurityManager(securityManager);

        factoryBean.setSecurityManager(securityManager);
        factoryBean.setUnauthorizedUrl("/401");

        /*
         * 自定义url规则
         * http://shiro.apache.org/web.html#urls-
         */
        Map<String, String> filterRuleMap = new HashMap<>();
        // 所有请求通过自己的JWT Filter
        filterRuleMap.put("/**", "jwt");
        // 访问401和404页面不通过Filter
        filterRuleMap.put("/401", "anon");


        factoryBean.setFilterChainDefinitionMap(filterRuleMap);
        logger.info("初始化shiroFilterFactoryBean成功\n");

        return factoryBean;
    }

    @Bean
    @DependsOn("lifecycleBeanPostProcessor")
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        defaultAdvisorAutoProxyCreator.setProxyTargetClass(true);
        logger.info("初始化defaultAdvisorAutoProxyCreator！\n");

        return defaultAdvisorAutoProxyCreator;
    }

    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        logger.info("初始化defaultAdvisorAutoProxyCreator！\n");

        return new LifecycleBeanPostProcessor();
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(DefaultWebSecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(securityManager);
        logger.info("初始化authorizationAttributeSourceAdvisor成功！\n");

        return advisor;
    }
}