package com.myproject.analytics.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnalyticsService {
    private List<String> orders = new ArrayList<>();

    public List<String> listOrders(){
        return orders;
    }

    public List<String> addOrder(String orderName){
        orders.add(orderName);
        return orders;
    }
}
