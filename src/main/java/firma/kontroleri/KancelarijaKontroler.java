package firma.kontroleri;

import firma.modeli.Kancelarija;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import firma.repozitorijumi.KancelarijaRepository;

import java.util.List;

@RestController
public class KancelarijaKontroler {
    @Autowired
    KancelarijaRepository kancelarijaRepository;

    //pokazuje sve kancelarije
    @GetMapping("/kancelarija")
    public List<Kancelarija> sveKancelarije(){
        return kancelarijaRepository.findAll();
    }

    //pokazuje kancelarije po id-u
    @GetMapping("/kancelarija/{id}")
    public Kancelarija pokaziKancelariju(@PathVariable String id){
        int kId = Integer.parseInt(id);
        return kancelarijaRepository.findById(kId).orElse(null);
    }

    //kreira ili azurira kancelariju
    @PostMapping("/kancelarija")
    public Kancelarija napraviKancelariju(@RequestBody Kancelarija kancelarija){

        return kancelarijaRepository.save(kancelarija);
    }

    //brise odredjenu kancelariju
    @DeleteMapping("kancelarija/{id}")
    public boolean brisiKancelariju(@PathVariable String id){
        int kId= Integer.parseInt(id);
        kancelarijaRepository.deleteById(kId);
        return true;
    }
}
