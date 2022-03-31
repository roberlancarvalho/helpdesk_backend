package com.tecnorth.helpdesk.domain;

import com.tecnorth.helpdesk.domain.enums.Priority;
import com.tecnorth.helpdesk.domain.enums.Status;
import org.aspectj.weaver.ast.Call;

import java.time.LocalDate;
import java.util.Objects;

public class Called extends People {

    private Integer id;
    private LocalDate dateOpen = LocalDate.now();
    private LocalDate dateClosed;
    private Priority priority;
    private Status status;
    private String title;
    private String observations;
    private Technician technician;
    private Client client;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals( o )) return false;
        Called called = (Called) o;
        return id.equals( called.id );
    }

    @Override
    public int hashCode() {
        return Objects.hash( super.hashCode(), id );
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDateOpen() {
        return dateOpen;
    }

    public void setDateOpen(LocalDate dateOpen) {
        this.dateOpen = dateOpen;
    }

    public LocalDate getDateClosed() {
        return dateClosed;
    }

    public void setDateClosed(LocalDate dateClosed) {
        this.dateClosed = dateClosed;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Called() {
        super();
    }

    public Called(Integer id, Priority priority, Status status, String title, String observations, Technician technician, Client client) {
        this.id = id;
        this.priority = priority;
        this.status = status;
        this.title = title;
        this.observations = observations;
        this.technician = technician;
        this.client = client;
    }

}
