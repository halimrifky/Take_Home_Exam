package MainPackage;
/**@author Halim*/
public class Member {
    private String kodeMember;
    private String nama;
    private int point;

    public Member(String kodeMember, String nama) {
        this.kodeMember = kodeMember;
        this.nama = nama;
        this.point = 0;
    }

    public void addPoint(int transaksiAmount) {
        int newPoint = transaksiAmount / 10000;
        this.point += newPoint;
        System.out.println("Point ditambahkan: " + newPoint);
    }

    public void ambilHadiah(Hadiah hadiah) {
        if (point >= hadiah.getPointDibutuhkan()) {
            point -= hadiah.getPointDibutuhkan();
            System.out.println("Hadiah " + hadiah.getNamaHadiah() + " berhasil ditukarkan!");
        } else {
            System.out.println("Point tidak cukup untuk menukarkan hadiah " + hadiah.getNamaHadiah() + ".");
        }
    }

    public String getKodeMember() {
        return kodeMember;
    }

    public String getNama() {
        return nama;
    }

    public int getPoint() {
        return point;
    }
}
