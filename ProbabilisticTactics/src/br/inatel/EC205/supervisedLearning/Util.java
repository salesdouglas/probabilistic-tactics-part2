package br.inatel.EC206.supervisedLearning;

import java.util.ArrayList;

/**
 *
 * @author amantedouglas
 */
public class Util {

    public ArrayList<Double[][]> converterArrayParaDouble(ArrayList<String[]> dados, int nentrada, int nsaida) {
        int entrada = nentrada;
        int saida = nsaida;
        ArrayList<Double[][]> retorno = new ArrayList<Double[][]>();
        Double[][] matrizEntradas = new Double[dados.size()][entrada];
        Double[][] matrizResultados = new Double[dados.size()][saida];
    
        for (int i = 0; i < dados.size(); i++) {
      
            for (int j = 0; j < (entrada+saida); j++) {
                if (j < entrada) {
                    matrizEntradas[i][j] = Double.parseDouble(dados.get(i)[j]);
                } else {
             
                    matrizResultados[i][j - entrada] = Double.parseDouble(dados.get(i)[j]);

                }
            }
            
            
            
            
            
            

        }
        retorno.add(matrizEntradas);
        retorno.add(matrizResultados);
        return retorno;
    }

}
