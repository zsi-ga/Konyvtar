public class Kolcsonzes {
    private int id;
    private int kolcsonzoId;
    private String iro;
    private String mufaj;
    private String cim;

    public Kolcsonzes(int id, int kolcsonzoId, String iro, String mufaj, String cim) {
        this.id = id;
        this.kolcsonzoId = kolcsonzoId;
        this.iro = iro;
        this.mufaj = mufaj;
        this.cim = cim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKolcsonzoId() {
        return kolcsonzoId;
    }

    public void setKolcsonzoId(int kolcsonzoId) {
        this.kolcsonzoId = kolcsonzoId;
    }

    public String getIro() {
        return iro;
    }

    public void setIro(String iro) {
        this.iro = iro;
    }

    public String getMufaj() {
        return mufaj;
    }

    public void setMufaj(String mufaj) {
        this.mufaj = mufaj;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }
}