package org.launchcode.skills_tracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String helloForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker</h1>"+
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                        "<li> Java  </li>" +
                        "<li> JavaScript  </li>" +
                        "<li> Python  </li>"+
                        "</ol>" +
                        "</body>" +
                        "</html>";
        return html;
    }
    @GetMapping("form")
    @ResponseBody
    public String formSubmit(){
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = 'form'>" + "</br> Name: </br>" +
                        "<input type = 'text' name = 'name' />" +"</br>"+
                        "My favorite language:</br>"+
                        "<select name ='firstLanguage'>" +
                        "<option value='java'>Java</option>" +
                        "<option value='javaScript'>JavaScript</option>" +
                        "<option value='python'>Python</option>" +
                        "</select>"+"</br>"+
                        "My second favorite language:</br>"+
                        "<select name ='secondLanguage'>" +
                        "<option value='java'>Java</option>" +
                        "<option value='javaScript'>JavaScript</option>" +
                        "<option value='python'>Python</option>" +
                        "</select>"+"</br>"+
                        "My third favorite language:</br>"+
                        "<select name ='thirdLanguage'>" +
                        "<option value='java'>Java</option>" +
                        "<option value='javaScript'>JavaScript</option>" +
                        "<option value='python'>Python</option>" +
                        "</select>"+"</br>"+
                        "<input type = 'submit' value = 'Submit' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @PostMapping("form")
    @ResponseBody
    public String displaySelection(@RequestParam String name, @RequestParam String firstLanguage,
                                   @RequestParam String secondLanguage, @RequestParam String thirdLanguage) {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>" + name + "</h1>"+
                        "<ol>" +
                        "<li>" + firstLanguage + "</li>" +
                        "<li>" + secondLanguage + "</li>" +
                        "<li>" + thirdLanguage + "</li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";
        return html;

    }



}


