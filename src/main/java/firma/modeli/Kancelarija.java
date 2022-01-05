package firma.modeli;

import javax.persistence.*;

@Entity
@Table(name="kancelarija")
public class Kancelarija {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int kancelarija_id;

    public Kancelarija() {
    }

    public int getKancelarija_id() {
        return kancelarija_id;
    }

    @Override
    public String toString() {
        return "Kancelarija{" +
                "kancelarija_id=" + kancelarija_id +
                '}';
    }
}
