package com.rkaniecki.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetController {

    @RequestMapping({"", "/index"})
    public String indexPage() {

        return "vets/index";
    }
}
