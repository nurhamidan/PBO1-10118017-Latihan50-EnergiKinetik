package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class main untuk class EnergiKinetik.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EnergiKinetik energiKinetik = new EnergiKinetik();
        energiKinetik.setMassaBenda(145d / 1000d);
        energiKinetik.setKecepatan(25);
        
        System.out.println("Energi Kinetiknya : " + energiKinetik.hitungEnergiKinetik() + " Joule");
        System.out.println("Usaha agar mencapai " + energiKinetik.getKecepatan() + " m/s dari keadaan diam : " + energiKinetik.hitungUsaha() + " Joule");
    }
    
}
