import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaProduto {
    public Produto buscaProduto(int id){
        URI endereco = URI.create("https://dummyjson.com/products/" + id);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        HttpResponse<String> response;
        try {
            response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Produto.class);
        } catch (IOException | InterruptedException ex) {
            throw new RuntimeException("Produto nao localizado");
        }
    }
}
