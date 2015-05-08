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
public class App5 implements Serializable {
    
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
    
    @Column(name="tabNomber")
    String tabNomber;
    
    @Column(name="phone")
    String phobe;
    
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

    public String getTabNomber() {
        return tabNomber;
    }

    public void setTabNomber(String tabNomber) {
        this.tabNomber = tabNomber;
    }

    public String getPhobe() {
        return phobe;
    }

    public void setPhobe(String phobe) {
        this.phobe = phobe;
    }
    
    
    
}
