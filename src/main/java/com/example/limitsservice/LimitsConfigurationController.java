package com.example.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/s1")
public class LimitsConfigurationController
{
    @Autowired
    private LimitConfiguration configuration;

    @GetMapping("/limits")
    public LimitConfiguration test()
    {
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
