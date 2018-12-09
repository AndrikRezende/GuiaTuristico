package com.example.android.guiaturistico;

/**
 * Created by Andrik on 25/02/2018.
 */

public class Atracao {

    private int nome;
    private int endereço;
    private int horario;
    private int telefone = semTelefone;
    private int imagemId = semImagem;
    public static final int semTelefone = -1;
    public static final int semImagem = -1;

    public Atracao(int nome, int horario, int endereço, int telefone, int imagemId) {
        this.nome = nome;
        this.horario = horario;
        this.endereço = endereço;
        this.telefone = telefone;
        this.imagemId = imagemId;
    }

    public int getNome() {
        return nome;
    }

    public int getEndereço() {
        return endereço;
    }

    public int getHorario() {
        return horario;
    }

    public int getTelefone() {
        return telefone;
    }

    public int getImagemId() {
        return imagemId;
    }

    public boolean temTelefone(){
        return telefone!=semTelefone;
    }

    public boolean temImagem(){
        return imagemId!=semImagem;
    }
}
