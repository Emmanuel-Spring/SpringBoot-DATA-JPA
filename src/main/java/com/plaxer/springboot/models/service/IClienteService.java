package com.plaxer.springboot.models.service;

import java.util.List;

import com.plaxer.springboot.models.entity.Cliente;

public interface IClienteService {

	public Cliente findOne(Long id);

	public List<Cliente> findAll();

	public void save(Cliente cliente);

	public void delete(Long id);

}
