package co.edu.udea.microserviciosudearegistration.api;

import co.edu.udea.microserviciosudearegistration.dto.Contact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody

public class ContactApi {
    @GetMapping(value = "/contact")

    public Contact Contact() {

        return new Contact(7L, "Wulfram", "polo", "+57 3129824821", "wulfram.polo@udea.edu.co");

    }
}
