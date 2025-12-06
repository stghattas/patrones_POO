
package factory;

public class SMS extends Mensaje {
    public SMS(String c) { super(c); }
    @Override public void enviar() {
        System.out.println("Enviando SMS: " + contenido);
    }
}
