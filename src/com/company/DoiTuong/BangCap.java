package com.company.DoiTuong;

public class BangCap {
    private int mabangcap;
    private String mota;

    public BangCap(int mabangcap, String mota) {
        this.mabangcap = mabangcap;
        this.mota = mota;
    }

    public int getMabangcap() {
        return mabangcap;
    }

    public void setMabangcap(int mabangcap) {
        this.mabangcap = mabangcap;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
    @Override
    public String toString(){
        return mabangcap+"|"+mota;
    }
}
