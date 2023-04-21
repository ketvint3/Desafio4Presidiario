package br.com.Desafio4.Presidiario.Services;

import br.com.Desafio4.Presidiario.Modells.PresidiarioModel;
import br.com.Desafio4.Presidiario.Modells.PresidioModel;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class PresidioService {
    private List<PresidioModel> listaPresidio= new ArrayList<PresidioModel>();



    public void cadastrar (PresidioModel P){
        listaPresidio.add(P);

    }
    public PresidioModel buscarPorCodigo ( Integer codigoPresidio){
        return listaPresidio.stream().filter(p-> codigoPresidio.equals(p.getCodigoPresidio())).findFirst().orElseThrow();
    }

    // modificar = apaga o antigo e adiciona um novo
    public void modificar( Integer codigoPresidio, PresidioModel presidio){
        // apagou o antigo
        listaPresidio.remove(buscarPorCodigo(codigoPresidio));
        // colocou um novo
        listaPresidio.add((presidio));

    }
    public void remover( Integer codigoPresidio){
        // como faço pra descobrir o presidio que eu quero apagar
        listaPresidio.remove(buscarPorCodigo(codigoPresidio));
    }
   public List<PresidioModel> listarTodos(){
        return listaPresidio;
   }

    //aterando...



}


