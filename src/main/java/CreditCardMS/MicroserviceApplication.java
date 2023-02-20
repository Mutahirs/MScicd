package CreditCardMS;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MicroserviceApplication {

	//static Logger logger = LogManager.getLogger(MicroserviceApplication.class);

	static Logger logger= LogManager.getLogger(MicroserviceApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(MicroserviceApplication.class, args);

		logger.debug("My Debug Log");
		logger.info("My Info Log");
		logger.warn("My Warn Log");
		logger.error("My error log");
		logger.fatal("My fatal log");
	}

}
