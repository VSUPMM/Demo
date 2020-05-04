package payroll.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import payroll.model.AbstractTask;


public interface AbstractTaskRepository extends JpaRepository<AbstractTask, Long>  {


}