package com.vd.springcloudeurekafeignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vd.springcloudeurekafeignclient.controllers.GreetingClient;

@SpringBootApplication
@EnableFeignClients
@Controller
public class SpringcloudeurekafeignclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudeurekafeignclientApplication.class, args);
	}
	
	@Autowired
    private GreetingClient greetingClient;
	
	@RequestMapping("/get-greeting")
    public String greeting(Model model) {
        model.addAttribute("greeting", greetingClient.greeting());
        return "greeting-view";
    }

}
