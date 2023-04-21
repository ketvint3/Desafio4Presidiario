package br.com.Desafio4.Presidiario.Services;

import br.com.Desafio4.Presidiario.Modells.PresidiarioModel;
import br.com.Desafio4.Presidiario.Modells.PresidioModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PresidiarioService {


    private List<PresidiarioModel> presidiarioService = new ArrayList<>();

    public void adicionar(PresidiarioModel presidiarioSalvo){

        presidiarioService.add(presidiarioSalvo);

    }

    // metodo com letra minuscula
    public List<PresidiarioModel> listaTodos(){
        return presidiarioService;

    }
    public Optional<PresidiarioModel> buscarPorResgistro(String registro){
        return presidiarioService.stream().filter(p-> registro.equals(p.getNumeroRegistro())).findFirst();
    }


    public void remove(String registro) {
    }

    public PresidioService buscarPorPresidio() {
        return null;
    }
    public void modificar( String numeroRegistro, PresidiarioModel presidiario){
        // apagou o antigo
        presidiarioService.remove(buscarPorResgistro(numeroRegistro));
        // colocou um novo
        presidiarioService.add((presidiario));

    }
}




