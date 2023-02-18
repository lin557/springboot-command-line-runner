# springboot-command-line-runner
springboot3 CommandLineRunner



## 实现方法

1. 主类实现 *CommandLineRunner*接口

```
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
```

2. 利用*@Scheduled*保持进程一直运行

```
@EnableScheduling
@Service
public class KeepAlive {

    @Scheduled(initialDelay=1000, fixedDelay=1000)
    public void heartbeat() {
        // no code, keep application running
        System.out.println("heartbeat");
    }
}
```