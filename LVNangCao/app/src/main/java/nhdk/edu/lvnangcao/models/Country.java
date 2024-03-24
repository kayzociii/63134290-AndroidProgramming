package nhdk.edu.lvnangcao.models;

public class Country {
    String tenQG;
    int soLuongDan;
    String tenFileAnhLaCo;

    public Country(String tenQG, int soLuongDan, String tenFileAnhLaCo) {
        this.tenQG = tenQG;
        this.soLuongDan = soLuongDan;
        this.tenFileAnhLaCo = tenFileAnhLaCo;
    }

    public String getTenQG() {
        return tenQG;
    }

    public int getSoLuongDan() {
        return soLuongDan;
    }

    public String getTenFileAnhLaCo() {
        return tenFileAnhLaCo;
    }
}
