package com.crio.qcalc;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		// SpringApplication.run(QcalcApplication.class, args);
		System.out.println("Starting QCalc..");
		StandardCalculator calc = new StandardCalculator();
		calc.add(1,2);
		calc.printResult();
		calc.clearResult();
		calc.printResult();
		calc.getVersion();
		calc.multiply(76, 6);
		calc.printResult();
		// calc.add(Double.MAX_VALUE, 9);
		// calc.printResult();
		ScientificCalculator Scalc = new ScientificCalculator();
		Scalc.sqrt(81);
		Scalc.add(5,7);
		Scalc.printResult();

		
		LogicCalculator Lcalc = new LogicCalculator();
		Lcalc.OR(8, 6);
		Lcalc.printResult();

	}

}
