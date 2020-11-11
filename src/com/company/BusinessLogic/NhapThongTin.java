package com.company.BusinessLogic;

import com.company.DoiTuong.*;

import java.util.ArrayList;
import java.util.Scanner;

public class NhapThongTin {
    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<ChucVu> NhapChucVu(ArrayList<ChucVu>chucVus){
        chucVus.add(new ChucVu(ma(),mota()));
        return chucVus;
    }
    public static ArrayList<ChuyenMon> NhapChuyeMon(ArrayList<ChuyenMon>chuyenMons){
        chuyenMons.add(new ChuyenMon(ma(),mota()));
        return chuyenMons;
    }
    public static  ArrayList<BangCap> NhapBangCap(ArrayList<BangCap>bangCaps){
        bangCaps.add(new BangCap(ma(),mota()));
        return bangCaps;
    }
    public void NhapPhongBan(ArrayList<PhongBan>phongBans){
        phongBans.add(new PhongBan(ma(),tenphong(),sodienthoai(),diachi()));
    }
    public static String tenphong(){
        System.out.println("Nhập tên phòng");
        String str = scanner.nextLine();
        return str;
    }

//    int maphongban, String tenphong, String sodienthoai, String diachi
    public void NhapCanBo(ArrayList<CanBo>canBos,ArrayList<ChucVu>chucVus,ArrayList<ChuyenMon>chuyenMons,ArrayList<BangCap>bangCaps){
        canBos.add(new CanBo(Id(),hoten(),ngaysinh(),gioitinh(),diachi(),sodienthoai(),NhapBangCap(bangCaps),phongban(),NhapChuyeMon(chuyenMons),NhapChucVu(chucVus)));
    }
//    int id, String hoten, String ngaysinh, String gioitinh, String diachi, String sodienthoai, ArrayList<BangCap> bangCaps, String phongban, ArrayList<ChuyenMon> chuyenMons, ArrayList<ChucVu> chucVus
    public static int Id(){
        System.out.println("Nhập ID: ");
        int ma = Integer.parseInt(scanner.nextLine());
        return ma;
    }
    public static int phongban(){
        System.out.println("Nhập mã phòng ban ");
        int ma = Integer.parseInt(scanner.nextLine());
        return ma;
    }
    public static String sodienthoai(){
        System.out.println("Nhập số điện thoại ");
        String str = scanner.nextLine();
        return str;
    }
    public static String diachi(){
        System.out.println("Nhập địa chỉ ");
        String str = scanner.nextLine();
        return str;
    }
    public static String gioitinh(){
        System.out.println("Nhập giới tính ");
        String str = scanner.nextLine();
        return str;
    }
    public static String hoten(){
        System.out.println("Nhập họ tên ");
        String str = scanner.nextLine();
        return str;
    }
    public static String ngaysinh(){
        System.out.println("Nhập ngày sinh ");
        String str = scanner.nextLine();
        return str;
    }
    public static int ma(){
        System.out.println("Nhập mã");
        int machucvu =  Integer.parseInt(scanner.nextLine());
        return machucvu;
    }
    public  static String mota(){
        System.out.println("Nhập mô tả");
        String mota = scanner.nextLine();
        return mota;
    }
}
