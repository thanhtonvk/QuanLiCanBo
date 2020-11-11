package com.company.BusinessLogic;

import com.company.DoiTuong.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ChucNang {
    static Scanner scanner = new Scanner(System.in);
    public void ThemChucVu(ArrayList<CanBo>canBos, ArrayList<BangCap>bangCaps, ArrayList<ChuyenMon>chuyenMons, ArrayList<ChucVu>chucVus){

        System.out.println("Nhập id hoặc tên cán bộ cần thêm chức vụ");
        String tk = scanner.nextLine();
        boolean kt = false;
        for (int i = 0; i < canBos.size(); i++) {
            if(tk.equalsIgnoreCase(canBos.get(i).getHoten())||tk.equalsIgnoreCase(String.valueOf(canBos.get(i).getId()))){
//                Id+"#"+hoten+"#"+ngaysinh+"#"+gioitinh+"#"+diachi+"#"+sodienthoai+"#"+maphongban+"#"+mabangcap+"#"+machuyenmon+"#"+machucvu
                int id = canBos.get(i).getId();
                String hoten = canBos.get(i).getHoten();
                String ngaysinh = canBos.get(i).getNgaysinh();
                String gioitinh = canBos.get(i).getGioitinh();
                String diachi = canBos.get(i).getDiachi();
                String sodienthoai = canBos.get(i).getSodienthoai();
                int maphongban = canBos.get(i).getPhongBans();
                for (int j = 0; j < bangCaps.size(); j++) {
                    bangCaps.set(i,new BangCap(bangCaps.get(i).getMabangcap(),bangCaps.get(i).getMota()));
                }
                for (int j = 0; j < chuyenMons.size(); j++) {

                    chuyenMons.set(i,new ChuyenMon(chuyenMons.get(i).getMachuyenmon(),chuyenMons.get(i).getMota()));
                }
                for (int j = 0; j < chucVus.size(); j++) {
                   chucVus.add(new ChucVu(NhapThongTin.ma(),NhapThongTin.mota()));
                }
                canBos.set(i,new CanBo(id,hoten,ngaysinh,gioitinh,diachi,sodienthoai,bangCaps,maphongban,chuyenMons,chucVus));
                kt =true;
                System.out.println("sửa thành công");
            }
        }
        if(kt==false) System.out.println("KHông tìm thấy cán bộ");
    }
    public void SuaChucVu(ArrayList<CanBo>canBos, ArrayList<BangCap>bangCaps, ArrayList<ChuyenMon>chuyenMons, ArrayList<ChucVu>chucVus){

        System.out.println("Nhập id hoặc tên cán bộ cần thêm chức vụ");
        String tk = scanner.nextLine();
        boolean kt = false;
        for (int i = 0; i < canBos.size(); i++) {
            if(tk.equalsIgnoreCase(canBos.get(i).getHoten())||tk.equalsIgnoreCase(String.valueOf(canBos.get(i).getId()))){
//                Id+"#"+hoten+"#"+ngaysinh+"#"+gioitinh+"#"+diachi+"#"+sodienthoai+"#"+maphongban+"#"+mabangcap+"#"+machuyenmon+"#"+machucvu
                int id = canBos.get(i).getId();
                String hoten = canBos.get(i).getHoten();
                String ngaysinh = canBos.get(i).getNgaysinh();
                String gioitinh = canBos.get(i).getGioitinh();
                String diachi = canBos.get(i).getDiachi();
                String sodienthoai = canBos.get(i).getSodienthoai();
                int maphongban = canBos.get(i).getPhongBans();
                for (int j = 0; j < bangCaps.size(); j++) {
                    bangCaps.set(i,new BangCap(bangCaps.get(i).getMabangcap(),bangCaps.get(i).getMota()));
                }
                for (int j = 0; j < chuyenMons.size(); j++) {

                    chuyenMons.set(i,new ChuyenMon(chuyenMons.get(i).getMachuyenmon(),chuyenMons.get(i).getMota()));
                }
                for (int j = 0; j < chucVus.size(); j++) {
                    System.out.println("sửa chức vụ "+j+1);
                   chucVus.set(j,new ChucVu(NhapThongTin.ma(),NhapThongTin.mota()));
                }
                canBos.set(i,new CanBo(id,hoten,ngaysinh,gioitinh,diachi,sodienthoai,bangCaps,maphongban,chuyenMons,chucVus));
                kt =true;
                System.out.println("sửa thành công");
            }
        }
        if(kt==false) System.out.println("KHông tìm thấy cán bộ");
    }
    public void XoaPhongBan(ArrayList<PhongBan>phongBans){
        System.out.println("Nhập id hoặc tên phòng ban");
        String tk = scanner.nextLine();
        boolean kt = false;
        for (int i = 0; i < phongBans.size(); i++) {
            if(phongBans.get(i).getMaphongban()==Integer.parseInt(tk)||phongBans.get(i).getTenphong().equalsIgnoreCase(tk)){
                phongBans.remove(i);
                kt = true;
                System.out.println("xóa thành công");
            }
        }
        if(kt ==false) System.out.println("không tìm thấy phòng ban");
    }
    public void SuaPhongBan(ArrayList<PhongBan>phongBans){
        System.out.println("Nhập id hoặc tên phòng ban");
        String tk = scanner.nextLine();
        boolean kt = false;
        for (int i = 0; i < phongBans.size(); i++) {
            if(phongBans.get(i).getMaphongban()==Integer.parseInt(tk)||phongBans.get(i).getTenphong().equalsIgnoreCase(tk)){
                phongBans.set(i,new PhongBan(NhapThongTin.ma(),NhapThongTin.tenphong(),NhapThongTin.sodienthoai(),NhapThongTin.diachi()));
                kt = true;
                System.out.println("sửa  thành công");
            }
        }
        if(kt ==false) System.out.println("không tìm thấy phòng ban");
    }
    public void XoaCanBo(ArrayList<CanBo>canBos){
        System.out.println("Nhập id hoặc tên cán bộ cần xóa");
        String tk = scanner.nextLine();
        boolean kt = false;
        for (int i = 0; i < canBos.size(); i++) {
            if(tk.equalsIgnoreCase(canBos.get(i).getHoten())||tk.equalsIgnoreCase(String.valueOf(canBos.get(i).getId()))){
                kt = true;
                canBos.remove(i);
                System.out.println("xóa thành công");
            }
        }
        if(kt ==false) System.out.println("không tìm thấy cán bộ");
    }

    public void SuaCanBo(ArrayList<CanBo>canBos, ArrayList<BangCap>bangCaps, ArrayList<ChuyenMon>chuyenMons, ArrayList<ChucVu>chucVus){

        System.out.println("Nhập id hoặc tên cán bộ cần sửa");
        String tk = scanner.nextLine();
        boolean kt = false;
        for (int i = 0; i < canBos.size(); i++) {
            if(tk.equalsIgnoreCase(canBos.get(i).getHoten())||tk.equalsIgnoreCase(String.valueOf(canBos.get(i).getId()))){
//                Id+"#"+hoten+"#"+ngaysinh+"#"+gioitinh+"#"+diachi+"#"+sodienthoai+"#"+maphongban+"#"+mabangcap+"#"+machuyenmon+"#"+machucvu
//                Id+"#"+hoten+"#"+ngaysinh+"#"+gioitinh+"#"+diachi+"#"+sodienthoai+"#"+maphongban+"#"+mabangcap+"#"+machuyenmon+"#"+machucvu;
                int id = NhapThongTin.Id();
                String hoten = NhapThongTin.hoten();
                String ngaysinh = NhapThongTin.ngaysinh();
                String gioitinh = NhapThongTin.gioitinh();
                String diachi = NhapThongTin.diachi();
                String sodienthoai = NhapThongTin.sodienthoai();
                int maphongban = NhapThongTin.ma();
                for (int j = 0; j < bangCaps.size(); j++) {
                    System.out.println("Sửa bằng cấp "+j+1);
                    int mabangcap = NhapThongTin.ma();
                    String motabangcap = NhapThongTin.mota();
                    bangCaps.set(i,new BangCap(mabangcap,motabangcap));
                }
                for (int j = 0; j < chuyenMons.size(); j++) {
                    System.out.println("Sửa chuyên môn "+j+1);
                    int machuyenmon = NhapThongTin.ma();
                    String motachuyenmon = NhapThongTin.mota();
                    chuyenMons.set(i,new ChuyenMon(machuyenmon,motachuyenmon));
                }
                for (int j = 0; j < chucVus.size(); j++) {
                    System.out.println("Sửa chức vụ "+j+1);
                     int machucvu = NhapThongTin.ma();
                     String motachucvu = NhapThongTin.mota();
                     chucVus.set(i,new ChucVu(machucvu,motachucvu));
                }
                canBos.set(i,new CanBo(id,hoten,ngaysinh,gioitinh,diachi,sodienthoai,bangCaps,maphongban,chuyenMons,chucVus));
                kt =true;
                System.out.println("sửa thành công");
            }
        }
        if(kt==false) System.out.println("KHông tìm thấy cán bộ");
    }
}
