package br.com.Desafio4.Presidiario.Controllers;

import br.com.Desafio4.Presidiario.Modells.PresidioModel;
import br.com.Desafio4.Presidiario.Services.PresidioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/presidio")
public class PresidioController {

    @Autowired
    private PresidioService listaPresidio;

    @PutMapping(value ="/modificar/{codigoPresidio}" )
    public ResponseEntity modificar(@PathVariable  Integer codigoPresidio, @RequestBody PresidioModel presidio){
        listaPresidio.modificar( codigoPresidio,presidio);
        return new ResponseEntity(presidio, HttpStatus.OK);
    }

    //deletando...
    @DeleteMapping(value = "/deletar/{codigoPresidio}")
    public ResponseEntity deletar(@PathVariable Integer codigoPresidio){
        listaPresidio.remover(codigoPresidio);
        return new ResponseEntity("deletado com sucesso!", HttpStatus.OK);

    }

    @GetMapping(value = "/listar")
    public ResponseEntity ListarTodos(){
        return new ResponseEntity(listaPresidio.listarTodos(),HttpStatus.OK);

    }
    @PostMapping(value = "/cadastrar")
    public ResponseEntity cadastrar( @RequestBody PresidioModel presidio){
        listaPresidio.cadastrar(presidio);
        return new ResponseEntity(presidio,HttpStatus.CREATED);
    }

}
