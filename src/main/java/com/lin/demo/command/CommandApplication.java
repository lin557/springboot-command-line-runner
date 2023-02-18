package com.lin.demo.command;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lin
 */
@SpringBootApplication
public class CommandApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(CommandApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// 这里执行完 进程就会结束 如果想一直在后台运行 可以加一个 @EnableScheduling
		System.out.println("hello world");
	}
}
