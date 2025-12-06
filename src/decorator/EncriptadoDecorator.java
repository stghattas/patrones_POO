
package decorator;

import factory.Mensaje;

public class EncriptadoDecorator extends MensajeDecorator {
    public EncriptadoDecorator(Mensaje m) { super(m); }

    @Override
    public void enviar() {
        System.out.println("[Encriptado]");
        mensaje.enviar();
    }
}
