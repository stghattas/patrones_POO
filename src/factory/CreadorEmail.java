
package factory;

public class CreadorEmail extends CreadorMensaje {
    public Mensaje crearMensaje(String contenido) { return new Email(contenido); }
}
