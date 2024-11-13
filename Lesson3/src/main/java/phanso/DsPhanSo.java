/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phanso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class DsPhanSo {
    private List<PhanSo> ds = new ArrayList<>();
    
    public void them(PhanSo... a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    public void them(PhanSo a){
        this.ds.add(a);
    }
    
    public void them(){
        PhanSo a = new PhanSo();
        a.nhap1Ps();
        this.ds.add(a);
    }
    
    public void xoaPhanSo(PhanSo a){
        this.ds.removeIf(p->p.soSanh(a)==0);
    }
    
    public void xoaPhanSo(int tu,int mau){
        this.xoaPhanSo(new PhanSo(tu,mau));
    }
    
    public PhanSo tinhTongPs(){
        return this.ds.stream().reduce(new PhanSo(),(t,x)->t.congPhanSo(x));
    }
    
    public PhanSo timMax(){
        return this.ds.stream().max((t,x)->t.soSanh(x)).get();
    }
    
    public void sapXep(){
        this.ds.sort((t,x)->t.soSanh(x));
    }
    
    public void hienThi(){
        this.ds.forEach(x->x.hienThi());
    }
}
