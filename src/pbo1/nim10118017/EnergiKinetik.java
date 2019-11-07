package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class ini melakukan perhitungan energi kinetik dan usaha.
 * 
 */
public class EnergiKinetik {
    private double massaBenda;
    private int kecepatan;

    public double getMassaBenda() {
        return massaBenda;
    }

    public void setMassaBenda(double massaBenda) {
        this.massaBenda = massaBenda;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double hitungEnergiKinetik() {
        return (massaBenda * (kecepatan * kecepatan)) / 2;
    }
    
    public double hitungUsaha() {
        return ((1d / 2d * massaBenda * (kecepatan * kecepatan)) - ( 1d / 2d * massaBenda * 0));
    }
}
