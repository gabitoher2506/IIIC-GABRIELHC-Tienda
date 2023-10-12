
package tienda.DAO;

import tienda.domain.categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface categoriaDAO extends JpaRepository <categoria,Long> {
    
}
