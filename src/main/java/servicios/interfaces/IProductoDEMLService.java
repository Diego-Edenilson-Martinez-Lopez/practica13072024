package servicios.interfaces;

import modelos.ProductoDEML;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IProductoDEMLService {
    Page<ProductoDEML> buscarTodosPaginados(Pageable pageable);

    List<ProductoDEML> obtenerTodos();

    Optional<ProductoDEML> buscarPorId(Long id);

    ProductoDEML crearOEditar(ProductoDEML producto);

    void eliminarPorId(Long id);
}

