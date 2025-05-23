
package br.dev.bina.OSApiApplication.api.controller;

import br.dev.bina.OSApiApplication.domain.model.Cliente;
import br.dev.bina.OSApiApplication.domain.repository.ClienteRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sesidevb
 */
@RestController
public class ClienteController {
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    @PostMapping("/clientes")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar(@RequestBody Cliente cliente){
            
        return clienteRepository.save(cliente);
        
    }
        
    @GetMapping("/clientes")
    public List<Cliente> listas(){
        // return clienteRepository.findAll();
        return clienteRepository.findByNome("KGe");
        //return clienteRepository.findByNomeContaining("Silva");
    }
    
    @GetMapping("/clientes/{clienteID}")
    public ResponseEntity<Cliente> buscar(@PathVariable Long clienteID){
        Optional<Cliente> cliente = clienteRepository.findById(clienteID);
            
        if (cliente.isPresent()){
            return ResponseEntity.ok(cliente.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
        
    @PutMapping("/clientes/{clienteID}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long clienteID,
                                             @RequestBody Cliente cliente){
        
        //verifica se o cliente existe
        if (!clienteRepository.existsById(clienteID)) {
            return ResponseEntity.notFound().build();
        }
        
        cliente.setId(clienteID);
        cliente = clienteRepository.save(cliente);
        return ResponseEntity.ok(cliente);
    }
    
    @DeleteMapping("/clientes/{clienteID}")
    public ResponseEntity<Void> excluir(@PathVariable Long clienteID) {
        // Verifica se cliente existe ou não
        
        if (!clienteRepository.existsById(clienteID)) {
            return ResponseEntity.notFound().build();
        }
        
        clienteRepository.deleteById(clienteID);
        return ResponseEntity.noContent().build();
    }
        
            
    }
    

