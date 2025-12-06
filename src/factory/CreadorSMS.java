
package factory;

public class CreadorSMS extends CreadorMensaje {
    public Mensaje crearMensaje(String contenido) { return new SMS(contenido); }
}
