package br.com.joaocarloslima;

import java.util.Random;

public class Meteoro extends Asset {

    private int tamanho;
    private int poder;

    public Meteoro(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
        Random gerador = new Random();
        int tamanhoMin = 1;
        int tamanhoMax = 8;
        int tamanhoAleatorio = gerador.nextInt((tamanhoMax - tamanhoMin) + 1) + tamanhoMin;
        this.tamanho = tamanhoAleatorio ;
        this.poder = tamanho;
    }

    public void tomarTiro(Tiro tiro){
        poder -= tiro.getPoder();
    }

}
