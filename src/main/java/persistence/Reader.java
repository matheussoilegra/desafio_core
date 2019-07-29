package persistence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    private static List<String> arcformated = new ArrayList<String>();

    public static void carregarDados(String file) {
        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\mathe\\Desktop\\desafiocorefiles\\data\\in\\" + file));
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/ilegra0369/Downloads/desafiocorefiles/data/in/" + file));
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                if (linha.contains("001ç")) {
                    String[] aux = linha.split("001ç");
                    for (int i = 1; i < aux.length; i++) {
                        arcformated.add("001ç" + aux[i]);
                    }
                } else if (linha.contains("002ç")) {
                    String[] aux = linha.split("002ç");
                    for (int i = 1; i < aux.length; i++) {
                        arcformated.add("002ç" + aux[i]);
                    }
                } else if (linha.contains("003ç")) {
                    String[] aux = linha.split("003ç");
                    for (int i = 1; i < aux.length; i++) {
                        arcformated.add("003ç" + aux[i]);
                    }
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado.");
        }
    }

    public static List<String> getArcFormated() {
        return arcformated;
    }
}
