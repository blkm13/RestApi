package com.second_srv.restapi.data;

public class Request {
    private String ticker;
    private Long revenue;
    private Long shares;
    private Long assets;


    public Request(String ticker, Long revenue, Long shares, Long assets) {
        this.ticker = ticker;
        this.revenue = revenue;
        this.shares = shares;
        this.assets = assets;
    }


    public String getTicker() {
        return ticker;
    }

    public Long getRevenue() {
        return revenue;
    }

    public Long getShares() {
        return shares;
    }

    public Long getAssets() {
        return assets;
    }


}
