package payroll.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "PracticalTask")
public class PracticalTask extends AbstractTask {

    @Column(name = "rightQuery")
    String rightQuery;

    @Column(name = "userQuery")
    String userQuery;

    public PracticalTask(String rightQuery, String userQuery) {
        this.rightQuery = rightQuery;
        this.userQuery = userQuery;
    }

    public PracticalTask() {
    }
}
