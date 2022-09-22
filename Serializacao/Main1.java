package exercicio02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main1 {

   
        // serialização: gravando o objetos no arquivo binário "nomeArq"
    public Main1(ArrayList<Object> lista, String nomeArq) {

        File arq = new File(nomeArq);

        try {
            arq.delete();
            arq.createNewFile();

            ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
            objOutput.writeObject(lista);
            objOutput.close();

        } catch (IOException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }

    }

    // desserialização: recuperando os objetos gravados no arquivo binário "nomeArq"
   /* public static ArrayList<Object> lerArquivoBinario(String nomeArq) {
        ArrayList<Object> lista = new ArrayList();
        try {
            File arq = new File(nomeArq);
            if (arq.exists()) {
                ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
                lista = (ArrayList<Object>) objInput.readObject();
                objInput.close();

                System.out.println("Objeto gravado com sucesso! ");
            }
        } catch (IOException erro1) {

            System.out.println("Erro:" + erro1.getMessage());

        } catch (ClassNotFoundException erro2) {

            System.out.println("Erro: " + erro2.getMessage());
        }
    }
        return (lista);
        */
    
    }


//Cadastro c = new Cadastro();
// c.setLocationRelativeTo(null);
    // c.setVisible(true);
