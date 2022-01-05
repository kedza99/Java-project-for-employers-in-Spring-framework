package firma.modeli;

import javax.persistence.*;

@Entity
@Table(name="zaposlenik")
public class Zaposlenik {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int zaposlenik_id;
    private String ime;
    private String prezime;
    private String broj_telefona;
    private int kancelarija_id;

    public Zaposlenik() {
    }

    public Zaposlenik(String ime, String prezime, String broj_telefona, int kancelarija_id) {
        this.ime = ime;
        this.prezime = prezime;
        this.broj_telefona = broj_telefona;
        this.kancelarija_id = kancelarija_id;
    }

    public int getZaposlenik_id() {
        return zaposlenik_id;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getBroj_telefona() {
        return broj_telefona;
    }

    public int getKancelarija_id() {
        return kancelarija_id;
    }

    @Override
    public String toString() {
        return "Zaposlenik{" +
                "zaposlenik_id=" + zaposlenik_id +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", broj_telefona='" + broj_telefona + '\'' +
                ", kancelarija_id=" + kancelarija_id +
                '}';
    }
}
