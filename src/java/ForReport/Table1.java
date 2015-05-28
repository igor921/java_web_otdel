package ForReport;


public class Table1 {
   int id;
   String speciality;
   String podrazdelenie="основное подразд.";
   int count;
   String razryad;
   String povishRazryad;
   String srok;
   String eduBuild = "ОАО \"машиностроение\"";
   String info;

    public Table1(int id, String speciality, int count, String razryad, String srok, String info) {
        this.id = id;
        this.speciality = speciality;
        this.count = count;
        this.razryad = razryad;
        this.srok = srok;
        this.info = info;
    }

   
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getPodrazdelenie() {
        return podrazdelenie;
    }

    public void setPodrazdelenie(String podrazdelenie) {
        this.podrazdelenie = podrazdelenie;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getRazryad() {
        return razryad;
    }

    public void setRazryad(String razryad) {
        this.razryad = razryad;
    }

    public String getPovishRazryad() {
        return povishRazryad;
    }

    public void setPovishRazryad(String povishRazryad) {
        this.povishRazryad = povishRazryad;
    }

    public String getSrok() {
        return srok;
    }

    public void setSrok(String srok) {
        this.srok = srok;
    }

    public String getEduBuild() {
        return eduBuild;
    }

    public void setEduBuild(String eduBuild) {
        this.eduBuild = eduBuild;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
   
   
}
