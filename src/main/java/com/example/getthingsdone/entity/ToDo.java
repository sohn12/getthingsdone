package com.example.getthingsdone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long taskId;
    private String taskName;
    private Boolean isDone;

    private Date createdDate;

    public ToDo(Long taskId, String taskName, Boolean isDone, Date createdDate) {
        this.taskId = taskId;
        this.createdDate = createdDate;
        this.isDone = isDone;
        this.taskName = taskName;
    }

    public ToDo() {
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }
}
