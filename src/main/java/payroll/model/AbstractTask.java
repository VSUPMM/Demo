package payroll.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "AbstractTask")
public class AbstractTask {

    private @Id @GeneratedValue Long  id;

    @Column(name = "question")
    private String question;

    @Column(name = "value")
    private Integer value;

    public AbstractTask(String question, Integer value) {
        this.question = question;
        this.value = value;
    }

    public AbstractTask() {
    }
}
