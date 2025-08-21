class ProfitLoss {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;

        int profit = sellingPrice - costPrice;
        double profitPercent = (profit * 100.0) / costPrice;

        System.out.println(
            "Cost Price: " + costPrice + "\n" +
            "Selling Price: " + sellingPrice + "\n" +
            "Profit: " + profit + "\n" +
            "Profit Percentage: " + profitPercent + "%"
        );
    }
}
