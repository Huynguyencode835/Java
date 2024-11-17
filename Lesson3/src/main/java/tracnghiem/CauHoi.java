/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tracnghiem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class CauHoi {
    private static final int slc =4; 
    private String cauHoi;
    private List<String> luaChon= new ArrayList<>();
    private String dapAn;

    public CauHoi(String cauHoi, String dapAn, String... lc) {
        this.cauHoi = cauHoi;
        this.dapAn = dapAn;
        this.luaChon.addAll(Arrays.asList(lc));
    }
    
    public void them(String... lc){
        this.luaChon.addAll(Arrays.asList(lc));
    }
    
    public void hienThi(){
        System.out.println("==========");
        System.out.println(this.cauHoi);
        for(var x:this.luaChon){
            System.out.println(x);
        }
        System.out.println(this.dapAn);
        System.out.println("==========");
    }
    
    public boolean isKiemTra(String c){
        return this.luaChon.equals(c);
    }

    public static int getSlc() {
        return slc;
    }

    public String getCauHoi() {
        return cauHoi;
    }

    public void setCauHoi(String cauHoi) {
        this.cauHoi = cauHoi;
    }

    public List<String> getLuaChon() {
        return luaChon;
    }

    public void setLuaChon(List<String> luaChon) {
        this.luaChon = luaChon;
    }

    public String getDapAn() {
        return dapAn;
    }

    public void setDapAn(String dapAn) {
        this.dapAn = dapAn;
    }
    
}
