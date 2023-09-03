package oop;

class Siseler{
    public String marka;
    public int kapasite;
    public String tur;

    public Siseler(String marka){
        this.marka = marka;
    }
    public Siseler(String marka, int kapasite, String tur) {
        this.marka = marka;
        this.kapasite = kapasite;
        this.tur = tur;
    }
}

class CamSise extends Siseler {
    public CamSise() {
        super("Erikli");
        this.tur = "Cam Şişe";
    }

    public void depozito() {
        System.out.println(this.marka + " " + this.tur + " depozito edilebilir.");
    }
}
class PetSise extends Siseler{
        public PetSise(){
            super("Hayat");
            this.tur = "Pet Şişe";
        }
        public void kullanAt(){
            System.out.println(this.marka + " "+ this.tur + " kullan-at özelliğine sahiptir.");
        }
}
class Damacana extends Siseler {
        public Damacana(){
            super("Saka");
            this.tur = "Damacana";
        }
        public void siparisVerilebilir(){
            System.out.println(this.marka +" "+ this.tur + " sipariş verilebilir.");
        }
}



public class InheritanceBottle {
    public static void main(String[] args) {
        CamSise camSise = new CamSise();
        camSise.depozito();

        PetSise petSise = new PetSise();
        petSise.kullanAt();

        Damacana damacana = new Damacana();
        damacana.siparisVerilebilir();

    }
}
