package payroll.excpection;

public class TaskNotFoundException extends RuntimeException{
    public TaskNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
