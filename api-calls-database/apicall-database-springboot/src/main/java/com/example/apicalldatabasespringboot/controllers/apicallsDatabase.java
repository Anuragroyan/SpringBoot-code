package  com.example.apicalldatabasespringboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class apicallsDatabase {
    
    @RequestMapping("/database")
    public String getApicall() {
       return "Hi welcome to springboot database system";
    }
    
}
