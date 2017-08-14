package com.guenther.spring2.util;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView helloWorld()
    {
        ModelAndView mv = new
                ModelAndView("welcome");
        mv.addObject("message","Hello there what would like today?!");
        mv.addObject("bob", "Please follow the steps in thew linc below!");
        mv.addObject("title", "Welcome to the GC cafe!");
        return mv;
    }

    @RequestMapping("/userform")
    public ModelAndView userform () {
        return new ModelAndView("form", "inst",
                "Please enter info: ");
    }

    @RequestMapping("/formhandler")
    public ModelAndView formhandler (@RequestParam("name") String name,
                                     @RequestParam("email") String email,
                                     @RequestParam("address") String address,
                                     @RequestParam("city") String city,
                                     @RequestParam("state") String state,
                                     @RequestParam("gender") String gender
    ) {
        ModelAndView mv = new ModelAndView("formresponse");
        mv.addObject("name", name);
        mv.addObject("email", email);
        mv.addObject("address", address);
        mv.addObject("city", city);
        mv.addObject("state", state);
        mv.addObject("gender", gender);
        return mv;
    }
}