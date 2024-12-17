   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.lesson5;

import java.math.BigDecimal;
import java.util.Calendar;

public enum KyHan {
    MOT_TUAN {
        public Calendar ngayDaoHan(Calendar c) {
            c.add(6, 7);
            return c;
        }

        public BigDecimal tinhTien(BigDecimal tien) {
            return tien.multiply(new BigDecimal(0.005)).divide(new BigDecimal(12)).divide(new BigDecimal(4));
        }
    },
    MOT_THANG {
        public Calendar ngayDaoHan(Calendar c) {
            c.add(2, 1);
            return c;
        }

        public BigDecimal tinhTien(BigDecimal tien) {
            return tien.multiply(new BigDecimal(0.045)).divide(new BigDecimal(12));
        }
    },
    MOT_NAM {
        public Calendar ngayDaoHan(Calendar c) {
            c.add(1, 1);
            return c;
        }

        public BigDecimal tinhTien(BigDecimal tien) {
            return tien.multiply(new BigDecimal(0.068));
        }
    };

    private KyHan() {  
    }

    public abstract Calendar ngayDaoHan(Calendar c);

    public abstract BigDecimal tinhTien(BigDecimal tien);
}