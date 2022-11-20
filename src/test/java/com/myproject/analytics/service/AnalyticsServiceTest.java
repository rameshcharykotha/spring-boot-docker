package com.myproject.analytics.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AnalyticsServiceTest {

    @Autowired
    AnalyticsService analyticsService;

    @Test
    public void testList(){
        Assertions.assertTrue(analyticsService.listOrders().size() > 0);
    }
}
