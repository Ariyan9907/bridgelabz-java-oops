package com.src;

import java.util.ArrayList;

public class StockPortfolio {

    private ArrayList<Stock> stocks=new ArrayList<Stock>();

    public void addStock(Stock stock){
        stocks.add(stock);
    }

    public int calculateTotalValue(){
        int total=0;
        for(Stock stock:stocks){
           total+=stock.calculateStockValue();
        }

        return total;
    }

    public void printReport(){
        for(Stock stock:stocks){
            System.out.println("Stock Name:"+stock.getStockName());
            System.out.println("No Of Shares:"+stock.getNumberOfShares());
            System.out.println("Shares Price:"+stock.calculateStockValue());
            System.out.println("Total Value"+calculateTotalValue());
        }
    }

}
