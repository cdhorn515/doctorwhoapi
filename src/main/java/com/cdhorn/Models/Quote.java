package com.cdhorn.Models;

import org.springframework.data.annotation.Id;

public class Quote {

    @Id
    public Long id;

    public int doctor;
    public String quote;

    public Quote(int doctor, String quote) {
        this.doctor = doctor;
        this.quote = quote;
    }

    public int getDoctor() {
        return doctor;
    }

    public String getQuote() {
        return quote;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", doctor= number '" + doctor + '\'' +
                ", quote='" + quote + '\'' +
                '}';
    }
}
