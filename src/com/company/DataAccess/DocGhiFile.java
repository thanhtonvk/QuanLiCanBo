package com.company.DataAccess;

import com.company.DoiTuong.*;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

public class DocGhiFile {
    public void GhiFilePhongBan(ArrayList<PhongBan>phongBans){
        try {
            File file = new File("phongban.txt");
            if (!file.exists()) {
                file.getParentFile().mkdir();
                Files.createFile(file.toPath());
            }
            FileWriter fileWriter = new FileWriter(file);
            for (PhongBan phongBan:phongBans
            ) {
                fileWriter.write(phongBan.toString()+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void DocFilePhongBan(ArrayList<PhongBan>phongBans) throws IOException {
        FileReader fileReader = new FileReader("phongban.txt");
       BufferedReader bufferedReader = new BufferedReader(fileReader);
       String line;
       while((line = bufferedReader.readLine())!=null){
           //maphongban+"#"+tenphong+"#"+sodienthoai+"#"+diachi
           int maphongban = Integer.parseInt(line.split("#")[0]);
           String tenphong = line.split("#")[1];
           String sodienthoai = line.split("#")[2];
           String diachi = line.split("#")[3];
           phongBans.add(new PhongBan(maphongban,tenphong,sodienthoai,diachi));
       }
       bufferedReader.close();
       fileReader.close();

    }
    public void GhiFileCanBo(ArrayList<CanBo>canBos) {
        try {
            File file = new File("canbo.txt");
            if (!file.exists()) {
                file.getParentFile().mkdir();
                Files.createFile(file.toPath());
            }
            FileWriter fileWriter = new FileWriter(file);
            for (CanBo canBo:canBos
                 ) {
                fileWriter.write(canBo.toString()+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void DocFileCanBo(ArrayList<CanBo> canBos, ArrayList<BangCap> bangCaps, ArrayList<ChuyenMon> chuyenMons, ArrayList<ChucVu> chucVus) throws IOException {

        FileReader fileReader = new FileReader("canbo.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
//        Id+"#"+hoten+"#"+ngaysinh+"#"+gioitinh+"#"+diachi+"#"+sodienthoai+"#"+maphongban+"#"+mabangcap+"#"+machuyenmon+"#"+machucvu;
        while ((line = bufferedReader.readLine()) != null) {
            //tách chuỗi để lưu vào ArrayList
            int Id = Integer.parseInt(line.split("#")[0]);
            String hoten = line.split("#")[1];
            String ngaysinh = line.split("#")[2];
            String gioitinh = line.split("#")[3];
            String diachi = line.split("#")[4];
            String sodienthoai = line.split("#")[5];
            int maphongban = Integer.parseInt(line.split("#")[6]);
            String mabangcap = line.split("#")[7];
            String machuyenmon = line.split("#")[8];
            String machucvu = line.split("#")[9];
            for (int i = 0; i < mabangcap.split("%").length; i++) {
                bangCaps.add(new BangCap(Integer.parseInt(mabangcap.split("%")[i].split("|")[0]), mabangcap.split("%")[i].split("|")[1]));
            }
            for (int i = 0; i < machuyenmon.split("%").length; i++) {
                chuyenMons.add(new ChuyenMon(Integer.parseInt(machuyenmon.split("%")[i].split("|")[0]), machuyenmon.split("%")[i].split("|")[1]));
            }
            for (int i = 0; i < machucvu.split("%").length; i++) {
                chucVus.add(new ChucVu(Integer.parseInt(machucvu.split("%")[i].split("|")[0]), machucvu.split("%")[i].split("|")[1]));
            }

            canBos.add(new CanBo(Id, hoten, ngaysinh, gioitinh, diachi, sodienthoai, bangCaps, maphongban, chuyenMons, chucVus));
        }
        bufferedReader.close();
        fileReader.close();
    }
}
