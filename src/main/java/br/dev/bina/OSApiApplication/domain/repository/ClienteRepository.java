
package br.dev.bina.OSApiApplication.domain.repository;

import br.dev.bina.OSApiApplication.domain.model.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sesidevb
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNome(String nome);
    List<Cliente> findByNomeContaining(String nome);
    
}
