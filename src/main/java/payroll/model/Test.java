package payroll.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Data
@Entity
@Table(name = "Test")
public class Test {

    private @Id @GeneratedValue Long id;

    @Column(name = "name")
    private String name;

    public Test(String name) {
        this.name = name;
    }

    public Test() {
    }
}
