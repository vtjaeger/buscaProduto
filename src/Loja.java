import java.util.Scanner;

public class Loja {
    public void buscas(){
        int buscasMaximas = 5;

        for (int i = 0; i < buscasMaximas; i++) {
            Scanner scanner = new Scanner(System.in);
            int id = scanner.nextInt();

            BuscaProduto produto = new BuscaProduto();

            try{
                Produto novoProduto = produto.buscaProduto(id);
                System.out.println(novoProduto);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
