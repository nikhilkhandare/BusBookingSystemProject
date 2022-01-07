package com.example.demo.entities;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
public class customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int booked_id;
    private int user_id;
    private int ticket_id;
    private int user_seats;
    private String busname;
    private String busno;
    private String source;
    private String destination;
    private String date;
    private  String time;
    private String price;

    public customer(int booked_id, int user_id, int ticket_id, int user_seats, String busname, String busno, String source, String destination, String date, String time, String price) {
        this.booked_id = booked_id;
        this.user_id = user_id;
        this.ticket_id = ticket_id;
        this.user_seats = user_seats;
        this.busname = busname;
        this.busno = busno;
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.time = time;
        this.price = price;
    }

    public customer() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getBooked_id() {
        return booked_id;
    }

    public void setBooked_id(int booked_id) {
        this.booked_id = booked_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public int getUser_seats() {
        return user_seats;
    }

    public void setUser_seats(int user_seats) {
        this.user_seats = user_seats;
    }

    public String getBusname() {
        return busname;
    }

    public void setBusname(String busname) {
        this.busname = busname;
    }

    public String getBusno() {
        return busno;
    }

    public void setBusno(String busno) {
        this.busno = busno;
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

    @Override
    public String toString() {
        return "customer{" +
                "booked_id=" + booked_id +
                ", user_id=" + user_id +
                ", ticket_id=" + ticket_id +
                ", user_seats=" + user_seats +
                ", busname='" + busname + '\'' +
                ", busno='" + busno + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
