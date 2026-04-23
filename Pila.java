public class Pila {

    private String[] datos;
    private int tope;

    public Pila(int capacidad) {
        datos = new String[capacidad];
        tope = -1;
    }

    public void push(String x) {
        datos[++tope] = x;
    }

    public String pop() {
        return datos[tope--];
    }

    public String peek() {
        return datos[tope];
    }

    public boolean vacia() {
        return tope == -1;
    }


    public void mostrar() {
        for (int i = tope; i >= 0; i--) {
            System.out.println(datos[i]);
        }
    }
}