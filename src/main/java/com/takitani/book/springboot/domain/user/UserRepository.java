package com.takitani.book.springboot.domain.user;

import java.util.Optional;

public interface UserRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
