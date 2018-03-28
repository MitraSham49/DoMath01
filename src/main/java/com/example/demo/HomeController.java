package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String loadFormPage(@RequestParam("input") String input, Model model){
        int a, b, c, d, e;
        double  x, y, z;
        String one, two, red, blue, green;
        StringBuilder output= new StringBuilder();

        a = 5;
        b = 10;
        c = a + b;
        output.append(input);
        output.append("<br/>");
        output.append(dosomething());

        output.append("<br/>");
        output.append("a is " + a + ", b is " + b);
        output.append("<br/>");
        output.append("a + b is " + c);

        d = a - b;
        output.append("<br/>");
        output.append("a - b is " + d );
        e = a * b;
        output.append("<br/>");
        output.append("a * b is" + e);
        e = a / b;
        output.append("<br/>");
        output.append("a / b is " + e);
        e = b / a;
        output.append("<br/>");
        output.append( "b / a is " + e );
        e = a % b;
        output.append("<br/>");
        output.append( "a % b is " + e );
        e = b % a;
        output.append("<br/>");
        output.append( "b % a is " + e );

        x = 1.5;
        output.append("<br/>");
        output.append( "x is " + x );
        y = x * x;
        output.append("<br/>");
        output.append( "x * x is " + y );
        z = b / 3;
        output.append("<br/>");
        output.append( "b / 3 is " + z );
        output.append("<br/>");
        //output.append();

        one = "one";
        two = "two";
        red = "red";
        blue = "blue";
        green = "green";
        output.append("<br/>");
        output.append("Green is" +green);
        output.append("<br/>");
        output.append( one + " fish " + two + " fish ");
        output.append("<br/>");
        output.append(red + " fish " + blue + " fish");
        output.append("<br/>");
        output.append(String.format("%s fish %s fish %s fish %s fish", one, two, red, blue));
        output.append("<br/>");
        model.addAttribute("output" ,output);
       //send index.html back to the browser
         return"index";
    }
    private  String dosomething(){
        return "I just did something";
    }
}
