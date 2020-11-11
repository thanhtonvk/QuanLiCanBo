package com.company.DoiTuong;

public class PhongBan {
    private int maphongban;
    private String tenphong;
    private String sodienthoai;
    private String diachi;

    public int getMaphongban() {
        return maphongban;
    }

    public void setMaphongban(int maphongban) {
        this.maphongban = maphongban;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public PhongBan(int maphongban, String tenphong, String sodienthoai, String diachi) {
        this.maphongban = maphongban;
        this.tenphong = tenphong;
        this.sodienthoai = sodienthoai;
        this.diachi = diachi;
    }
    @Override
    public String toString(){
        return maphongban+"#"+tenphong+"#"+sodienthoai+"#"+diachi;
    }
}
