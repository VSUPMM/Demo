package payroll.controller;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import payroll.excpection.TaskNotFoundException;
import payroll.model.AbstractTask;
import payroll.repository.AbstractTaskRepository;

import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TaskController {
    
    @Autowired
    private AbstractTaskRepository repository;
    private TaskAssembler assembler;
    
    @PostMapping("/task")
    ResponseEntity<?> newAbstractTask(@RequestBody AbstractTask newAbstractTask) {
      /*  AbstractTask t = new AbstractTask(new ArrayList<String>() {{ add("A"); add("B"); add("C"); }},
                new ArrayList<String>() {{ add("1"); add("2"); add("3"); }},
                new ArrayList<String>() {{ add("A1"); add("B2"); add("C3"); }})*/

        EntityModel<AbstractTask> entityModel = assembler.toModel(repository.save(newAbstractTask));

        return ResponseEntity
                .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri())
                .body(entityModel);
    }

    @GetMapping("/task/{id}")
    EntityModel<AbstractTask> one(@PathVariable Long id) {

        AbstractTask task = repository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException(id));

        return assembler.toModel(task);
    }

    @GetMapping("/hello")
    String hello() {
        return "УРАА";
    }


    @GetMapping("/tasks")
    CollectionModel<EntityModel<AbstractTask>> all() {
        List<EntityModel<AbstractTask>> tasks = repository.findAll().stream()
                .map(assembler::toModel)
                .collect(Collectors.toList());

        return new CollectionModel<>(tasks,
                linkTo(methodOn(TaskController.class).all()).withSelfRel());
    }

    @PutMapping("/tasks/{id}")
    ResponseEntity<?> replaceAbstractTask(@RequestBody AbstractTask newAbstractTask, @PathVariable Long id) throws URISyntaxException {

        AbstractTask updatedAbstractTask = repository.findById(id)
                .map(task -> {
                    task.setQuestion(newAbstractTask.getQuestion());
                    task.setValue(newAbstractTask.getValue());
                    return repository.save(task);
                })
                .orElseGet(() -> {
                    newAbstractTask.setId(id);
                    return repository.save(newAbstractTask);
                });

        EntityModel<AbstractTask> entityModel = assembler.toModel(updatedAbstractTask);

        return ResponseEntity
                .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri())
                .body(entityModel);
    }

    @DeleteMapping("/task/{id}")
    ResponseEntity<Object> deleteAbstractTask(@PathVariable Long id) {

        repository.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}
