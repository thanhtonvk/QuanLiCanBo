package com.company.BusinessLogic;

import com.company.DoiTuong.PhongBan;

import java.util.ArrayList;

public class HienThongTinPhongBan {
//    maphongban+"#"+tenphong+"#"+sodienthoai+"#"+diachi
    public void PhongBan(PhongBan phongBan){
        System.out.printf("|%-10s|%-20s|%-20s|%-20s|\n",phongBan.getMaphongban(),phongBan.getTenphong(),phongBan.getSodienthoai(),phongBan.getDiachi());
    }
    public void HienAllPhongBan(ArrayList<PhongBan>phongBans){
        System.out.printf("|%-10s|%-20s|%-20s|%-20s|","Mã phòng ban","Tên phòng","Số điện thoại","Địa chỉ");
        for (PhongBan phongBan:phongBans
             ) {
            PhongBan(phongBan);
        }
    }
}

