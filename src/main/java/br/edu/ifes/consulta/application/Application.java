/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.consulta.application;

import br.edu.ifes.consulta.cci.CtrlTelaPaciente;

/**
 *
 * @author 1998547
 */
public class Application {
    
    public static void main (String [] vaimeufilho)
    {
        CtrlTelaPaciente ctrlTelaPaciente = new CtrlTelaPaciente();
        ctrlTelaPaciente.cadastraPaciente();
        
    }
    
}
