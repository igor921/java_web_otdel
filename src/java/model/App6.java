package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "app6")
public class App6 implements Serializable {
    
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="id")
    int id;

    @Column(name="ownerid")
    int ownerid;
    
    @Column(name="fio")
    String fio;
    
    @Column(name="dolzhnost")
    String dolzhnost;
    
    @Column(name="education")
    String education;
    
    @Column(name="specialityShifr")
    String specialityShifr;
    
    @Column(name="getDate")
    String getDate;
    
    @Column(name="leaveYear")
    int leaveYear;
    
    @Column(name="educationForm")
    String educationForm;
    
    
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

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSpecialityShifr() {
        return specialityShifr;
    }

    public void setSpecialityShifr(String specialityShifr) {
        this.specialityShifr = specialityShifr;
    }

    public String getGetDate() {
        return getDate;
    }

    public void setGetDate(String getDate) {
        this.getDate = getDate;
    }

    public int getLeaveYear() {
        return leaveYear;
    }

    public void setLeaveYear(int leaveYear) {
        this.leaveYear = leaveYear;
    }

    public String getEducationForm() {
        return educationForm;
    }

    public void setEducationForm(String educationForm) {
        this.educationForm = educationForm;
    }

    
    
}
