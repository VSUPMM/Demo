package payroll.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "TestTask")
public class TestTask extends AbstractTask {
    @Column(name = "answers")
    private List<String> answers;

    @Column(name = "rightAnswer")
    private List<String> rightAnswer;

    @Column(name = "userAnswer")
    private List<String> userAnswer;

    public TestTask(){};

    public TestTask(List<String> answers, List<String> rightAnswer, List<String> userAnswer) {
        this.answers = answers;
        this.rightAnswer = rightAnswer;
        this.userAnswer = userAnswer;
    }

}
