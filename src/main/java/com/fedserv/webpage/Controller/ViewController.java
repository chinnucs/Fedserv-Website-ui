package com.fedserv.webpage.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class ViewController {
    @GetMapping("/")
    public String homeWebpage1()
    {
        return "home.html";
    }

    @GetMapping("/career")
    public String careerWebpage()
    {
        return "career.html";
    }

    @GetMapping("/opening")
    public String openingWebpage()
    {
        return "opening.html";
    }

    @GetMapping("/about")
    public String aboutWebpage()
    {
        return "about.html";
    }

    @GetMapping("/download")
    public String downloadWebpage()
    {
        return "download.html";
    }

    @GetMapping("/contact")
    public String contactWebpage()
    {
        return "contact.html";
    }

    @GetMapping("/gallery")
    public String galleryWebpage()
    {
        return "gallery.html";
    }
}
