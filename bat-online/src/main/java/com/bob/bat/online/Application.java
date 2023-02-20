package com.bob.bat.online;


//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author hwy
 */

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@MapperScan("com.bob.bat.mybatis")
@ServletComponentScan("com.bob.online")
@EnableAsync
@EnableAspectJAutoProxy
public class Application {

    public static void main(String[] args) {
        String a = "1";
        String b = "2";
        String c = "3";
        String d = a + b + c;
        String str = "abc";
        for (int i = 0; i < 10; ++i) {
            str += "a";
        }
        SpringApplication.run(Application.class);
    }

}
