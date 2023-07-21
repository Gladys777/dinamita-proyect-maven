package com.dinamita.dinamitademo.Entity;

import jakarta.persistence.*;




@Entity
@Table(name = "orders")
public class orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// nos ayuda a que nuestro ID se vaya autoincrementando
    @Column(name = "id")
    private int id;

    @Column(name = "order_number")
    private String order_number;

    @Column(name = "user_id")
    private int user_id;
/*
    @Column(name = "status")
    private Enum status;
*/
    @Column(name = "grand_total")
    private double grand_total;

    @Column(name = "item_count")
    private int item_count;

    @Column(name = "is_paid")
    private int is_paid;

    @Column(name = "shipping_fullname")
    private String shipping_fullname;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public double getGrand_total() {
        return grand_total;
    }

    public void setGrand_total(double grand_total) {
        this.grand_total = grand_total;
    }

    public int getItem_count() {
        return item_count;
    }

    public void setItem_count(int item_count) {
        this.item_count = item_count;
    }

    public int getIs_paid() {
        return is_paid;
    }

    public void setIs_paid(int is_paid) {
        this.is_paid = is_paid;
    }

    public String getShipping_fullname() {
        return shipping_fullname;
    }

    public void setShipping_fullname(String shipping_fullname) {
        this.shipping_fullname = shipping_fullname;
    }
}


