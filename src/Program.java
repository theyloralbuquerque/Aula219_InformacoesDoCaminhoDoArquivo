import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho do arquivo:");
        String strCaminho = sc.nextLine();

        File caminho = new File(strCaminho); // Instanciação do objeto caminho recebendo um novo File com o valor da variável strCaminho.

        System.out.println("getName: " + caminho.getName()); // .getName() exibe somente o nome do destino final.
        System.out.println("getParent: " + caminho.getParent()); // .getParent() exibe somente o caminho do destino final.
        System.out.println("getPath " + caminho.getPath()); // .getPath() exibe o caminho completo do destino final.
        
        sc.close();
    }
}