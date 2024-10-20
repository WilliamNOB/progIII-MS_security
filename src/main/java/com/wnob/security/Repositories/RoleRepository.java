package com.wnob.security.Repositories;

import com.wnob.security.Models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface RoleRepository extends MongoRepository<Role,String> {
}
