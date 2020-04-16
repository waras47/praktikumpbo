
import java.util.Scanner;
public class tugas_2 { 
    public static void main(String[] args) {
        //object 
        Scanner masukkan = new Scanner (System.in);     
        System.out.print("masukkan jumlah orang yang diukur berat badannya: ");
//        object
        int  jml = masukkan.nextInt();
        for (int i=1;i<=jml;i++){
       
            System.out.print(+1+"."+"masukkan nama: ");
            String nama =  masukkan.next();
            
            System.out.print("masukkan berat(KG): ");
            int berat =  masukkan.nextInt();
            
            System.out.print("masukkan tinggi(Meter): ");
            int tinggi =  masukkan.nextInt();
            

            
            int imt;
            imt = berat/tinggi;

            if(imt>=30){
                System.out.println(nama+" kamu Obesitas");
            }else if(imt>25 && imt<=30){
                System.out.println(nama+" kamu gemuk");
                
            }else if(imt>18.54 && imt<=25){
                System.out.println(nama+" kamu ideal");
                
            }else{
                System.out.println(nama+" kamu kurus");  
            }
                      
        }
    }
            
    
}
