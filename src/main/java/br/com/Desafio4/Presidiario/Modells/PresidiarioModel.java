package br.com.Desafio4.Presidiario.Modells;

import lombok.Data;

import java.util.Date;

@Data
public class PresidiarioModel {
    private String cpf;
    private PresidioModel presidio;
    private String numeroRegistro;
    private Date dataNascimento;
}
