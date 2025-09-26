package com.github.nearata.psychicsystem.routes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Root
{
    @GetMapping("/")
    public String getRoot()
    {
        return "Hello, World!";
    }
}
