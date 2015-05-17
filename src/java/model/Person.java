/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "person")
public class Person implements Serializable {
    
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="id")
    int id;
    
    @Column(name="fio")
    String fio;
    
    @Column(name="birthDate")
    String birthDate;
    
    @Column(name="sexType")
    String sexType;
    
    @Column(name="dolzhnost")
    String dolzhnost;
    
    @Column(name="otdel")
    String otdel;

    @Column(name="studentGetDate")
    String studentGetDate;
    @Column(name="studentLeaveUnDate")
    String studentLeaveUnDate;
    
    @Column(name="studentKurs")
    String studentKurs;
    
    @Column(name="studentspeciality")
    String studentspeciality;
    
    @Column(name="phone")
    String phone;
    
    @Column(name="education")
    String education;
    
    @Column(name="persontype")
    String persontype = "worker";
    
    @Column(name="theme")
    String theme;
    
    @Column(name="educationLongTyme")
    String educationLongTyme;
    
    @Column(name="price")
    int price;
    
    @Column(name="workerForEduGrow")
    String workerForEduGrow;

    public String getSexType() {
        return sexType;
    }

    public void setSexType(String sexType) {
        this.sexType = sexType;
    }

    public String getOtdel() {
        return otdel;
    }

    public void setOtdel(String otdel) {
        this.otdel = otdel;
    }

    public String getStudentGetDate() {
        return studentGetDate;
    }

    public void setStudentGetDate(String studentGetDate) {
        this.studentGetDate = studentGetDate;
    }

    public String getStudentLeaveUnDate() {
        return studentLeaveUnDate;
    }

    public void setStudentLeaveUnDate(String studentLeaveUnDate) {
        this.studentLeaveUnDate = studentLeaveUnDate;
    }

    public String getStudentKurs() {
        return studentKurs;
    }

    public void setStudentKurs(String studentKurs) {
        this.studentKurs = studentKurs;
    }

    public String getStudentspeciality() {
        return studentspeciality;
    }

    public void setStudentspeciality(String studentspeciality) {
        this.studentspeciality = studentspeciality;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPersontype() {
        return persontype;
    }

    public void setPersontype(String persontype) {
        this.persontype = persontype;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getEducationLongTyme() {
        return educationLongTyme;
    }

    public void setEducationLongTyme(String educationLongTyme) {
        this.educationLongTyme = educationLongTyme;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getWorkerForEduGrow() {
        return workerForEduGrow;
    }

    public void setWorkerForEduGrow(String workerForEduGrow) {
        this.workerForEduGrow = workerForEduGrow;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getDolzhnost() {
        return dolzhnost;
    }

    public void setDolzhnost(String dolzhnost) {
        this.dolzhnost = dolzhnost;
    }
    
}
