package mdat.animallists;

public class DongVat {
    private String tenDongVat;
    private String loai;
    private int idAnh;

    public DongVat(String tenDongVat, String loai, int idAnh) {
        this.tenDongVat = tenDongVat;
        this.loai = loai;
        this.idAnh = idAnh;
    }

    public String getTenDongVat() {
        return tenDongVat;
    }

    public void setTenDongVat(String tenDongVat) {
        this.tenDongVat = tenDongVat;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getIdAnh() {
        return idAnh;
    }

    public void setIdAnh(int idAnh) {
        this.idAnh = idAnh;
    }
}
