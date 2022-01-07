package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ticket_id;
    private String busname;
    private String busnumber;
    private String date;
    private String time;
    private String price;
    private String source;
    private String destination;
    private int remainingseats;

    public ticket() {
        super();
        // TODO Auto-generated constructor stub
    }
    public ticket(long ticket_id, String busname, String busnumber, String date, String time, String price, String source, String destination, int remainingseats) {
        this.ticket_id = ticket_id;
        this.busname = busname;
        this.busnumber = busnumber;
        this.date = date;
        this.time = time;
        this.price = price;
        this.source = source;
        this.destination = destination;
        this.remainingseats = remainingseats;
    }

    public long getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(long ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getBus_name() {
        return busname;
    }

    public void setBus_name(String bus_name) {
        this.busname = busname;
    }

    public String getBus_no() {
        return busnumber;
    }

    public void setBus_no(String bus_no) {
        this.busnumber = busnumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getRemaining_seats() {
        return remainingseats;
    }

    public void setRemaining_seats(int remainingseats) {
        this.remainingseats = remainingseats;
    }

    @Override
    public String toString() {
        return "ticket{" +
                "ticket_id=" + ticket_id +
                ", bus_name='" + busname + '\'' +
                ", bus_no='" + busnumber + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", price='" + price + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", remaining_seats='" + remainingseats + '\'' +
                '}';
    }
}
