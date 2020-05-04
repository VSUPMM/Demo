package payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

interface OrderRepository extends JpaRepository<Order, Long> {

    @SpringBootApplication
    class PayrollApplication {

        public static void main(String... args) {
            SpringApplication.run(PayrollApplication.class, args);
        }
    }
}