public class Kolcsonzok {
    private int id;
    private String nev;
    private String szulIdo;

    public Kolcsonzok(int id, String nev, String szulIdo) {
        this.id = id;
        this.nev = nev;
        this.szulIdo = szulIdo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getSzulIdo() {
        return szulIdo;
    }

    public void setSzulIdo(String szulIdo) {
        this.szulIdo = szulIdo;
    }
}
