package com.perezm27.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
    @GetMapping("/")
    public String getRoot(){
        System.out.println("Somebody got to the root");
//  Needs to match exactly the filename of a template in resources/templates (templates = our views for our app)
        return "root";
    }

    @GetMapping("/hello")
    public String helloWorld(){
        System.out.println("Somebody got to the root");
        return "helloworld";
    }

//  Models: useful for passing data to templates
    @GetMapping("/capitalize/{caps}")
    public String getCaps(@PathVariable String caps, Model m){
        m.addAttribute("caps", caps.toUpperCase());
        return "sayHelloCaps";
    }

    @GetMapping("/reverse")
    public String getReversed(@RequestParam(required = false, defaultValue = "Hello World") String word, Model m){
        m.addAttribute("word", reverseWords(word));
        return "reversedStr";
    }

//  https://www.geeksforgeeks.org/reverse-words-given-string-java/
//  Changed to StringBuilder for Optimization
    public static String reverseWords(String word) {
        String[] temp = word.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result.insert(0, temp[i]);
            else
                result.insert(0, " " + temp[i]);
        }
        return result.toString();
    }

}
