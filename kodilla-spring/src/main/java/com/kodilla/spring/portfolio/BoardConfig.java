package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("ToDoList")
    TaskList toDoList;

    @Autowired
    @Qualifier("InProgressList")
    TaskList inProgressList;

    @Autowired
    @Qualifier("DoneList")
    TaskList doneList;

    @Bean(name = "ToDoList")
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean(name = "InProgressList")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name = "DoneList")
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList();
    }

    @Bean
    Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }
}
