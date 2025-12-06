
package decorator;

import factory.Mensaje;

public class ComprimidoDecorator extends MensajeDecorator {
    public ComprimidoDecorator(Mensaje m) { super(m); }

    @Override
    public void enviar() {
        System.out.println("[Comprimido]");
        mensaje.enviar();
    }
}
