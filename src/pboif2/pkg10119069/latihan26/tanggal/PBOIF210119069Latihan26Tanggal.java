/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119069.latihan26.tanggal;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author 
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 * Deskripsi Program    : Program ini berisi program tanggal
 */
public class PBOIF210119069Latihan26Tanggal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date tanggal = new Date();
        
        SimpleDateFormat format = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss");
        System.out.println("Hari ini adalah hari : " + format.format(tanggal));
        
        System.out.println("-------------------------------------");
        System.out.println("Developed by : Tri Novarel Rahmadhani");
}
    
}
