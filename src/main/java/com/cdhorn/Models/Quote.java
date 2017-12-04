package com.cdhorn.Models;

import org.springframework.data.annotation.Id;

public class Quote {

    @Id
    public Long id;

    public String episode;
    public String quote;

    public Quote(String episode, String quote) {
        this.episode = episode;
        this.quote = quote;
    }

    public String getEpisode() {
        return episode;
    }

    public String getQuote() {
        return quote;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", episode='" + episode + '\'' +
                ", quote='" + quote + '\'' +
                '}';
    }
}
