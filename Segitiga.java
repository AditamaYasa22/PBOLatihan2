package segitiga;
public class Segitiga {
    private double alas;
    private double tinggi;

    // CONSTRUCTOR
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    // SETTER
    // public double getAlas() {
    //     return alas;
    // }
    
    // public double getTinggi() {
    //     return tinggi;
    // }
    // GETTER
    // public void setAlas(double alas) {
    //     this.alas = alas;
    // }
    
    // public void setTinggi(double tinggi) {
    //     this.tinggi = tinggi;
    // }
    
    public double getLuas() {
        return 0.5 * this.alas * this.tinggi;
    }

    
}
