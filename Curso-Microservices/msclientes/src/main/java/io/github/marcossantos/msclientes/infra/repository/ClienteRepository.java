package io.github.marcossantos.msclientes.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.google.common.base.Optional;

import io.github.marcossantos.msclientes.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByCpf(String cpf);
}
