package payroll.controller;


import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;
import payroll.model.AbstractTask;

@Component
class TaskAssembler implements RepresentationModelAssembler<AbstractTask, EntityModel<AbstractTask>> {

    @Override
    public EntityModel<AbstractTask> toModel(AbstractTask task) {

        return new EntityModel<>(task,
                linkTo(methodOn(TaskController.class).one(task.getId())).withSelfRel(),
                linkTo(methodOn(TaskController.class).all()).withRel("employees"));
    }
}