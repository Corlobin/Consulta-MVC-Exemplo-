/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.consulta.cih;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author 1998547
 */
public class TelaGerirPaciente {
    
    public void mensagem (String msg)
    {
       System.out.println(msg);
    }
    
    public HashMap<String,String> cadastrarPaciente()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Favor Informar o nome:");
        String nome = scanner.nextLine();        
        System.out.println("Favor Informar o Telefone:");
        String telefone = scanner.nextLine();        
        System.out.println("Favor Informar o Profissao:");
        String profissao = scanner.nextLine();
        
        HashMap<String,String> dadosPaciente = new HashMap<String,String>();
        
        dadosPaciente.put("nome", nome);
        dadosPaciente.put("telefone", telefone);
        dadosPaciente.put("profissao", profissao);
        
        return dadosPaciente;
        
    }
    
}
