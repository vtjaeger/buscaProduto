import java.util.Scanner;

public class Loja {
    public void buscas() {

        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        BuscaProduto produto = new BuscaProduto();

        try {
            Produto novoProduto = produto.buscaProduto(id);
            System.out.println(novoProduto);

            GeradorJson gerador = new GeradorJson();
            gerador.geraJson(novoProduto);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
