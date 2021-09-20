package dev.abdhir.models;

import java.time.LocalDate;
import java.util.Objects;

//classes are PascalCase
public class Task {

    //fields/methods are camelCase
    private String taskName;
    boolean isCompleted;
    String description;
    LocalDate dueDate;

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

    public String getTaskName(){
        return this.taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public boolean isCompleted(){
        return this.isCompleted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return isCompleted == task.isCompleted && Objects.equals(taskName, task.taskName) && Objects.equals(description, task.description) && Objects.equals(dueDate, task.dueDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, isCompleted, description, dueDate);
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", isCompleted=" + isCompleted +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                '}';
    }
}
