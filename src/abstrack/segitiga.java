package abstrack;

class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi, String warna) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.warna = warna;
    }

    public void luas() {
        float luas;
        luas = (float) ((this.alas * this.tinggi) / 2);
        System.out.println("Luas Segitiga: " + luas);
    }
}