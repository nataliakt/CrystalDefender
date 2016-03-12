package unidade;

import campo.Caminho;
import java.awt.Color;

public class Unidade {

    protected Thread thread;
    protected int x, y, clock;
    protected boolean vivo;
    protected Color cor;
    protected Caminho caminho;

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public Caminho getCaminho() {
        return caminho;
    }

    public void setCaminho(Caminho caminho) {
        this.caminho = caminho;
    }

}
