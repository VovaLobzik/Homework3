package com.example.homework3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.homework3.entity.BusTicket;
import com.example.homework3.entity.BusTicketChild;
import com.example.homework3.entity.BusTicketGrand;


public class MainActivity extends AppCompatActivity {

    private BusTicket busTicket = new BusTicket("Молодые взрослые", (short) 9, 70);
    private BusTicket busTicketGrand = new BusTicketGrand("Пенсионеры", (short) 5, 70, (byte) 30);
    private BusTicket busTicketChild = new BusTicketChild("Дети", (short) 11, 70, (byte) 50);

    private TextView busTicketAllOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        busTicketAllOut = findViewById(R.id.busTicketAllOut);

        busTicketAllOut.setText(Float.toString(busTicket.ticketPriceAll() + busTicketChild.ticketPriceAll() + busTicketGrand.ticketPriceAll()) + "монет");
    }
}