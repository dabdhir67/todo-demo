package dev.abdhir;

import java.time.LocalDate;

//classes are PascalCase
public class Task {

    //fields/methods are camelCase
    String taskName;
    boolean isCompleted;
    String description;
    LocalDate date;

    public Task(){
        super();
    }

    public Task(String taskName){
        super();
        this.taskName = taskName;
    }

    public Task(String taskName, boolean isCompleted){
        super();
        this.taskName = taskName;
        this.isCompleted = isCompleted;
    }
}
