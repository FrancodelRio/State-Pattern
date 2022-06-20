public abstract class State {
    protected Dibujo dibujo;

    public State(Dibujo dibujo){
        this.dibujo = dibujo;
    }

    public abstract void init();
}