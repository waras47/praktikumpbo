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
 
public class majemukbertingkat {
    public static void main(String[] args) {
            Scanner masukan = new Scanner(System.in);
      
       System.out.print("masukkan nilai matematikanya: ");
       int matematika = masukan.nextInt();
       
       System.out.print("masukkan nilai fisikanya: ");
       int fisika = masukan.nextInt();
       
       if ((matematika > 80) && (fisika > 70) )
        System.out.println("siswa tersebut DITERIMA");
       
        else 
        System.out.println("siswa tersebut TIDAK DITERIMA");
                
        
       }
    
}
