package pl.final_snake.modules.bills.model;

import pl.final_snake.modules.accounts.model.Account;
import pl.final_snake.modules.bills.model.additional.PaymentType;
import pl.final_snake.modules.payer.model.Payer;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "bills")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date created;
    @ManyToOne
    private Account account;
    private PaymentType type;
    @ManyToOne
    private Payer payer;
    @OneToMany (mappedBy = "bill", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<BillDetails> billDetails = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public PaymentType getType() {
        return type;
    }

    public void setType(PaymentType type) {
        this.type = type;
    }

    public Payer getPayer() {
        return payer;
    }

    public void setPayer(Payer payer) {
        this.payer = payer;
    }

    public List<BillDetails> getBillDetails() {
        return billDetails;
    }

    public void setBillDetails(List<BillDetails> billDetails) {
        this.billDetails = billDetails;
    }

    public BigDecimal getBillValue(){
        BigDecimal sum = new BigDecimal(0);
        for (BillDetails bd : billDetails){
            sum.add(bd.getValue());
        }

        return sum;
    }
}
