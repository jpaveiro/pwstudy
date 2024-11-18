package br.com.etechoracio.study.dto;

import br.com.etechoracio.study.entity.Disciplina;
import br.com.etechoracio.study.entity.Disponibilidade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MonitorDTO {
    private String nome;
    private String foto;
    private String whatsapp;
    private String conteudo;
    private Disciplina idDisciplina;
    private List<Disponibilidade> disponibilidades;
}
