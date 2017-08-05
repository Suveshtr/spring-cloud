package spring.tasks;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class SpringCloudTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTaskApplication.class, args);
	}
	
	@Bean
	public TollProcessingTask tollProcessongTask() {
		return new TollProcessingTask();
	}
	
	public class TollProcessingTask implements CommandLineRunner {

		@Override
		public void run(String... strings) throws Exception {
			// parameters station id, license plate, timestamp
			String stationid = strings[0];
			String lecensePlate = strings[1];
			String timeStamp = strings[2];
			if (null != strings)
			{
				System.out.println("Station id :"+ stationid + " license plate: " + lecensePlate + " time stamp: " + timeStamp);
			}			
		}
		
	}
}
