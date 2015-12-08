package org.lt.springmvc;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
 
        model.addAttribute("message", "spring demo");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return "hello";
    }
}
