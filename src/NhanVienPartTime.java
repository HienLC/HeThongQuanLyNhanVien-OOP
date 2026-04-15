public class NhanVienPartTime extends NhanVien {
    private int soGioLam;
    private double luongTheoGio;

    public NhanVienPartTime(String maNV, String tenNV, int soGioLam, double luongTheoGio) {
        super(maNV, tenNV);
        this.soGioLam = soGioLam;
        this.luongTheoGio = luongTheoGio;
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }

    public double getLuongTheoGio() {
        return luongTheoGio;
    }

    public void setLuongTheoGio(double luongTheoGio) {
        this.luongTheoGio = luongTheoGio;
    }

    @Override
    public double tinhLuong() {
        return soGioLam * luongTheoGio;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("--- [Part-time] ---");
        super.hienThiThongTin();
        System.out.printf("Số giờ làm: %d | Lương theo giờ: %.0f\n", soGioLam, luongTheoGio);
    }
}
