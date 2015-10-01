/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.consulta.cgd;

import br.edu.ifes.consulta.cdp.Paciente;

/**
 *
 * @author 1998547
 */
public class DAOPaciente {
    
    public void salvar(Paciente paciente)
    {
        System.out.println("Paciente Salvo: "+paciente.getNome());
    }
}
