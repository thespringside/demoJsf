package com.theserverside.demoJsf;

import javax.faces.webapp.FacesServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoJsfApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DemoJsfApplication.class, args);
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoJsfApplication.class);
    }
     
    @Bean
    public FacesServlet facesServlet() {
        return new FacesServlet();
    }
     
 
    @Bean
    public ServletRegistrationBean facesServletRegistration() {
      ServletRegistrationBean registration = new   ServletRegistrationBean(facesServlet(), "*.xhtml");
      registration.setName("FacesServlet");
      return registration;
    }
}
