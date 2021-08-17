package com.plaxer.springboot.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.plaxer.springboot.models.entity.Cliente;



public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
