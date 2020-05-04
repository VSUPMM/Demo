package payroll.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "User")
public class User {
    private @Id @GeneratedValue Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "passward")
    private String passward;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "course")
    private Integer course;

    @Column(name = "group")
    private Long group;

    public User() {
    }

    public User(String login, String passward, String name, String surname, String patronymic, Integer course, Long group) {
        this.login = login;
        this.passward = passward;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.course = course;
        this.group = group;
    }
}
