package br.com.joaocarloslima;

import javafx.scene.image.ImageView;

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

        String path = "images/meteoro/meteoro" + tamanho + ".png";
        this.setImagem(new ImageView(App.class.getResource(path).toString()));

    }

    public void tomarTiro(Tiro tiro){
        poder -= tiro.getPoder();
    }

}
