package com.company.DoiTuong;

import java.util.ArrayList;

public class CanBo {
    private int Id;
    private String hoten,ngaysinh,gioitinh,diachi,sodienthoai;
    //sử dụng arraylist để lưu thuộc tính đa trị
    private ArrayList<BangCap>bangCaps;
    private int maphongban;
    private ArrayList<ChuyenMon>chuyenMons;
    private ArrayList<ChucVu>chucVus;

    public CanBo(int id, String hoten, String ngaysinh, String gioitinh, String diachi, String sodienthoai, ArrayList<BangCap> bangCaps, int phongban, ArrayList<ChuyenMon> chuyenMons, ArrayList<ChucVu> chucVus) {
        Id = id;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.sodienthoai = sodienthoai;
        this.bangCaps = bangCaps;
        this.maphongban = phongban;
        this.chuyenMons = chuyenMons;
        this.chucVus = chucVus;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public ArrayList<BangCap> getBangCaps() {
        return bangCaps;
    }

    public void setBangCaps(ArrayList<BangCap> bangCaps) {
        this.bangCaps = bangCaps;
    }

    public int getPhongBans() {
        return maphongban;
    }

    public void setPhongBans(int maphongban) {
        this.maphongban = maphongban;
    }

    public ArrayList<ChuyenMon> getChuyenMons() {
        return chuyenMons;
    }

    public void setChuyenMons(ArrayList<ChuyenMon> chuyenMons) {
        this.chuyenMons = chuyenMons;
    }

    public ArrayList<ChucVu> getChucVus() {
        return chucVus;
    }

    public void setChucVus(ArrayList<ChucVu> chucVus) {
        this.chucVus = chucVus;
    }
    //sử dụng để  lưu vào file
    @Override
    public String toString(){
        String mabangcap = "";
        for (BangCap bangcap:bangCaps
             ) {
            mabangcap+=bangcap.toString()+"%";
        }
        String machuyenmon = "";
        for(ChuyenMon chuyenMon: chuyenMons){
            machuyenmon +=chuyenMon.toString()+"%";
        }
        String machucvu = "";
        for (ChucVu chucvu:chucVus
             ) {
            machucvu+=chucvu.toString()+"%";
        }
        return Id+"#"+hoten+"#"+ngaysinh+"#"+gioitinh+"#"+diachi+"#"+sodienthoai+"#"+maphongban+"#"+mabangcap+"#"+machuyenmon+"#"+machucvu;
    }
}
