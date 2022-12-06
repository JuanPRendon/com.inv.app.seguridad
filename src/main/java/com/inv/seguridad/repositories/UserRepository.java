package com.inv.seguridad.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.inv.seguridad.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Long>{
    public UserEntity findByUsername(String username);
}
