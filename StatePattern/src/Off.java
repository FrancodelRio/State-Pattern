public class Off extends State {
    public Off(Dibujo dibujo){
        super(dibujo);
    }

    public void init() {
        dibujo.setState(new On(dibujo));
        dibujo.mostrar();
    }
}