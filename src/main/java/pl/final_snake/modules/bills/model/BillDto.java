package pl.final_snake.modules.bills.model;

public class BillDto {

    private Long accountId;
    private boolean profitOrLoss;
    private BillDetails billDetails;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public boolean isProfitOrLoss() {
        return profitOrLoss;
    }

    public void setProfitOrLoss(boolean profitOrLoss) {
        this.profitOrLoss = profitOrLoss;
    }

    public BillDetails getBillDetails() {
        return billDetails;
    }

    public void setBillDetails(BillDetails billDetails) {
        this.billDetails = billDetails;
    }
}
