package com.wtc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.datatype.XMLGregorianCalendar;

@SpringBootApplication
public class SpringcloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudApplication.class, args);
	}


	public void test(){
		if(1==1){
			XMLGregorianCalendar cal = null;
		}

	}
}
