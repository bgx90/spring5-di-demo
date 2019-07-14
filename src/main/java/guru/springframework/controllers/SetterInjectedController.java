package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

@Controller
public class SetterInjectedController {

    @Autowired
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    /**
     * @param greetingService the greetingService to set
     */
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
