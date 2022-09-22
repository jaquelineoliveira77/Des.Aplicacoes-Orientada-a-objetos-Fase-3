/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Jaqueline Oliveira
 */
public class Main {

    public static void main(String[] args) {

        Cadastro c = new Cadastro();
        String nomeArquivo = "teste.ser";
        
        c.setLocationRelativeTo(null);
        c.setVisible(true);
        
        

       //Serializando  o objeto

        try {
             
           FileOutputStream arquivo = new FileOutputStream(nomeArquivo);
           ObjectOutputStream out = new ObjectOutputStream(arquivo);
           
           out.writeObject(c);
           out.close();
           arquivo.close();
           
            System.out.println(" Objeto serializado com sucesso! ");

        } catch (IOException erro) {
            System.out.println("Erro na serialização: " + erro.getMessage());
        }

    }

}
