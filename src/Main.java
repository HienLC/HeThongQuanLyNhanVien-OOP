import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<NhanVien> danhSachNV = new ArrayList<>();
        int luaChon = -1;

        while (luaChon != 0) {
            System.out.println("\n===== HỆ THỐNG QUẢN LÝ NHÂN VIÊN =====");
            System.out.println("1. Thêm Nhân viên Full-time");
            System.out.println("2. Thêm Nhân viên Part-time");
            System.out.println("3. Hiển thị thông tin và lương tất cả nhân viên");
            System.out.println("0. Thoát chương trình");
            System.out.print("Vui lòng chọn chức năng: ");
            
            try {
                luaChon = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số hợp lệ!");
                continue;
            }

            switch (luaChon) {
                case 1:
                    try {
                        System.out.println("\n--- Thêm Nhân viên Full-time ---");
                        System.out.print("Nhập Mã NV: ");
                        String maNV1 = scanner.nextLine();
                        System.out.print("Nhập Tên NV: ");
                        String tenNV1 = scanner.nextLine();
                        System.out.print("Nhập Lương cơ bản: ");
                        double luongCoBan = Double.parseDouble(scanner.nextLine());
                        System.out.print("Nhập Tiền thưởng: ");
                        double tienThuong = Double.parseDouble(scanner.nextLine());
                        
                        danhSachNV.add(new NhanVienFullTime(maNV1, tenNV1, luongCoBan, tienThuong));
                        System.out.println("Đã thêm thành công!");
                    } catch (NumberFormatException e) {
                        System.out.println("Lỗi: Lương và tiền thưởng phải là số!");
                    }
                    break;
                case 2:
                    try {
                        System.out.println("\n--- Thêm Nhân viên Part-time ---");
                        System.out.print("Nhập Mã NV: ");
                        String maNV2 = scanner.nextLine();
                        System.out.print("Nhập Tên NV: ");
                        String tenNV2 = scanner.nextLine();
                        System.out.print("Nhập Số giờ làm: ");
                        int soGioLam = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nhập Lương theo giờ: ");
                        double luongTheoGio = Double.parseDouble(scanner.nextLine());
                        
                        danhSachNV.add(new NhanVienPartTime(maNV2, tenNV2, soGioLam, luongTheoGio));
                        System.out.println("Đã thêm thành công!");
                    } catch (NumberFormatException e) {
                         System.out.println("Lỗi: Số giờ làm và lương theo giờ phải là số!");
                    }
                    break;
                case 3:
                    System.out.println("\n--- Danh sách Nhân viên ---");
                    if (danhSachNV.isEmpty()) {
                        System.out.println("Danh sách đang trống.");
                    } else {
                        for (NhanVien nv : danhSachNV) {
                            nv.hienThiThongTin();
                        }
                    }
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Chọn sai chức năng, vui lòng thử lại!");
            }
        }
        scanner.close();
    }
}
