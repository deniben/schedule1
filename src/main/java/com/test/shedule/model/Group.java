package com.test.shedule.model;

import javax.persistence.*;

@Entity
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long number;
    private String typeOfGroup;
    private String specialty;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "monday_id")
    private Monday monday;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "thuesday_id")
    private Thuesday thuesday;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "wednesday_id")
    private Wednesday wednesday;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "thursday_id")
    private Thursday thursday;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "friday_id")
    private Friday friday;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "saturday_id")
    private Saturday saturday;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getTypeOfGroup() {
        return typeOfGroup;
    }

    public void setTypeOfGroup(String typeOfGroup) {
        this.typeOfGroup = typeOfGroup;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Monday getMonday() {
        return monday;
    }

    public void setMonday(Monday monday) {
        this.monday = monday;
    }

    public Thuesday getThuesday() {
        return thuesday;
    }

    public void setThuesday(Thuesday thuesday) {
        this.thuesday = thuesday;
    }

    public Wednesday getWednesday() {
        return wednesday;
    }

    public void setWednesday(Wednesday wednesday) {
        this.wednesday = wednesday;
    }

    public Thursday getThursday() {
        return thursday;
    }

    public void setThursday(Thursday thursday) {
        this.thursday = thursday;
    }

    public Friday getFriday() {
        return friday;
    }

    public void setFriday(Friday friday) {
        this.friday = friday;
    }

    public Saturday getSaturday() {
        return saturday;
    }

    public void setSaturday(Saturday saturday) {
        this.saturday = saturday;
    }
}
