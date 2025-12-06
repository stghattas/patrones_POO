
package factory;

public class Push extends Mensaje {
    public Push(String c) { super(c); }
    @Override public void enviar() {
        System.out.println("Enviando PUSH: " + contenido);
    }
}
