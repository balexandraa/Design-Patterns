package order;

import strategies.PayStrategy;

public class Order {
    private int totalCost = 0;
    private boolean isclosed = false;

    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
        // here we would collect and store payment data from the strategy
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public boolean isIsclosed() {
        return isclosed;
    }

    public void setIsclosed() {
        this.isclosed = true;
    }
}
