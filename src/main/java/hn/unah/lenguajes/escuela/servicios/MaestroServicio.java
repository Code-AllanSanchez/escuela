package hn.unah.lenguajes.escuela.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.escuela.modelos.Maestros;
import hn.unah.lenguajes.escuela.repositorios.MaestroRepositorio;

@Service
public class MaestroServicio {

    @Autowired
    private MaestroRepositorio maestroRepositorio;

    public List<Maestros> obtenerTodos(){
        return this.maestroRepositorio.findAll();
    }
    
}
