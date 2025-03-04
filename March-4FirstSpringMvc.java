//web.xml

<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://java.sun.com/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://java.sun.com/xml/ns/javaee 
                             http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
         version="3.0">

    <display-name>Spring MVC Application</display-name>

    <!-- Dispatcher Servlet Configuration -->
    <servlet>
        <servlet-name>dispatcher</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>

    <servlet-mapping>
        <servlet-name>dispatcher</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>

</web-app>


//example-servlet.xml

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="
           http://www.springframework.org/schema/beans 
           http://www.springframework.org/schema/beans/spring-beans.xsd 
           http://www.springframework.org/schema/context 
           http://www.springframework.org/schema/context/spring-context.xsd">

    <!-- Scan for @Component, @Service, @Repository, and @Controller annotations -->
    <context:component-scan base-package="com.example"/>

    <!-- Enable annotation-based configurations -->
    <context:annotation-config/>

    <!-- Configure View Resolver -->
    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="prefix" value="/WEB-INF/views/"/>

        <property name="suffix" value=".jsp"/>
    </bean>

</beans>


//HomeController.java

package com.example.Demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		System.out.println("Hello");
		return "index1";
	}
	
	

}

//index.jsp

<!DOCTYPE html>
<html>
<head>
   <h2>WELCOME</h2>

</body>
</html>

 
