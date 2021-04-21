package org.wj.prajumsook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableCircuitBreaker
//@EnableHystrixDashboard
public class DemohystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemohystrixApplication.class, args);
	}

}
