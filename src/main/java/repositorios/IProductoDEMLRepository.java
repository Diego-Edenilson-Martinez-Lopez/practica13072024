package repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import modelos.ProductoDEML;

public interface IProductoDEMLRepository extends JpaRepository<ProductoDEML, Long> {
}
