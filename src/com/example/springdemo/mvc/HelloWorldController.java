package com.example.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    // new controller method to read data and
    // add data to model
    @RequestMapping("/processFormVersionTwo")
    public String letsShout(HttpServletRequest request, Model model){

        // read the request parameter from html form
        String name = request.getParameter("studentName");

        // convert data to all caps
        name = name.toUpperCase();

        // create message
        String result = "HEY " + name + "!";

        // add mesage to model
        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model){

        // convert data to all caps
        theName = theName.toUpperCase();

        // create message
        String result = "Yo " + theName + "!";

        // add mesage to model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
