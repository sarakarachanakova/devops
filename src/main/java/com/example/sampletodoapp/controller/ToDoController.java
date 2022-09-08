package com.example.sampletodoapp.controller;

import com.example.sampletodoapp.model.ToDo;
import com.example.sampletodoapp.repository.ToDoRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping(value = {"/", "/home"})
public class ToDoController {

    private ToDoRepo toDoRepo;

    public ToDoController (ToDoRepo toDoRepo) {
        this.toDoRepo = toDoRepo;
    }

    @GetMapping
    public String getAllToDos(Model model) {

        ArrayList<ToDo> todos = new ArrayList<>();
        todos.add(new ToDo(1, "Study."));
        todos.add(new ToDo(2, "Clean your room."));
        todos.add(new ToDo(3, "Make coffee."));

        model.addAttribute("todos", todos);
        return "ToDo";
    }
}
