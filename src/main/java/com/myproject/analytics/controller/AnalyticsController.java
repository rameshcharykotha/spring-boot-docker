package com.myproject.analytics.controller;

import com.myproject.analytics.service.AnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnalyticsController {

    @Autowired
    AnalyticsService analyticsService;

    @Value("application.schedule")
    String schedule;

    @GetMapping("list")
    public List<String> listOrders(){
        return analyticsService.listOrders();
    }

    @GetMapping("show")
    public String show(){
        return schedule;
    }

}
