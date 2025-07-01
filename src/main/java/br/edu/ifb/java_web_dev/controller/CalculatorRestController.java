package br.edu.ifb.java_web_dev.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifb.java_web_dev.model.CalculadoraService;
import br.edu.ifb.java_web_dev.model.Contact;
import br.edu.ifb.java_web_dev.persistence.ContactRepository;

@RestController
@RequestMapping("Calculadora")
@CrossOrigin
public class CalculatorRestController {

    @GetMapping(value = "/somar/{a}/{b}")
    public @ResponseBody Double soma (@PathVariable Double a, @PathVariable Double b) {
        return CalculadoraService.somar(a, b);
    }
    
    @GetMapping(value = "/subtrair/{a}/{b}")
    public @ResponseBody Double subtrair (@PathVariable Double a, @PathVariable Double b) {
        return CalculadoraService.subtrair(a, b);
    }
        @GetMapping(value = "/multiplicar/{a}/{b}")
        public @ResponseBody Double multiplicar (@PathVariable Double a, @PathVariable Double b) {
            return CalculadoraService.multiplicar(a, b);
    }
        @GetMapping(value = "/dividir/{a}/{b}")
        public @ResponseBody Double dividir (@PathVariable Double a, @PathVariable Double b) {
             	return CalculadoraService.dividir(a, b);
            	
            }
       
    }


