package com.example.internetshop.model;

import javax.persistence.OneToMany;

public class Order {
    private Long id;
    private int totalPrice;
    private Item item;
}
