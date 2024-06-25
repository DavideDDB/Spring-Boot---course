package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@ComponentScan
public class SpringBeansExample {

	public static void main(String[] args) {
		// Annotation-configuration
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(SpringBeansExample.class);
		//AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

		
		//Student s1 = (Student) ctx.getBean("student");
		//Student s1 = ctx.getBean("student", Student.class);
		//System.out.println(s1);
		
		for (String beanName : ctx.getBeanDefinitionNames()) { //il metodo getBeanDefinitionNames ci permette di ottenere la lista di tutti i Bean creati dall'applicazione
            System.out.println("Bean --->" + beanName);
        }
		ctx.close(); //bisogna sempre chiudere i context
	}

}