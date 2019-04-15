/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 94616
 */
public class Gato {
    
    private int id;
    private String nome;
    private String raca;
    private boolean pedigree;
    private boolean sexo;
    private String preguica;
    private String racao;
    private boolean castrado;
    private float peso;
    private float comprimento;
    private float altura;
    private Integer idade;
    private Integer qtdVidas;
    private Integer qtdPelos;
    private boolean filhos;
    private boolean cirurgia;
    private String nomedoDono;
    private String corOlhoDireito;
    private String corOlhoEsquerdo;
    private String corPataDireitaDianteira;
    private String corPataDireitaTraseira;
    private String corPataEsquerdaDianteira;
    private String corPataEsquerdaTraseira;
    private boolean tosa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public boolean getPedigree() {
        return pedigree;
    }

    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }

    public boolean getSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getPreguica() {
        return preguica;
    }

    public void setPreguica(String preguica) {
        this.preguica = preguica;
    }

    public String getRacao() {
        return racao;
    }

    public void setRacao(String racao) {
        this.racao = racao;
    }

    public boolean getCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getQtdVidas() {
        return qtdVidas;
    }

    public void setQtdVidas(Integer qtdVidas) {
        this.qtdVidas = qtdVidas;
    }

    public Integer getQtdPelos() {
        return qtdPelos;
    }

    public void setQtdPelos(Integer qtdPelos) {
        this.qtdPelos = qtdPelos;
    }

    public boolean getFilhos() {
        return filhos;
    }

    public void setFilhos(boolean filhos) {
        this.filhos = filhos;
    }

    public boolean getCirurgia() {
        return cirurgia;
    }

    public void setCirurgia(boolean cirurgia) {
        this.cirurgia = cirurgia;
    }

    public String getNomedoDono() {
        return nomedoDono;
    }

    public void setNomedoDono(String nomedoDono) {
        this.nomedoDono = nomedoDono;
    }

    public String getCorOlhoDireito() {
        return corOlhoDireito;
    }

    public void setCorOlhoDireito(String corOlhoDireito) {
        this.corOlhoDireito = corOlhoDireito;
    }

    public String getCorOlhoEsquerdo() {
        return corOlhoEsquerdo;
    }

    public void setCorOlhoEsquerdo(String corOlhoEsquerdo) {
        this.corOlhoEsquerdo = corOlhoEsquerdo;
    }

    public String getCorPataDireitaDianteira() {
        return corPataDireitaDianteira;
    }

    public void setCorPataDireitaDianteira(String corPataDireitaDianteira) {
        this.corPataDireitaDianteira = corPataDireitaDianteira;
    }

    public String getCorPataDireitaTraseira() {
        return corPataDireitaTraseira;
    }

    public void setCorPataDireitaTraseira(String corPataDireitaTraseira) {
        this.corPataDireitaTraseira = corPataDireitaTraseira;
    }

    public String getCorPataEsquerdaDianteira() {
        return corPataEsquerdaDianteira;
    }

    public void setCorPataEsquerdaDianteira(String corPataEsquerdaDianteira) {
        this.corPataEsquerdaDianteira = corPataEsquerdaDianteira;
    }

    public String getCorPataEsquerdaTraseira() {
        return corPataEsquerdaTraseira;
    }

    public void setCorPataEsquerdaTraseira(String corPataEsquerdaTraseira) {
        this.corPataEsquerdaTraseira = corPataEsquerdaTraseira;
    }

    public boolean getTosa() {
        return tosa;
    }

    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }

    @Override
    public String toString() {
        return "Gatos{" + "nome=" + nome 
                + ", raca=" + raca 
                + ", pedigree=" + pedigree 
                + ", sexo=" + sexo 
                + ", preguica=" + preguica 
                + ", racao=" + racao 
                + ", castrado=" + castrado 
                + ", peso=" + peso 
                + ", comprimento=" + comprimento
                + ", altura=" + altura 
                + ", idade=" + idade 
                + ", qtdVidas=" + qtdVidas 
                + ", qtdPelos=" + qtdPelos 
                + ", filhos=" + filhos 
                + ", cirurgia=" + cirurgia 
                + ", nomedoDono=" + nomedoDono 
                + ", corOlhoDireito=" + corOlhoDireito 
                + ", corOlhoEsquerdo=" + corOlhoEsquerdo 
                + ", corPataDireitaDianteira=" + corPataDireitaDianteira 
                + ", corPataDireitaTraseira=" + corPataDireitaTraseira 
                + ", corPataEsquerdaDianteira=" + corPataEsquerdaDianteira 
                + ", corPataEsquerdaTraseira=" + corPataEsquerdaTraseira 
                + ", tosa=" + tosa + '}';
    }

    
}
 

