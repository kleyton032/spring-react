package com.kleytonjoao.springreact.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kleytonjoao.springreact.enums.RoleName;
import com.kleytonjoao.springreact.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	
	 Optional<Role> findByName(RoleName roleName);
}
