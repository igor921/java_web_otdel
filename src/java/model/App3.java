package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "app3")
public class App3 implements Serializable {
    
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
    
    @Column(name="newworkercount")
    String newworkercount;
    
    @Column(name="seconddolzhost")
    String seconddolzhost;
    
    @Column(name="drygieOrganiz")
    String drygieOrganiz;
    
    @Column(name="povishenieRazryadov")
    String povishenieRazryadov;
    
    @Column(name="alls")
    String alls;
  
    @Column(name="women")
    String women;
    
    @Column(name="eightennBelow")
    String eightennBelow;
    
    @Column(name="thirtyBelow")
    String thirtyBelow;
    
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

    public String getNewworkercount() {
        return newworkercount;
    }

    public void setNewworkercount(String newworkercount) {
        this.newworkercount = newworkercount;
    }

    public String getSeconddolzhost() {
        return seconddolzhost;
    }

    public void setSeconddolzhost(String seconddolzhost) {
        this.seconddolzhost = seconddolzhost;
    }

    public String getDrygieOrganiz() {
        return drygieOrganiz;
    }

    public void setDrygieOrganiz(String drygieOrganiz) {
        this.drygieOrganiz = drygieOrganiz;
    }

    public String getPovishenieRazryadov() {
        return povishenieRazryadov;
    }

    public void setPovishenieRazryadov(String povishenieRazryadov) {
        this.povishenieRazryadov = povishenieRazryadov;
    }

    public String getAlls() {
        return alls;
    }

    public void setAlls(String alls) {
        this.alls = alls;
    }

    public String getWomen() {
        return women;
    }

    public void setWomen(String women) {
        this.women = women;
    }

    public String getEightennBelow() {
        return eightennBelow;
    }

    public void setEightennBelow(String eightennBelow) {
        this.eightennBelow = eightennBelow;
    }

    public String getThirtyBelow() {
        return thirtyBelow;
    }

    public void setThirtyBelow(String thirtyBelow) {
        this.thirtyBelow = thirtyBelow;
    }

    
    
}
