package payroll.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TestResult")
public class TestResult {

    @Column(name = "cntTasksDone")
    private Integer cntTasksDone;

    @Column(name = "resultMark")
    private Integer resultMark;

    public TestResult(Integer cntTasksDone, Integer resultMark) {
        this.cntTasksDone = cntTasksDone;
        this.resultMark = resultMark;
    }

    public TestResult() {
    }
}
