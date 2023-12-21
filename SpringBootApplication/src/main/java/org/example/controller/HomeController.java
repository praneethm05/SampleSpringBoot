package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/test")
public class HomeController {
     String name="Praneeth";
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public @ResponseBody String getName()
    {

        return name;
    }

    @RequestMapping(value = "/addName",method = RequestMethod.POST)
    public @ResponseBody String setName(@RequestBody String name)
    {
        this.name=name;
        return name;
    }

}
