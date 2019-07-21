package com.bressan.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class NewsChannel implements Observer {

    private String news;

    @Override
    public void update(Observable o, Object news) {
        this.setNews((String) news);
    }

    private void setNews(String news) {
        this.news = news;
    }

    public String getNews() {
        return news;
    }
}
