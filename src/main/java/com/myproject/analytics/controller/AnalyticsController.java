package com.myproject.analytics.controller;

import com.myproject.analytics.service.AnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnalyticsController {

    @Autowired
    AnalyticsService analyticsService;

    @GetMapping("/hello")
    public List<String> listOrders(){
        return analyticsService.listOrders();
    }
}
