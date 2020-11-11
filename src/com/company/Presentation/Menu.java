package com.company.Presentation;

import com.company.BusinessLogic.ChucNang;
import com.company.BusinessLogic.HienThongTinCanBo;
import com.company.BusinessLogic.HienThongTinPhongBan;
import com.company.BusinessLogic.NhapThongTin;
import com.company.DataAccess.DocGhiFile;
import com.company.DoiTuong.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Scanner;

public class Menu {
    public static void Menu() {
        System.out.println("_________________________________________________________________________________");
        System.out.println("|                         PHẦN MỀM QUẢN LÝ CÁN BỘ                               |");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("_________________________________________________________________________________");
        System.out.println("|                         1.Nhập thông tin cán bộ                               |");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("_________________________________________________________________________________");
        System.out.println("|                         2.Nhập thông tin phòng ban                            |");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("_________________________________________________________________________________");
        System.out.println("|                         3.Hiện thông tin cán bộ                               |");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("_________________________________________________________________________________");
        System.out.println("|                         4.Hiên thông tin phòng ban                            |");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("_________________________________________________________________________________");
        System.out.println("|                         5.Sửa thông tin cán bộ                                |");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("_________________________________________________________________________________");
        System.out.println("|                         6.Xóa thông tin cán bộ                                |");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("_________________________________________________________________________________");
        System.out.println("|                         7.Sửa thông tin phòng ban                             |");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("_________________________________________________________________________________");
        System.out.println("|                         8.Xóa thông tin phòng ban                             |");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("_________________________________________________________________________________");
        System.out.println("|                         9.Thoát                                              |");
        System.out.println("---------------------------------------------------------------------------------");
    }

    public static void Run() throws IOException {
        ArrayList<BangCap> bangCaps = new ArrayList<>();
        ArrayList<CanBo> canBos = new ArrayList<>();
        ArrayList<ChucVu> chucVus = new ArrayList<>();
        ArrayList<ChuyenMon> chuyenMons = new ArrayList<>();
        ArrayList<PhongBan> phongBans = new ArrayList<>();
        ChucNang chucNang = new ChucNang();
        HienThongTinCanBo hienThongTinCanBo = new HienThongTinCanBo();
        HienThongTinPhongBan hienThongTinPhongBan = new HienThongTinPhongBan();
        NhapThongTin nhapThongTin = new NhapThongTin();
        DocGhiFile docGhiFile = new DocGhiFile();
        docGhiFile.DocFileCanBo(canBos, bangCaps, chuyenMons, chucVus);
        docGhiFile.DocFilePhongBan(phongBans);
        int chon;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu();
            System.out.println("Chọn chức năng");
            chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                    nhapThongTin.NhapCanBo(canBos, chucVus, chuyenMons, bangCaps);
                    docGhiFile.GhiFileCanBo(canBos);
                    break;
                case 2:
                    nhapThongTin.NhapPhongBan(phongBans);
                    docGhiFile.DocFilePhongBan(phongBans);
                    break;
                case 3:
                    hienThongTinCanBo.HienAllCanBo(canBos,bangCaps,chucVus,chuyenMons);
                    break;
                case 4:
                    hienThongTinPhongBan.HienAllPhongBan(phongBans);
                    break;
                case 5:
                    hienThongTinCanBo.HienAllCanBo(canBos,bangCaps,chucVus,chuyenMons);
                    chucNang.SuaCanBo(canBos,bangCaps,chuyenMons,chucVus);
                    docGhiFile.GhiFileCanBo(canBos);
                    break;
                case 6:
                    hienThongTinCanBo.HienAllCanBo(canBos,bangCaps,chucVus,chuyenMons);
                    chucNang.XoaCanBo(canBos);
                    docGhiFile.GhiFileCanBo(canBos);
                    break;
                case 7:
                    hienThongTinPhongBan.HienAllPhongBan(phongBans);
                    chucNang.SuaPhongBan(phongBans);
                    docGhiFile.DocFilePhongBan(phongBans);
                case 8:
                    hienThongTinPhongBan.HienAllPhongBan(phongBans);
                    chucNang.XoaPhongBan(phongBans);
                    docGhiFile.DocFilePhongBan(phongBans);
                default:
                    break;
            }
        }
    }
}
