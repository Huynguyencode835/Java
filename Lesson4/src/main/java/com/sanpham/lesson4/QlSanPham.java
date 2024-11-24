/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sanpham.lesson4;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QlSanPham {
    private List<SanPham> ds =new ArrayList<>();;
    
    public void them(SanPham ... sp){
        this.ds.addAll(Arrays.asList(sp));
    }
    
    public void hienThi(){
        this.ds.forEach(x->x.hienThi());
    }
}
