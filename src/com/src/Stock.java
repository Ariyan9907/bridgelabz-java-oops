package com.src;

public class Stock {
    private String stockName;
    private int numberOfShares;
    private int sharePrice;

    public Stock(String stockName, int numberOfShares, int sharePrice) {
        this.stockName = stockName;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    public String getStockName() {
        return stockName;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public int calculateStockValue(){
        return numberOfShares*sharePrice;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockName='" + stockName + '\'' +
                ", numberOfShares=" + numberOfShares +
                ", sharePrice=" + sharePrice +
                '}';
    }
}
