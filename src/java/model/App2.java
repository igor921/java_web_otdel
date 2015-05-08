package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "app1")
public class App2 implements Serializable {
    
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="id")
    int id;

    @Column(name="fio")
    String fio;
    
    @Column(name="ownerid")
    int ownerid;

    public int getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(int ownerid) {
        this.ownerid = ownerid;
    }
    
    @Column(name="dolzhTabNumber")
    String dolzhTabNumber;
    
    @Column(name="birthDate")
    String birthDate;
    
    @Column(name="education")
    String education;
    
    @Column(name="qualificationDegree")
    String qualificationDegree;
    
    @Column(name="qualificationDegreeTheme")
    String qualificationDegreeTheme;
    
    @Column(name="qualificationDegreeBuild")
    String qualificationDegreeBuild;
    
    @Column(name = "monthDegree")
    String monthDegree;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getDolzhTabNumber() {
        return dolzhTabNumber;
    }

    public void setDolzhTabNumber(String dolzhTabNumber) {
        this.dolzhTabNumber = dolzhTabNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getQualificationDegree() {
        return qualificationDegree;
    }

    public void setQualificationDegree(String qualificationDegree) {
        this.qualificationDegree = qualificationDegree;
    }

    public String getQualificationDegreeTheme() {
        return qualificationDegreeTheme;
    }

    public void setQualificationDegreeTheme(String qualificationDegreeTheme) {
        this.qualificationDegreeTheme = qualificationDegreeTheme;
    }

    public String getQualificationDegreeBuild() {
        return qualificationDegreeBuild;
    }

    public void setQualificationDegreeBuild(String qualificationDegreeBuild) {
        this.qualificationDegreeBuild = qualificationDegreeBuild;
    }

    public String getMonthDegree() {
        return monthDegree;
    }

    public void setMonthDegree(String monthDegree) {
        this.monthDegree = monthDegree;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
