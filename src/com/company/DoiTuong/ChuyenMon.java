package com.company.DoiTuong;

public class ChuyenMon {
    private int machuyenmon;
    private String mota;

    public int getMachuyenmon() {
        return machuyenmon;
    }

    public void setMachuyenmon(int machuyenmon) {
        this.machuyenmon = machuyenmon;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public ChuyenMon(int machuyenmon, String mota) {
        this.machuyenmon = machuyenmon;
        this.mota = mota;
    }
    @Override
    public String toString (){
        return machuyenmon+"|"+mota;
    }
}
