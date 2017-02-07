package cn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class Springboot1Application {
	// 添加了一个方法，显示欢迎信息
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Springboot1Application.class, args);
	}
}
