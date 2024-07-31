package servicios.implementaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import modelos.ProductoDEML;
import servicios.interfaces.IProductoDEMLService;
import repositorios.IProductoDEMLRepository;
import java.util.List;
import java.util.Optional;
@Service
public class ProductoDEMLService implements IProductoDEMLService{

     @Autowired
    private IProductoDEMLRepository productoDEMLRepository;

    @Override
    public Page<ProductoDEML> buscarTodosPaginados(Pageable pageable) {
        return productoDEMLRepository.findAll(pageable);
    }

    @Override
    public List<ProductoDEML> obtenerTodos() {
        return productoDEMLRepository.findAll();
    }

    @Override
    public Optional<ProductoDEML> buscarPorId(Long id) {
        return productoDEMLRepository.findById(id);
    }

    @Override
    public ProductoDEML crearOEditar(ProductoDEML producto) {
        return productoDEMLRepository.save(producto);
    }

    @Override
    public void eliminarPorId(Long id) {
        productoDEMLRepository.deleteById(id);
    }

}
