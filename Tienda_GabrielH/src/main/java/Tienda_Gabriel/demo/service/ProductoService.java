/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tienda_Gabriel.demo.service;
import java.util.List;
import Tienda_Gabriel.demo.domain.Producto;
/**
 *
 * @author MARÍA CELESTE
 */
public interface ProductoService {
    
    public List <Producto> getProductos(boolean activos);
    // Se obtiene un Categoria, a partir del id de un categoria
    public Producto getProducto(Producto producto);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Producto producto);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Producto producto);
    
}// Fin de la clase

