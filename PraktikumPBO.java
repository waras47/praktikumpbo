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
public class PraktikumPBO {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner masukan = new Scanner(System.in);
        int nilai;
        System.out.println("Masukkan nilai akhir mata kuliahnya :");
        nilai = masukan.nextInt();
        if (nilai < 55){
            System.out.println("Mahasiswa tersebut tidak Lulus");
            
        }else{
            System.out.println("Mahasiswa tersebut Lulus");
        }
            
            
        }
        
    }
  
