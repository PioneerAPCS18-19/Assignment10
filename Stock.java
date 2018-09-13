/**
 * This class represents a stock on the stock market.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Stock
{
    private String symbol;
    private String name;
    private double hiPrice;  // all-time high price
    private double loPrice;  // all-time low price
    private double currentPrice;
    private double prevPrice;  // price of this Stock yesterday
    private int daysSinceIPO;  // days since first day on market

    /**
     * Constructor: initialize ALL class variables (7).
     *
     * @param name, symbol, currentPrice
     */
    public Stock(String n, String s, double price)
    {
        // add your implementation here...
    }


    /**
     * Name: getPercChange
     * Visibility: private
     * @param none
     * @return the percent change from prevPrice to currentPrice (as a decimal)
     */
     // add your implementation here...





    /**
     * Name: runDay
     * Visibility: public
     * @param none
     * @return none
     *
     * Updates the price, updates the hi and lo prices, increments the daysSinceIPO by one (add one)
     */
     // add your implementation here...









    /* DO NOT CHANGE ANY CODE BELOW THIS LINE */


    /**
     * Name: printInfo
     * Visibility: public
     * @param none
     * @return none
     *
     * Prints the info about this Stock to the console.
     */
    public void printInfo()
    {
        System.out.println(name + "(" + symbol + ")");
        System.out.println("Opening price: " + (Math.round(prevPrice * 100.0) / 100.0));
        System.out.println("Closing price: " + (Math.round(currentPrice * 100.0) / 100.0));
        System.out.println("Percent change: " + (Math.round(getPercChange() * 10000.0) / 100.0) + "%");
        System.out.println("All-time high: " + (Math.round(hiPrice * 100.0) / 100.0));
        System.out.println("All-time low: " + (Math.round(loPrice * 100.0) / 100.0));
        System.out.println("Days since IPO: " + daysSinceIPO + "\n\n");
    }

    /**
     * Name: updatePrice
     * Visibility: private
     * @param none
     * @return none
     *
     * Updates the price of this Stock.
     */
    private void updatePrice()
    {
        prevPrice = currentPrice;
        double chance = Math.random();

        if(chance < 0.1)
        {
            double inc = 1.0 + Math.random() / 8.0 + 0.08;
            currentPrice *= inc;
        }

        else if(chance < 0.55)
        {
            double inc = 1.0 + Math.random() / 10.0;
            currentPrice *= inc;
        }

        else if(chance < 0.9)
        {
            double dec = Math.random() / 10.0 + 0.9;
            currentPrice *= dec;
        }

        else
        {
            double dec = Math.random() / 8.0 + (7.0/8.0);
            currentPrice *= dec;
        }
    }

    /**
     * Name: updateHiLo
     * Visibility: private
     * @param none
     * @return none
     *
     * Updates the hi and lo all-time prices of this Stock (if necessary).
     */
    private void updateHiLo()
    {
        if(currentPrice > hiPrice)
        {
            hiPrice = currentPrice;
        }

        else if(currentPrice < loPrice)
        {
            loPrice = currentPrice;
        }
    }
}

