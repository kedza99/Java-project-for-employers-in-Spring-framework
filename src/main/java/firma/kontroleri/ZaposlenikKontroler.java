package firma.kontroleri;

import firma.modeli.Zaposlenik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import firma.repozitorijumi.ZaposlenikRepository;

import java.util.List;

@RestController
public class ZaposlenikKontroler {
    @Autowired
    ZaposlenikRepository zaposlenikRepository;

    //pokazuje sve zaposlene
    @GetMapping("/zaposlenik")
    public List<Zaposlenik> sviZaposleni(){
        return zaposlenikRepository.findAll();
    }

    //pokazuje zaposlenog po id-u
    @GetMapping("/zaposlenik/{id}")
    public Zaposlenik pokaziZaposlenog(@PathVariable String id){
        int zId = Integer.parseInt(id);
        return zaposlenikRepository.findById(zId).orElse(null);
    }

    //kreira ili azurira zaposlenog
    @PostMapping("/zaposlenik")
    public Zaposlenik napraviZaposlenog(@RequestBody Zaposlenik zaposlenik){
        return zaposlenikRepository.save(zaposlenik);
    }


    //brise odredjenog zaposlenika
    @DeleteMapping("zaposlenik/{id}")
    public boolean brisiZaposlenog(@PathVariable String id){
        int zId= Integer.parseInt(id);
        zaposlenikRepository.deleteById(zId);
        return true;
    }
}
