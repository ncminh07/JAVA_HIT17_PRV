package student;

public class Car{
    private String MaOTo; //alt insert
    private String HangXe;
    private String BienSo;

    public Car(String maOTo, String bienSo, String hangXe) {
        MaOTo = maOTo;
        BienSo = bienSo;
        HangXe = hangXe;
    }

    public String getMaOTo() {
        return MaOTo;
    }

    public void setMaOTo(String maOTo) {
        this.MaOTo = maOTo;
    }

    public String getBienSo() {
        return BienSo;
    }

    public void setBienSo(String bienSo) {
        this.BienSo = bienSo;
    }

    public String getHangXe() {
        return HangXe;
    }

    public void setHangXe(String hangXe) {
        this.HangXe = hangXe;
    }


}
