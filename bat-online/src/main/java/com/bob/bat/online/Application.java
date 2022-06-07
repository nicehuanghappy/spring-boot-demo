package com.bob.bat.online;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author hwy
 */

@SpringBootApplication
@MapperScan("com.bob.bat.mybatis")
@ServletComponentScan("com.bob.online")
@EnableAsync
@EnableAspectJAutoProxy
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

}
