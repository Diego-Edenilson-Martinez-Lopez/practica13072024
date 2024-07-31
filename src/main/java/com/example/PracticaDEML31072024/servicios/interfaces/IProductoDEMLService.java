package com.example.PracticaDEML31072024.servicios.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.example.PracticaDEML31072024.modelos.ProductoDEML;
import java.util.List;
import java.util.Optional;

public interface IProductoDEMLService {
    Page<ProductoDEML> buscarTodosPaginados(Pageable pageable);

    List<ProductoDEML> obtenerTodos();

    Optional<ProductoDEML> buscarPorId(Long id);

    ProductoDEML crearOEditar(ProductoDEML producto);

    void eliminarPorId(Long id);
}

