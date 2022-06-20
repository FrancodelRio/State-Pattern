public class Dibujo {
    private State state;

    public Dibujo(){
        state = new Off(this);
    }

    public void setState(State state){
        this.state = state;
    }

    public void mostrar(){
        Objeto objeto = new Objeto();
    }

    public State getState(){
        return state;
    }
}
