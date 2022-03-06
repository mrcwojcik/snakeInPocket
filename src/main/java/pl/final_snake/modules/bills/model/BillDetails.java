package pl.final_snake.modules.bills.model;

import com.sun.xml.bind.v2.TODO;
import pl.final_snake.modules.category.model.Category;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "billDetails")
public class BillDetails {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Category category;
    private BigDecimal value;
    @ManyToOne
    private Bill bill;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
