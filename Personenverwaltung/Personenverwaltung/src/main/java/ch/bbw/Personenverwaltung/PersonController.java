package ch.bbw.Personenverwaltung;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class PersonController {
    @Autowired
    PersonService service;

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public String index(Model md){
        md.addAttribute("person", service.findAll());

        return "person";
    }
}
