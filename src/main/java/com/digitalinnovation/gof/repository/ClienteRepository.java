package com.digitalinnovation.gof.repository;

import com.digitalinnovation.gof.model.Cliente;
import org.apache.juli.logging.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {


}
