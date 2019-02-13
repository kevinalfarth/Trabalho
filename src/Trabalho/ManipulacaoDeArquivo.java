package Trabalho;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManipulacaoDeArquivo {

    private String caminhoArquivo;
    private String nomeArquivo;

    public ManipulacaoDeArquivo(String caminho, String nome) {
        this.caminhoArquivo = caminho;
        this.nomeArquivo = nome;
    }

    public void gravar(String conteudo) throws IOException {
        FileWriter arquivoTxt = new FileWriter(this.caminhoArquivo + "/" + this.nomeArquivo, true);
        PrintWriter gravarArq = new PrintWriter(arquivoTxt);
        gravarArq.print(conteudo);
        arquivoTxt.close();
    }
}