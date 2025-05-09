
package br.dev.bina.OSApiApplication.api.controller;

import br.dev.bina.OSApiApplication.domain.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sesidevb
 */
@RestController
public class ClienteController {
    
    List<Cliente> listaClientes;
    
    @GetMapping("/clientes")
    public List<Cliente> listas() {
        
        listaClientes = new ArrayList<Cliente>();
        listaClientes.add(new Cliente(1, "Sabrina", "bina@teste.com", "11-999999-9999"));
        listaClientes.add(new Cliente(1, "Maria", "maria@teste.com", "11-999999-9998"));
        listaClientes.add(new Cliente(1, "Luiza", "luiza@teste.com", "12-999999-9999"));   
                
        return listaClientes;
    }
    
}
