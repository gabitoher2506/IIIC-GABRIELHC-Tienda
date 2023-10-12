/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.services;

import tienda.domain.categoria;
import java.util.List;

public interface CategoriaService {

    public List<categoria> getCategorias(boolean activos);

}
