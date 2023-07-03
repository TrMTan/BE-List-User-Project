package com.mycompany.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> { // kho luu chu nguoi dung
    public Long countById(Integer id);
}
