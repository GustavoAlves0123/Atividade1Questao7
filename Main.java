import java.util.List;
import java.util.ArrayList;

class Jogo {
    private int codigo;
    private String nome;
    private String tipo;
    private double tamanho;

    public Jogo(int codigo, String nome, String tipo, double tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
        this.tamanho = tamanho;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        if (tamanho > 0) {
            this.tamanho = tamanho;
        } else {
            System.out.println("Tamanho inválido");
        }
    }

    public void iniciar() {
        System.out.println("O jogo " + nome + " foi iniciado.");
    }

    public void encerrar() {
        System.out.println("O jogo " + nome + " foi encerrado.");
    }
}

class Tela {
    private int codigo;
    private String descricao;
    private String tipo;
    private double tamanho;

    public Tela(int codigo, String descricao, String tipo, double tamanho) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.tamanho = tamanho;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public void ligar() {
        System.out.println("A tela foi ligada.");
    }

    public void desligar() {
        System.out.println("A tela foi desligada.");
    }
}

class Processador {
    private int codigo;
    private String descricao;
    private String tipo;
    private double velocidade;

    public Processador(int codigo, String descricao, String tipo, double velocidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.velocidade = velocidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar() {
        System.out.println("Processador acelerado.");
    }

    public void desacelerar() {
        System.out.println("Processador desacelerado.");
    }
}

class Memoria {
    private int codigo;
    private String tipo;
    private double capacidade;

    public Memoria(int codigo, String tipo, double capacidade) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public void alocar() {
        System.out.println("Memória alocada.");
    }

    public void desalocar() {
        System.out.println("Memória desalocada.");
    }
}

class Celular {
    private int codigo;
    private String modelo;
    private String marca;
    private List<Jogo> jogosInstalados;
    private Tela tela;
    private Processador processador;
    private Memoria memoria;

    public Celular(int codigo, String modelo, String marca, Tela tela, Processador processador, Memoria memoria) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.marca = marca;
        this.jogosInstalados = new ArrayList<>();
        this.tela = tela;
        this.processador = processador;
        this.memoria = memoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public List<Jogo> getJogosInstalados() {
        return jogosInstalados;
    }

    public Tela getTela() {
        return tela;
    }

    public void setTela(Tela tela) {
        this.tela = tela;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public void ligar() {
        tela.ligar();
        System.out.println("Celular " + modelo + " ligado.");
    }

    public void desligar() {
        tela.desligar();
        System.out.println("Celular " + modelo + " desligado.");
    }

    public void chamar() {
        System.out.println("Chamando...");
    }

    public void instalarJogo(Jogo jogo) {
        if (memoria.getCapacidade() >= jogo.getTamanho()) {
            jogosInstalados.add(jogo);
            memoria.setCapacidade(memoria.getCapacidade() - jogo.getTamanho());
            System.out.println("Jogo " + jogo.getNome() + " instalado no celular " + modelo);
        } else {
            System.out.println("Memória insuficiente para instalar o jogo " + jogo.getNome());
        }
    }

    public void listarJogos() {
        System.out.println("Jogos instalados no celular " + modelo + ":");
        for (Jogo jogo : jogosInstalados) {
            System.out.println(jogo.getNome());
        }
    }
}