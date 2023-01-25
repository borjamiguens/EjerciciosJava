package asociacion;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Cliente> listaClientes= new ArrayList<>();

    public static void main(String[] args) {

        // Caso de uso: registro de cliente
        registraCliente("Pepe","Perez");
        System.out.println(listaClientes);

        registraCliente("Pepe","Perez");
        System.out.println(listaClientes);
    }

    private static void registraCliente(String pepe, String perez) {
    }

}
