import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 */

//自动配置注解
@SpringBootApplication
@ComponentScan({"com.buoyantec.service","com.buoyantec"})
@MapperScan("com.buoyantec.dao")
@RestController
public class App {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        //启动 Web容器
        SpringApplication.run(App.class, args);
    }
}


