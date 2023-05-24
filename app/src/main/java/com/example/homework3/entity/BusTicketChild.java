package com.example.homework3.entity;

public class BusTicketChild extends BusTicket {

    private byte ticketDiscount;

    public BusTicketChild(String category, short ticketOfNumber, float ticketOfPriceSingle, byte ticketDiscount) {
        super(category, ticketOfNumber, ticketOfPriceSingle);
        this.ticketDiscount = ticketDiscount;
    }

    public float ticketPriceAll() {
        return getTicketOfNumber() * getTicketOfPriceSingle() * (100 - ticketDiscount) / 100;
    }
}
