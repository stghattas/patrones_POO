
package decorator;

import factory.Mensaje;

public abstract class MensajeDecorator extends Mensaje {
    protected Mensaje mensaje;
    public MensajeDecorator(Mensaje m) { super(m.contenido); this.mensaje = m; }
}
