package ru.netology.domain;

import java.util.Objects;

public class Ticket implements Comparable<Ticket> {
    private int id;
    private String from;
    private String to;
    private int price;
    private int time;

    public Ticket(int id, String from, String to, int price, int time) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.price = price;
        this.time = time;
    }

    public Ticket() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket product = (Ticket) o;
        return id == product.id && price == product.price && time == product.time && from.equals(product.from) && to.equals(product.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, from, to, price, time);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", price=" + price +
                ", time=" + time +
                '}';
    }

    @Override
    public int compareTo(Ticket o) {
        Ticket p = (Ticket) o;
        return this.price - p.price;
    }
}