package hn.unah.lenguajes.escuela.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.escuela.modelos.Maestros;
import hn.unah.lenguajes.escuela.servicios.MaestroServicio;


@RestController
@RequestMapping("/api/maestros")
public class MaestroControlador {
    
    @Autowired
    private MaestroServicio maestroServicio;
    
    @GetMapping("/obtener/todos")
    public List<Maestros> obtenerTodos() {
        return this.maestroServicio.obtenerTodos();
    }
    

}
