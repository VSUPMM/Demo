package payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import payroll.model.Test;

interface TestRepository extends JpaRepository<Test, Long> {

}