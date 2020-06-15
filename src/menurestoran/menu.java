/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menurestoran;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class menu {
    public static void main(String[] args) {
        String ulg = "y";
        while(ulg.equals("y")){
            System.out.println("");
            Scanner input=new Scanner (System.in);
            String ul="",lagi;
            System.out.println("**********selamat datang**********");
            System.out.println("");
            System.out.println("    menu utama  ");
            System.out.println("1. luas persegi panjang");
            System.out.println("2. luas lingkaran");
            System.out.println("3. luas segitiga");
            System.out.println("4. keluar");
            System.out.println("=====================================");
            System.out.println("pilihan [1/2/3/4] = ");
            int pilih = input.nextInt();
            System.out.println("=====================================");
            switch(pilih){
                case 1 :{
                   // Scanner input = new Scanner (System.in);
                    System.out.println(" MENGHITUNG LUAS PERSEGI PANJANG ");
                    System.out.println("masukkan panjang : ");
                    int d =input.nextInt();
                    System.out.println("masukkan lebar : ");
                    int e =input.nextInt();
                    int z =d*e;
                    System.out.println("=================================");
                    System.out.println("luas persegi panjang = "+z);
                    break;
                }
                case 2 :{
                    double f,y;
                    System.out.println(" MENGHIYUNG LUAS LINGKARAN ");
                    System.out.println("masukkan jari-jari :");
                    f=input.nextInt();
                    y=22/7*f*f;
                    System.out.println("===========================");
                    System.out.println("luas lingkaran = "+y);
                    break;
                }
                case 3 :{
                    System.out.println(" MENGHITUNG LUAS SEGITIGA");
                    System.out.println("masukkan alas : ");
                    double f=input.nextInt();
                    System.out.println("masukkan tinggi : ");
                    double g=input.nextInt();
                    double y =(f*g)/2;
                    System.out.println("=========================");
                    System.out.println("");
                    System.out.println("luas segitiga = "+y);
                    break;
                    
                }
                case 4:{
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("WARNING !!! PILIHAN TIDAK TERSEDIA!!");
                break;
            }
            System.out.println("============================================");
            System.out.println("apakah anda ingin mengulang (y/t)?");
            ulg=input.next();
        }
    }
}
