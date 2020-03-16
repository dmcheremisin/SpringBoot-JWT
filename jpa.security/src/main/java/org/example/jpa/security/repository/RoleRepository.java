package org.example.jpa.security.repository;

import org.example.jpa.security.entities.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoleRepository extends CrudRepository<Role, Integer> {

    List<Role> findByEmail(String email);
}
