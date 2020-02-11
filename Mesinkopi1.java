
package mesinkopi1;
import java.util.Scanner;
import java.util.ArrayList;
public class Mesinkopi1 {
    

    
    public static void main(String[] args) {
        Mesinkopi1 lala = new Mesinkopi1();
        lala.menuutama();
    }
    public void Awalsangatnih(){
        ArrayList<Kopi1>dinda=new ArrayList();
        Scanner w = new Scanner(System.in);
        Kopi1 arabica = new Kopi1();
        Kopi1 robusta = new Kopi1();
        Kopi1 flores = new Kopi1();
        
        arabica.setNamaKopi("Arabica");
        arabica.setAsalKopi("Timur Tengah");
        dinda.add(arabica);
        
        robusta.setNamaKopi("Robusta");
        robusta.setAsalKopi("Eropa");
        dinda.add(robusta);
        
        flores.setNamaKopi("Flores");
        flores.setAsalKopi("Asia");
        dinda.add(flores);
        
        System.out.println("Menu Kopi");
         for(int i=0; i<dinda.size();i++){
                int j= i+1;
                System.out.println(+ j + " " + dinda.get(i).getNamaKopi());
         }
         try{
            dinda.size();
            System.out.println("Masukkan Pilihan Anda : ");
            int pilihkopi = w.nextInt()-1;
            System.out.println("Pesanan Kopi Anda Adalah "  +dinda.get(pilihkopi).getNamaKopi() + " Asal Kopi Dari " + dinda.get(pilihkopi).getAsalKopi() );
              menuutama();
         }catch(Exception e){  
             System.out.println("Inputan Salah ");
            
            
         }
        
    }
     public void MenuAwal(){
        System.out.println("Selamat Datang di Kedai Kopi");
        System.out.println("jeniskopi\t\t Asal");
        System.out.println("1. Arabika \t\t Timur Tengah");
        System.out.println("2. Robusta\t\t Eropa");
        System.out.println("3. Flores\t\t Asia");
        menuutama();
        
        
    }
     void menuutama(){
         Scanner y = new Scanner(System.in);
        System.out.println("Selamat Datang di Kedai Kopi Rania");
        System.out.println("1. Menu Utama ");
        System.out.println("2. Pesana Kopi");
        System.out.println("3. Keluar");
        System.out.println("Silahkan Anda Memilih : ");
        String milih=y.next();
        switch(milih){
            case "1":
                MenuAwal();
                break;
            case "2":
                Awalsangatnih();
                break;
            case "3":
                System.exit(0);
                break;
            default :
                menuutama();
                
        }
     }
    
}
