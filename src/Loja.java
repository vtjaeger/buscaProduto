import java.util.Scanner;

public class Chances {
    public void contabiliza(){
        int chancesMaximas = 5;

        for (int i = 0; i < chancesMaximas; i++) {
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
