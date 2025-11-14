package br.com.joaocarloslima;

public class Nave extends Asset{

    public Nave(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
    }

    public Tiro atirar(int poder){
        return new Tiro(getX(),getY(),10,Direcao.CIMA,poder);
    }

    @Override
    public void mover(){
        if (this.getDirecao().equals(Direcao.DIREITA) && getX() <= 590){
            setX(getX() + getVelocidade());
        }
        if (this.getDirecao().equals(Direcao.ESQUERDA) && getX() >= 0) {
            setX(getX() + getVelocidade());
        }
    }
}
