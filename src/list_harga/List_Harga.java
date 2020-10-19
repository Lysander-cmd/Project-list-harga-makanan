
package list_harga;

import java.util.Scanner;


public class List_Harga {

    
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        int a, b, c, d;
        
      String[] Makanan = {"Nasi Goreng","Bakso","Rujak","Gado Gado","Soto"};
      int[] harga = {10000,8000,8000,10000,9000};
      
      System.out.println("Selamat Datang di Kantin");
      System.out.println("Berikut List Makanan :");
      for(int i = 0;i < harga.length;i++){
          System.out.println(i+"."+Makanan[i]+" => "+harga[i]);
      }
      System.out.print("Silakan Pilih Makanan apa yang mau dipesan :");
      a = input.nextInt();
      System.out.print("input pilihan :"+Makanan[a]);
      System.out.print("\n");
      System.out.print("Jumlah :");
      c = input.nextInt();
      d = (harga[a]*c);
      System.out.print("Silakan Masukan uang anda Rp:");
      b = input.nextInt();
      
      if(b > harga[a]){
          System.out.print("Kembalian Rp:"+(b-d));
      }else if (b == harga[a]){
          System.out.print("Selamat Menikmati Rp:");
      }else if (b < harga[a]){
          System.out.print("Uang anda kurang Rp:"+(d-b));
      }else{
          System.out.print("Erorr");
      }
    }
    
}
