package payroll.controller;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;

import payroll.model.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class TestController {

    /*@PostMapping("/tests")
    Test newTest(@RequestBody Test newTest) {
        return repository.save(newTest);
    }

    @GetMapping("/tests/{id}")
    TestModel<Test> one(@PathVariable Long id) {

        Test test = repository.findById(id)
                .orElseThrow(() -> new TestNotFoundException(id));

        return assembler.toModel(test);
    }

    @GetMapping("/tests")
    CollectionModel<EntityModel<Test>> all() {

        List<EntityModel<Test>> tests = repository.findAll().stream()
                .map(assembler::toModel)
                .collect(Collectors.toList());

        return new CollectionModel<>(tests,
                linkTo(methodOn(TestController.class).all()).withSelfRel());
    }

    @DeleteMapping("/tests/{id}")
    void deleteTest(@PathVariable Long id) {
        repository.deleteById(id);
    }*/
    @GetMapping("/hello2")
    String hello() {
        return "УРАА2";
    }

}
