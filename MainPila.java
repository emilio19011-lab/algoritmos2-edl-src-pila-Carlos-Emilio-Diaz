public class MainPila {
    public static void main(String[] args) {

        Pila pila = new Pila(6);

        pila.push("Google");
        pila.push("YouTube");
        pila.push("Facebook");
        pila.push("Instagram");
        pila.push("Spotify");
        pila.push("Netflix");

        System.out.println("Contenido de la pila:");
        pila.mostrar();

        System.out.println("Elemento eliminado: " + pila.pop());

        System.out.println("Tope actual: " + pila.peek());
    }
}