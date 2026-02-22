package br.com.taylor.swiftscore.modelos;

public class Audio {
    private String titulo;
    private int duracaoSegundos;
    private int totalDeReproducoes;
    private double somaDasAvaliacoes;  // Atributo para acumular as notas
    private int quantidadeAvaliacoes;  // Atributo para contar quantas pessoas avaliaram

    //Criação dos Métodos

    // 1. Soma a nota e incrementa a quantidade
    public void avaliar(double nota) {
        somaDasAvaliacoes += nota;
        quantidadeAvaliacoes++;
    }

    // 2. Divide a soma das avaliações pela quantidade
    public double pegarMedia() {
        if (quantidadeAvaliacoes == 0) {
            return 0; // Evita divisão por zero se ninguém avaliou ainda
        }
        return somaDasAvaliacoes / quantidadeAvaliacoes;
    }

    // 3. Aumenta o contador de reproduções
    public void reproduzir() {
        this.totalDeReproducoes++;
        System.out.println("Tocando agora: " + this.titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public int getQuantidadeAvaliacoes() {
        return quantidadeAvaliacoes;
    }

    public void setQuantidadeAvaliacoes(int quantidadeAvaliacoes) {
        this.quantidadeAvaliacoes = quantidadeAvaliacoes;
    }
}

