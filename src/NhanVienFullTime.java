public class NhanVienFullTime extends NhanVien {
    private double luongCoBan;
    private double tienThuong;

    public NhanVienFullTime(String maNV, String tenNV, double luongCoBan, double tienThuong) {
        super(maNV, tenNV);
        this.luongCoBan = luongCoBan;
        this.tienThuong = tienThuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + tienThuong;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("--- [Full-time] ---");
        super.hienThiThongTin();
        System.out.printf("Lương cơ bản: %.0f | Tiền thưởng: %.0f\n", luongCoBan, tienThuong);
    }
}
