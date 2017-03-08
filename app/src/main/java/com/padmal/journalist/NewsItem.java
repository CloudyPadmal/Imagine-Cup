package com.padmal.journalist;

/**
 * Created by Padmal on 3/8/17.
 */

public class NewsItem {

    private String newsHeader;
    private String newsBody;
    private String newsBy;
    private String topic;

    public String getNewsHeader() {
        return newsHeader;
    }

    public void setNewsHeader(String newsHeader) {
        this.newsHeader = newsHeader;
    }

    public String getNewsBody() {
        return newsBody;
    }

    public void setNewsBody(String newsBody) {
        this.newsBody = newsBody;
    }

    public String getNewsBy() {
        return newsBy;
    }

    public void setNewsBy(String newsBy) {
        this.newsBy = newsBy;
    }
}
