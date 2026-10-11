package Interface;

public class Pengguna {
    private Handphone phone;

    public Pengguna(Handphone phone) {
        this.phone = phone;
    }

    public void nyalakanHP() {
        this.phone.nyalakan();
    }

    public void matikanHP() {
        this.phone.matikan();
    }

    public void besarkanSuaraHP() {
        this.phone.besarkanSuara();
    }

    public void kecilkanSuaraHP() {
        this.phone.kecilkanSuara();
    }
}