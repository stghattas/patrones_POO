
package factory;

public class Email extends Mensaje {
    public Email(String c) { super(c); }
    @Override public void enviar() {
        System.out.println("Enviando EMAIL: " + contenido);
    }
}
