
package br.dev.bina.OSApiApplication.api.controller;

import br.dev.bina.OSApiApplication.domain.model.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sesidevb
 */
@RestController
public class ClienteController {
    
    @PersistenceContext
    private EntityManager manager;
    
    
    @GetMapping("/clientes")
    public List<Cliente> listas() {
        
        return manager.createQuery("from Cliente", Cliente.class)
                .getResultList();
        
    }
    
}
