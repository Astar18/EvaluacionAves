package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.itsqmet.aves.AvesApplication;
import ec.edu.itsqmet.aves.dto.AvesDTO;
import ec.edu.itsqmet.aves.service.IAvesService;
import ec.edu.itsqmet.aves.service.impl.AvesServiceImpl;

@SpringBootTest
class EvaluacionAvesApplicationTests {

	@Test
	void contextLoads() {
		
		AvesApplication aves = new AvesApplication(1, "acuáticas");
		AvesApplication aves1 = new AvesApplication(2, "de rapiña");
		AvesApplication aves2 = new AvesApplication(3, "cantoras");
		AvesApplication aves3 = new AvesApplication(4, "no nadadoras");
				
	}

}
