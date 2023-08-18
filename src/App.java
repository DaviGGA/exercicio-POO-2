import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Livro livro = new Livro("Crime e Castigo","Fiódor Dostoiévski",1866,540);

        Scanner sc = new Scanner(System.in);

        System.out.println("Em que ano estamos??");
        int anoAtual = sc.nextInt();
        livro.mostraIdadeLivro(anoAtual);
        
        livro.mostraHorasParaLeitura();

        sc.close();

    }
}
