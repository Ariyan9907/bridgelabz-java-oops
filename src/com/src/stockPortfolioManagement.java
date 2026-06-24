package com.src;

import java.util.Scanner;

public class stockPortfolioManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StockPortfolio stockPortfolio = new StockPortfolio();
        System.out.print("Enter the number of stockes:");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            System.out.println("Stock "+i+":");
            System.out.println("Enter Stock name:");
            String stockName=sc.nextLine();
            System.out.println("Enter number of stocks");
            int numberOfShares=sc.nextInt();
            System.out.println("Enter stock price");
            int sharePrice=sc.nextInt();
            sc.nextLine();
            Stock stock = new Stock(stockName, numberOfShares, sharePrice);
            stockPortfolio.addStock(stock);

        }

        stockPortfolio.printReport();


    }
}
