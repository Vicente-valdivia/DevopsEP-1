package com.example.registrarcliente.controller;

import com.example.registrarcliente.model.Cliente;
import com.example.registrarcliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClientController { 
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente registrar(@RequestBody Cliente cliente) {
        return clienteService.registrar(cliente);
    }

    @GetMapping
    public List<Cliente> listar() {
        return clienteService.listarTodo();
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable int id) {
        return clienteService.obtenerPorId(id);
    }

    @PutMapping("/{id}")
    public Cliente actualizar(@PathVariable int id, @RequestBody Cliente cliente) {
        cliente.setId(id);
        return clienteService.editar(cliente);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable int id) {
        boolean eliminado = clienteService.borrar(id);
        if (eliminado) {
            return "Cliente con ID " + id + " fue eliminado.";
        } else {
            return "No se encontró el cliente con ID " + id;
        }
    }
}