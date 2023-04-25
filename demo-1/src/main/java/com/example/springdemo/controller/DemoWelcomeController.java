package com.example.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoWelcomeController {
	
	   @GetMapping("/signinpage")
       public String welcome(@RequestParam String usernameone)
       {
    	   return "Signin page is Successfully"+usernameone;
       } 
	   @GetMapping("/signup")
	   public String welcomeone(@RequestParam String username)
	   {
		   return "Signup page is Successfully"+username;
	   }
	   @GetMapping("/sign")
	   public String welcometwo(@RequestParam String usernametwo,@RequestParam String usernamefour)
	   {
		   return "Signup page is Successfully"+usernametwo+" "+usernamefour;
	   }
	   @GetMapping("/login")
	   public String welcomefour(@RequestParam String user,@RequestParam String Password)
	   {
		   if(user.equals("aaaa")&&Password.equals("1234"))
		   {
			   return "Login Successfully";
		   }
		   else
		   {
			   return "Login faild please check your username and password \r\n";
		   }
	   }
}