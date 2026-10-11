package abstrack;

class Lingkaran extends BangunDatar {
    private double jari2;

    public Lingkaran(double jari2, String warna) {
        this.jari2 = jari2;
        this.warna = warna;
    }

    public void luas() {
        float luas;
        luas = (float) ((22.0 / 7) * this.jari2 * this.jari2);
        System.out.println("Luas Lingkaran : " + luas);
    }
}