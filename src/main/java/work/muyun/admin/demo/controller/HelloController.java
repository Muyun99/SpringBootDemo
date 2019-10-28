package work.muyun.admin.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
class HelloWorldController {
    @GetMapping("/helloworld/{name}")
    public String helloworld(@PathVariable("name") String name){
        return "Hello " + name;
    }
}