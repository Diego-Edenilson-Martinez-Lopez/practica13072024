
package com.example.PracticaDEML31072024.servicios.implementaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.PracticaDEML31072024.modelos.ProductoDEML;
import com.example.PracticaDEML31072024.repositorios.IProductoDEMLRepository;
import com.example.PracticaDEML31072024.servicios.interfaces.IProductoDEMLService;

import java.util.List;
import java.util.Optional;

@Service
public class productoDEMLService implements IProductoDEMLService{

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
