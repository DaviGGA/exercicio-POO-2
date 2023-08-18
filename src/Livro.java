public class Livro {
    String nome;
    String autor;
    int anoPublicacao;
    int numeroDePaginas;

    public Livro(String nome, String autor, int anoPublicacao, int numeroDePaginas) {
        this.nome = nome;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numeroDePaginas = numeroDePaginas;
    }

    int calculaIdadeLivro(int anoAtual) {
        return anoAtual - anoPublicacao;
    }

    void mostraIdadeLivro(int anoAtual) {
        int idadeLivro = calculaIdadeLivro(anoAtual);
        System.out.println("O livro " + nome + " foi lançado há " + idadeLivro + " anos atrás");
    }

    double calculaHorasParaLeitura() {
        double MINUTOS_PARA_CADA_PAGINA = 4;
        return (numeroDePaginas * MINUTOS_PARA_CADA_PAGINA) / 60;
    }

    void mostraHorasParaLeitura() {
        double horasParaLeitura = calculaHorasParaLeitura();
        System.out.println("Você terminará o livro " + nome + " em " + horasParaLeitura + " horas.");
    }


}
