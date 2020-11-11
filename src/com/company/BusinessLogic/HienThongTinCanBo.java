package com.company.BusinessLogic;

import com.company.DoiTuong.BangCap;
import com.company.DoiTuong.CanBo;
import com.company.DoiTuong.ChucVu;
import com.company.DoiTuong.ChuyenMon;

import java.util.ArrayList;

public class HienThongTinCanBo {
    public void HienAllCanBo(ArrayList<CanBo>canBos,ArrayList<BangCap>bangCaps, ArrayList<ChucVu>chucVus, ArrayList<ChuyenMon>chuyenMons){
        System.out.printf("|%-10s|%-20s|%-20s|%-20|%-20|-20s|-20s|\n","ID","Họ tên","Ngày sinh","Giới tính","Địa chỉ","Số điện thoại","Phòng ban");
        for (CanBo canBo:canBos
             ) {
            HienCanBo(canBo,bangCaps,chucVus,chuyenMons);
        }
    }
//    Id+"#"+hoten+"#"+ngaysinh+"#"+gioitinh+"#"+diachi+"#"+sodienthoai+"#"+maphongban
    public void HienCanBo(CanBo canBo, ArrayList<BangCap>bangCaps, ArrayList<ChucVu>chucVus, ArrayList<ChuyenMon>chuyenMons){
        System.out.printf("|%-10s|%-20s|%-20s|%-20|%-20|-20s|-20s|\n",canBo.getId(),canBo.getHoten(),canBo.getNgaysinh(),canBo.getGioitinh(),canBo.getDiachi(),canBo.getSodienthoai(),canBo.getPhongBans());
        System.out.printf("|%-10|%-20|\n","Mã","Mô tả");
        HienBangCap(bangCaps);
        System.out.printf("|%-10|%-20|\n","Mã","Mô tả");
        HienChucVu(chucVus);
        System.out.printf("|%-10|%-20|\n","Mã","Mô tả");
        HienChuyenMon(chuyenMons);
    }
    public void HienBangCap(ArrayList<BangCap>bangCaps){
        for (BangCap bangCap:bangCaps
             ) {
            System.out.printf("|%-10|%-20|\n",bangCap.getMabangcap(),bangCap.getMota());
        }
    }
    public void HienChucVu(ArrayList<ChucVu>chucVus){
        for(ChucVu chucVu: chucVus){
            System.out.printf("|%-10|%-20|\n",chucVu.getMachucvu(),chucVu.getMota());
        }
    }
    public void HienChuyenMon(ArrayList<ChuyenMon>chuyenMons){
        for(ChuyenMon chuyenMon:chuyenMons){
            System.out.printf("|%-10|%-20|\n");
        }
    }
}
