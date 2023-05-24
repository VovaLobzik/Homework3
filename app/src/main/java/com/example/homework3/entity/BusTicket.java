package com.example.homework3.entity;

public class BusTicket {
    //поля
    private String category;
    private short ticketOfNumber;
    private float ticketOfPriceSingle;

    //конструктор
    public BusTicket(String category, short ticketOfNumber, float ticketOfPriceSingle) {
        this.category = category;
        this.ticketOfNumber = ticketOfNumber;
        this.ticketOfPriceSingle = ticketOfPriceSingle;
    }

    //стоимость всех взрослых билетов
    public float ticketPriceAll() {
        return ticketOfNumber * ticketOfPriceSingle;
    }

    // геттеры и сеттеры
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public short getTicketOfNumber() {
        return ticketOfNumber;
    }

    public void setTicketOfNumber(short ticketOfNumber) {
        this.ticketOfNumber = ticketOfNumber;
    }

    public float getTicketOfPriceSingle() {
        return ticketOfPriceSingle;
    }

    public void setTicketOfPriceSingle(float ticketOfPriceSingle) {
        this.ticketOfPriceSingle = ticketOfPriceSingle;
    }
}
