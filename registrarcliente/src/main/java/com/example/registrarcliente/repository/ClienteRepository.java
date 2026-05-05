package com.example.registrarcliente.repository;

import com.example.registrarcliente.model.Cliente;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteRepository {
    private List<Cliente> listaClientes = new ArrayList<>();

    public Cliente buscarPorId(int id) {
        for (Cliente c : listaClientes) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public Cliente actualizar(Cliente clienteActualizado) {
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getId() == clienteActualizado.getId()) {
                listaClientes.set(i, clienteActualizado);
                return clienteActualizado;
            }
        }
        return null;
    }

    public boolean eliminar(int id) {
        return listaClientes.removeIf(c -> c.getId() == id);
    }

    public Cliente guardar(Cliente cliente) {
        listaClientes.add(cliente);
        return cliente;
    }

    public List<Cliente> obtenerTodos() {
        return listaClientes;
    }
}