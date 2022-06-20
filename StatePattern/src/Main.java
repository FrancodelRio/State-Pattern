public class Main {
    public static void main(String[] args) {
        // El estado siempre comienza en off

        State state = new Dibujo().getState();
        //Cambiamos el estado  a ON para que el programa corra
        state.init();
    }
}
