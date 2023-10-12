package tienda.services.impl;
import tienda.DAO.categoriaDAO;
import tienda.domain.categoria;
import tienda.services.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class CategoriaServiceImp implements CategoriaService {
    
    @Autowired
    private categoriaDAO categoriaDao;
    @Override
    @Transactional(readOnly=true)
    public List<categoria> getCategorias(boolean activos) {
        var lista=categoriaDao.findAll();
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
}