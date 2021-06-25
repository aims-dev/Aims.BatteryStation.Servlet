package Aims.BatteryStation.Servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.TimeZone;

@EnableTransactionManagement
@SpringBootApplication
public class Application {

	public static void main(String[] args)
	{
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
		SpringApplication.run(Application.class, args);
	}

}
