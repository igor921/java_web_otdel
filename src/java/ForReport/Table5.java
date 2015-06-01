package ForReport;


public class Table5 {
    private int id;
    private String theme;
    private String podrazdelemie;
    private int count;
    private String building;
    private String info;

    public Table5(int id, String theme, String podrazdelemie, int count, String building, String info) {
        this.id = id;
        this.theme = theme;
        this.podrazdelemie = podrazdelemie;
        this.count = count;
        this.building = building;
        this.info = info;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getPodrazdelemie() {
        return podrazdelemie;
    }

    public void setPodrazdelemie(String podrazdelemie) {
        this.podrazdelemie = podrazdelemie;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
    
}
