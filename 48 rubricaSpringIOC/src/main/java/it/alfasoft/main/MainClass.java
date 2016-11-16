package it.alfasoft.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import it.alfasoft.bean.Rubrica;
import it.alfasoft.bean.Voce;

public class MainClass {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Rubrica r = (Rubrica) context.getBean("rubrica");

		Voce v = r.getVoceByName("Pippo");

		System.out.println(v.getNome() + " " + v.getTelefono());

	}

}
