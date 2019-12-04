import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.util.ClassUtils;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
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

        Date d = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd  kk:mm:ss ");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        System.out.println(sdf.format(d));

        System.out.println("Hello World!");
        //启动 Web容器
        SpringApplication.run(App.class, args);
    }
}


