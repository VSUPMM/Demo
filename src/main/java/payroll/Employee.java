package payroll;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/*
@Dataя вляется Ломбки аннотации , чтобы создать все геттеры, сеттер, equals, hash и toString методы,
основанные на полях.

@Entity является аннотацией JPA, чтобы сделать этот объект готовым для хранения в хранилище данных на основе JPA.

id, nameи role являются атрибутом для нашего доменного объекта, первый из которых помечен большим
количеством аннотаций JPA, чтобы указать, что это первичный ключ, и автоматически заполняется поставщиком JPA.

Пользовательский конструктор создается, когда нам нужно создать новый экземпляр, но у нас еще нет идентификатора.
*/
@Data
@Entity
class Employee {

    private @Id @GeneratedValue Long id;
    private String name;
    private String role;

    Employee() {}

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
}