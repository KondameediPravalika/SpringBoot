package com.pravalika.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*FIRST APPROACH(USING NORMAL SPRING APPROACH)
 * ===========================================
 * for every spring boot basic important file ==> Bootstrap class(we have many 100s o java classes to identify it we use these)
 * It is the starting point of the spring boot application
 * If we write @SpringBootApplication to any java class ==> Bootstrap class(By default if any java class has @---- then it is bootstrap class
 * 
 * Funtionality of Bootstrap class
 * =============================
 * 1)It will create IOC Container ==> Inversion of control container ==> Efficient Management
 *    IOC will create / manage and destruct the object and developer no need to write any new 
 *    keyword to intialize and null keyword to destruct or garbage.
 * 2)It will automatically scans all java classes created under Bootstrap package and bootstrap subpackage 
 *     In this example, it will scan all the java classes under com.pravalika.helloworld and
 *     com.pravalika.helloworld.*  and pushed to IOC container
 *     
 *     In real time example, folder structure like as follows
 *        com.amazon.ecommerce ==> Main Bootstrap class path
 *        com.aamzon.ecommmerce.order 		===> Order processing Logic
 *        com.aamzon.ecommmerce.customer 	===> Customer processing Logic
 *        com.aamzon.ecommmerce.product     ===> Product processing Logic
 *        com.aamzon.ecommmerce.payment     ===> Payment processing Logic
 *        com.aamzon.ecommmerce.discount    ===> Discount Logic
 *        com.aamzon.ecommmerce.shipping    ===> Shipping Related Logic
 *        com.aamzon.ecommmerce.return      ===> Return processing Logic
 *
 *
 *3) It is going to create DispatcherServlet And it registers all our features which will be used
 *		For Routing configuration
*/
@SpringBootApplication
public class HelloWorldInSpring {
	public static void main(String[] args) {

		SpringApplication.run(HelloWorldInSpring.class, args);
		
		//The above line creates web application context for IOC Contnext(it is done in spring)

				/*
				 *
				 * spring.xml
				 * -----------------------------------------------------------------------------------
				 * <bean id="orderobj" class=" com.aamzon.ecommmerce.order" scope="scope of the class">
				 * ......
				 * ....
				 * ...
				 * -----------------------------------------------------------------------------------
				 *
				 * WebApplicationContext context=IOC.CreateXMLAP.....(spring.xml);
				 *
				 *
				 */
	
	}
}
