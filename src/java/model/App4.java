package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "app4")
public class App4 implements Serializable {
    
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="id")
    int id;

    @Column(name="ownerid")
    int ownerid;
    
    @Column(name="fio")
    String fio;
    
    @Column(name="tabNum")
    String tabNum;
    
    @Column(name="dolzhnost")
    String dolzhnost;
    
    @Column(name="birthDate")
    String birthDate;
    
    @Column(name="getsDate")
    String getsDate;
    
    @Column(name="universityName")
    String universityName;
    
    @Column(name="universitygetDate")
    String universitygetDate;
    
    @Column(name="kurs")
    String kurs;
    
    @Column(name="speciality")
    String speciality;
    
    @Column(name="someinfo")
    String someinfo;
    
    @Column(name="universityEndDate")
    String universityEndDate;
    
    @Column(name="eduType")
    String eduType;
    
    @Column(name="phone")
    String phone;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(int ownerid) {
        this.ownerid = ownerid;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getDolzhnost() {
        return dolzhnost;
    }

    public void setDolzhnost(String dolzhnost) {
        this.dolzhnost = dolzhnost;
    }

    public String getTabNum() {
        return tabNum;
    }

    public void setTabNum(String tabNum) {
        this.tabNum = tabNum;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGetsDate() {
        return getsDate;
    }

    public void setGetsDate(String getsDate) {
        this.getsDate = getsDate;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversitygetDate() {
        return universitygetDate;
    }

    public void setUniversitygetDate(String universitygetDate) {
        this.universitygetDate = universitygetDate;
    }

    public String getKurs() {
        return kurs;
    }

    public void setKurs(String kurs) {
        this.kurs = kurs;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getSomeinfo() {
        return someinfo;
    }

    public void setSomeinfo(String someinfo) {
        this.someinfo = someinfo;
    }

    public String getUniversityEndDate() {
        return universityEndDate;
    }

    public void setUniversityEndDate(String universityEndDate) {
        this.universityEndDate = universityEndDate;
    }

    public String getEduType() {
        return eduType;
    }

    public void setEduType(String eduType) {
        this.eduType = eduType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    
}
