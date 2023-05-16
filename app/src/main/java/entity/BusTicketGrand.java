package entity;

public class BusTicketGrand extends BusTicket{

    private byte ticketDiscount;

    public BusTicketGrand(String category, short ticketOfNumber, float ticketOfPriceSingle, byte ticketDiscount) {
        super(category, ticketOfNumber, ticketOfPriceSingle);
        this.ticketDiscount = ticketDiscount;
    }

    public float ticketPriceAll() {
        return getTicketOfNumber() * getTicketOfPriceSingle() * (100 - ticketDiscount) / 100;
    }
}
