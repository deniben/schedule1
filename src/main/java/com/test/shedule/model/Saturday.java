package com.test.shedule.model;

import javax.persistence.*;

@Entity
@Table(name = "saturday")
public class Saturday {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(mappedBy = "saturday")
    private Group group;

    private String firstLessonName;
    private String firstAudience;
    private String firstLecturer;
    private String secondLessonName;
    private String secondAudience;
    private String secondLecturer;
    private String thirdLessonName;
    private String thirdAudience;
    private String thirdLecturer;
    private String fourthLessonName;
    private String fourthAudience;
    private String fourthLecturer;
    private String fifthLessonName;
    private String fifthAudience;
    private String fifthLecturer;
    private String sixthLessonName;
    private String sixthAudience;
    private String sixthLecturer;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstLessonName() {
        return firstLessonName;
    }

    public void setFirstLessonName(String firstLessonName) {
        this.firstLessonName = firstLessonName;
    }

    public String getFirstAudience() {
        return firstAudience;
    }

    public void setFirstAudience(String firstAudience) {
        this.firstAudience = firstAudience;
    }

    public String getFirstLecturer() {
        return firstLecturer;
    }

    public void setFirstLecturer(String firstLecturer) {
        this.firstLecturer = firstLecturer;
    }

    public String getSecondLessonName() {
        return secondLessonName;
    }

    public void setSecondLessonName(String secondLessonName) {
        this.secondLessonName = secondLessonName;
    }

    public String getSecondAudience() {
        return secondAudience;
    }

    public void setSecondAudience(String secondAudience) {
        this.secondAudience = secondAudience;
    }

    public String getSecondLecturer() {
        return secondLecturer;
    }

    public void setSecondLecturer(String secondLecturer) {
        this.secondLecturer = secondLecturer;
    }

    public String getThirdLessonName() {
        return thirdLessonName;
    }

    public void setThirdLessonName(String thirdLessonName) {
        this.thirdLessonName = thirdLessonName;
    }

    public String getThirdAudience() {
        return thirdAudience;
    }

    public void setThirdAudience(String thirdAudience) {
        this.thirdAudience = thirdAudience;
    }

    public String getThirdLecturer() {
        return thirdLecturer;
    }

    public void setThirdLecturer(String thirdLecturer) {
        this.thirdLecturer = thirdLecturer;
    }

    public String getFourthLessonName() {
        return fourthLessonName;
    }

    public void setFourthLessonName(String fourthLessonName) {
        this.fourthLessonName = fourthLessonName;
    }

    public String getFourthAudience() {
        return fourthAudience;
    }

    public void setFourthAudience(String fourthAudience) {
        this.fourthAudience = fourthAudience;
    }

    public String getFourthLecturer() {
        return fourthLecturer;
    }

    public void setFourthLecturer(String fourthLecturer) {
        this.fourthLecturer = fourthLecturer;
    }

    public String getFifthLessonName() {
        return fifthLessonName;
    }

    public void setFifthLessonName(String fifthLessonName) {
        this.fifthLessonName = fifthLessonName;
    }

    public String getFifthAudience() {
        return fifthAudience;
    }

    public void setFifthAudience(String fifthAudience) {
        this.fifthAudience = fifthAudience;
    }

    public String getFifthLecturer() {
        return fifthLecturer;
    }

    public void setFifthLecturer(String fifthLecturer) {
        this.fifthLecturer = fifthLecturer;
    }

    public String getSixthLessonName() {
        return sixthLessonName;
    }

    public void setSixthLessonName(String sixthLessonName) {
        this.sixthLessonName = sixthLessonName;
    }

    public String getSixthAudience() {
        return sixthAudience;
    }

    public void setSixthAudience(String sixthAudience) {
        this.sixthAudience = sixthAudience;
    }

    public String getSixthLecturer() {
        return sixthLecturer;
    }

    public void setSixthLecturer(String sixthLecturer) {
        this.sixthLecturer = sixthLecturer;
    }
}
