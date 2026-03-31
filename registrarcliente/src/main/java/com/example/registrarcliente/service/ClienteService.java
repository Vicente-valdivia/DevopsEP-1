package com.example.registrarcliente.service;

import com.example.registrarcliente.model.Cliente;
import com.example.registrarcliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente registrar(Cliente cliente) {
        return clienteRepository.guardar(cliente);
    }

    public List<Cliente> listarTodo() {
        return clienteRepository.obtenerTodos();
    }

    public Cliente obtenerPorId(int id) {
        return clienteRepository.buscarPorId(id);
    }

    public Cliente editar(Cliente cliente) {
        return clienteRepository.actualizar(cliente);
    }

    public boolean borrar(int id) {
        return clienteRepository.eliminar(id);
    }
}