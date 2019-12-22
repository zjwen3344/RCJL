package com.buoyantec;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Hello world!
 */

//自动配置注解
@SpringBootApplication
@ComponentScan({"com.buoyantec.service","com.buoyantec"})
@MapperScan("com.buoyantec.dao")
@RestController
public class App {

    public static void main(String[] args)  {


            int[]  todos=new int[]{213,41,523,645,123,6345};


            for (int todo : todos){

                System.out.printf(String.valueOf(todo));

            }



        Date d = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd  kk:mm:ss ");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        System.out.println(sdf.format(d));


        System.out.println("Hello World!");
        //启动 Web容器
        SpringApplication.run(App.class, args);
    }
}


