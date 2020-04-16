/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;

public class ifelsebertingkat {
       public static void main(String[] args) {
            Scanner masukan = new Scanner(System.in);
      
       System.out.print("masukkan jumlah mahasiswa yang ingin dinilai: ");
//        object
        int  jml = masukan.nextInt();
        for (int i=0;i<=jml;i++){  //memasukkan nilai secara berulang  
           
       
        int nilai;
        System.out.println("Masukkan nilai akhir mata kuliahnya :");
        nilai = masukan.nextInt();
     
        if (nilai >= 80)
            System.out.println("nilainya A");
            
        else if(nilai >= 70)
            System.out.println("nilainya B");
        
         else if(nilai >= 55)
            System.out.println("nilainya C");
        
         else if(nilai >= 40)
            System.out.println("nilainya D");
        
         else 
            System.out.println("nilainya E"); 
          
       
     
            
        }
        
       }
    
}
