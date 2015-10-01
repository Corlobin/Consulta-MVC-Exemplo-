/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.consulta.cgt;

import br.edu.ifes.consulta.cdp.Paciente;
import br.edu.ifes.consulta.cgd.DAOPaciente;

/**
 *
 * @author 1998547
 */
public class AplGerenciarPaciente {
    
    public void cadastrar(String nome, String profissao, String telefone)
    {
        Paciente novoPaciente = new Paciente();
        novoPaciente.setNome(nome);
        novoPaciente.setProfissao(profissao);
        novoPaciente.setTelefone(telefone);
        
        DAOPaciente daoPaciente = new DAOPaciente();
        daoPaciente.salvar(novoPaciente);
        
    }
    
}
