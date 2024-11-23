/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tracnghiem;

import java.io.FileNotFoundException;

/**
 *
 * @author ADMIN
 */
public class TracNghiem {
    public static void main(String[] args) throws FileNotFoundException {
        DsCauHoi ds = new DsCauHoi();
        ds.them("src/main/resources/cauhoi.txt");
        ds.tracNghiem(5);
    }
}
