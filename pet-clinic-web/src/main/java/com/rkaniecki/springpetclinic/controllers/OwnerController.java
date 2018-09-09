package com.rkaniecki.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    @RequestMapping({"/index", ""})
    public String indexPage() {

        return "owners/index";
    }
}
