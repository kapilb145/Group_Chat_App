package com.google.firebase.kapil.friendlychat;

public class StudentData {
    private String studentName;
    private String studentclass;
    private String studentDob;
    private String father;
    private String studentSchoolName;
    private String TotalFees;
    private String lastPayout;
    private String remainingFees;

    public StudentData(String studentName, String studentclass, String studentDob, String father, String studentSchoolName, String totalFees, String lastPayout, String remainingFees) {
        this.studentName = studentName;
        this.studentclass = studentclass;
        this.studentDob = studentDob;
        this.father = father;
        this.studentSchoolName = studentSchoolName;
        TotalFees = totalFees;
        this.lastPayout = lastPayout;
        this.remainingFees = remainingFees;
    }


    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getTotalFees() {
        return TotalFees;
    }

    public void setTotalFees(String totalFees) {
        TotalFees = totalFees;
    }

    public String getLastPayout() {
        return lastPayout;
    }

    public void setLastPayout(String lastPayout) {
        this.lastPayout = lastPayout;
    }

    public String getRemainingFees() {
        return remainingFees;
    }

    public void setRemainingFees(String remainingFees) {
        this.remainingFees = remainingFees;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentclass() {
        return studentclass;
    }

    public void setStudentclass(String studentclass) {
        this.studentclass = studentclass;
    }

    public String getStudentDob() {
        return studentDob;
    }

    public void setStudentDob(String studentDob) {
        this.studentDob = studentDob;
    }

    public String getStudentSchoolName() {
        return studentSchoolName;
    }

    public void setStudentSchoolName(String studentSchoolName) {
        this.studentSchoolName = studentSchoolName;
    }
}
