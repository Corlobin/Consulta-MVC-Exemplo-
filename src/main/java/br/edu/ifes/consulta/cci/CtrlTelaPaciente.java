/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.consulta.cci;

import br.edu.ifes.consulta.cgt.AplGerenciarPaciente;
import br.edu.ifes.consulta.cih.TelaGerirPaciente;
import java.util.HashMap;

/**
 *
 * @author 1998547
 */
public class CtrlTelaPaciente {
    
    public AplGerenciarPaciente aplGerenciarPaciente = new AplGerenciarPaciente();
    
    public TelaGerirPaciente telaGerirPaciente = new TelaGerirPaciente();
        
    public void cadastraPaciente()
    {
        HashMap<String,String> dadosPaciente = telaGerirPaciente.cadastrarPaciente();
        
        aplGerenciarPaciente.cadastrar(dadosPaciente.get("nome"), 
                dadosPaciente.get("profissao"), dadosPaciente.get("telefone")
        );
        
        telaGerirPaciente.mensagem("Tudo nosso!!!!");
        
    }
    
}
