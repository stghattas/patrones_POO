
import factory.*;
import decorator.*;
import observer.*;

public class Main {
    public static void main(String[] args) {

        NotificadorEventos notificador = new NotificadorEventos();
        notificador.agregar(new ObservadorConsola());
        notificador.agregar(new ObservadorLog());

        CreadorMensaje creador = new CreadorEmail();
        Mensaje mensaje = creador.crearMensaje("Hola, este es un mensaje importante.");

        mensaje = new EncriptadoDecorator(mensaje);
        mensaje = new ComprimidoDecorator(mensaje);

        mensaje.enviar();
        notificador.notificar("Se envió un mensaje Email encriptado y comprimido.");
    }
}
