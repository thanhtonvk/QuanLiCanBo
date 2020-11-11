package com.company.DoiTuong;

public class ChucVu {
    private int machucvu;
    private String mota;

    public ChucVu(int machucvu, String mota) {
        this.machucvu = machucvu;
        this.mota = mota;
    }

    public int getMachucvu() {
        return machucvu;
    }

    public void setMachucvu(int machucvu) {
        this.machucvu = machucvu;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
    @Override
    public String toString(){
        return machucvu+"|"+mota;
    }
}
