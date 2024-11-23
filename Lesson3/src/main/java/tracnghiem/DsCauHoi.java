/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tracnghiem;

import static com.mycompany.lesson3.CauHinh.sc;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class DsCauHoi {

    private List<CauHoi> ds = new ArrayList<>();

    public DsCauHoi() {
    }

    public void them(String duongDan) throws FileNotFoundException {
        File f = new File(duongDan);
        try ( Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                String cauHoi = sc.nextLine();
                List<String> luaChon = new ArrayList<>();
                for (int i = 0; i < CauHoi.getSlc(); i++) {
                    if (sc.hasNextLine()) {
                        luaChon.add(sc.nextLine());
                    }
                }
                String dapAn = sc.nextLine();
                this.ds.add(new CauHoi(cauHoi, dapAn, luaChon.toArray(new String[0])));
            }
        }
    }

    public void tracNghiem(int sl) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < sl && !ds.isEmpty();i++) {
            int index = random.nextInt(sl);
            this.ds.get(index);
            this.ds.get(index).hienThi();
            String c = sc.nextLine();
            while (this.ds.get(index).isKiemTra(c) == false) {
                System.out.println("Moi Chon Lai");
                c = sc.nextLine();
            }
            this.ds.remove(this.ds.get(index));
        }
    }

    public void hienThi() {
        this.ds.forEach(x -> x.hienThi());
    }
}
