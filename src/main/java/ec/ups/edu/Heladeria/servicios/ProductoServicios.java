package ec.ups.edu.Heladeria.servicios;

import ec.ups.edu.Heladeria.entidades.Pedido;
import ec.ups.edu.Heladeria.entidades.Producto;
import ec.ups.edu.Heladeria.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServicios {
    @Autowired
    private ProductoRepositorio productoRepositorio;

    public List<Producto> findAll(){
        return (List<Producto>) productoRepositorio.findAll();
    }

    public List<Producto> retrieveProductosSucursal(Long id){
        return (List<Producto>) productoRepositorio.findProductosSucursal(id);
    }

    public List<Producto> retrieveProductosCat(Long id){
        return (List<Producto>) productoRepositorio.findProductosCat(id);
    }
    public Optional<Producto> findById(long id){
        return (Optional<Producto>) productoRepositorio.findById(id);
    }

    public List<Producto> retrieveAllNombre(){
        return (List<Producto>) productoRepositorio.findAllNombre();
    }

    public Producto retrieveAllProducto(Long id){

        return (Producto) productoRepositorio.findAllProducto(id);
    }

    public List<String> retrievePorPrecio(double precio){

        return (List<String>) productoRepositorio.findPorPrecio(precio);
    }

    public void save(Producto producto){
        productoRepositorio.save(producto);}
}
