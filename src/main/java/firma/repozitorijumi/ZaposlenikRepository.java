package firma.repozitorijumi;

import firma.modeli.Zaposlenik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZaposlenikRepository extends JpaRepository<Zaposlenik, Integer> {
}
