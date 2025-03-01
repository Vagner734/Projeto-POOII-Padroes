package classes;

import java.util.ArrayList;

public class XMLToJSONAdapter {

    @SuppressWarnings("unused")
    private final ExportData exportData; // Referência ao objeto ExportData para adaptação

    // Construtor que recebe um ExportData para inicializar o adaptador
    public XMLToJSONAdapter(ExportData exportData) {
        this.exportData = exportData;
    }

    // Método que converte uma lista de pares chave-valor em formato JSON
    public String convertXMLToJSON(ArrayList<String[]> data, int multiplier, String tag) {
        // Verifica se os dados são nulos ou vazios, retornando um JSON vazio se verdadeiro
        if (data == null || data.isEmpty()) {
            return "{\"data\": []}";
        }

        StringBuilder json = new StringBuilder(); // Objeto para construir a string JSON
        json.append("{\n  \"data\": [\n"); // Inicia o JSON com a propriedade 'data' como array

        // Itera sobre os dados para construir objetos JSON
        for (int i = 0; i < data.size(); i++) {
            // Inicia um novo objeto a cada 'multiplier' elementos
            if (i % multiplier == 0) {
                if (i != 0) {
                    json.append("    },\n"); // Fecha o objeto anterior, exceto no primeiro
                }
                json.append("    {\n"); // Abre um novo objeto JSON
            }

            String key = data.get(i)[0]; // Obtém a chave do par chave-valor
            String value = data.get(i)[1] != null ? data.get(i)[1] : ""; // Obtém o valor, usando "" se nulo
            json.append(String.format("      \"%s\": \"%s\"", key, value)); // Adiciona o par chave-valor formatado
            // Adiciona vírgula se não for o último elemento do objeto ou da lista
            if (i % multiplier != multiplier - 1 && i != data.size() - 1) {
                json.append(",");
            }
            json.append("\n");

            // Fecha o objeto quando atinge o limite do multiplier ou o fim dos dados
            if (i % multiplier == multiplier - 1 || i == data.size() - 1) {
                json.append("    }");  // Fecha o objeto atual
                if (i != data.size() - 1) {
                    json.append(",");  // Adiciona vírgula se não for o último objeto
                }
                json.append("\n");
            }
        }

        json.append("  ]\n}"); // Fecha o array 'data' e o JSON
        return json.toString();   // Retorna a string JSON completa
    }
}
