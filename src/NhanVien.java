public abstract class NhanVien {
    private String maNV;
    private String tenNV;

    public NhanVien(String maNV, String tenNV) {
        this.maNV = maNV;
        this.tenNV = tenNV;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public abstract double tinhLuong();

    public void hienThiThongTin() {
        System.out.printf("Mã NV: %s | Tên NV: %s | Lương: %.0f\n", maNV, tenNV, tinhLuong());
    }
}
