package MainPackage;
/** @author Halim */
public class Hadiah {
    private int nomor;
    private String namaHadiah;
    private int pointDibutuhkan;

    public Hadiah(int nomor, String namaHadiah, int pointDibutuhkan) {
        this.nomor = nomor;
        this.namaHadiah = namaHadiah;
        this.pointDibutuhkan = pointDibutuhkan;
    }

    public int getNomor() {
        return nomor;
    }

    public String getNamaHadiah() {
        return namaHadiah;
    }

    public int getPointDibutuhkan() {
        return pointDibutuhkan;
    }
}

