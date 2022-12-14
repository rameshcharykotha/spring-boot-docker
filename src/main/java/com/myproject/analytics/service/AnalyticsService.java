package com.myproject.analytics.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class AnalyticsService {
    private List<String> orders = new ArrayList<>(Arrays.asList("List of orders "));

    public List<String> listOrders(){
        orders.add(UUID.randomUUID().toString());
        return orders;
    }

}
