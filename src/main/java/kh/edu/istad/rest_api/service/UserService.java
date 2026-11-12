package kh.edu.istad.rest_api.service;

import kh.edu.istad.rest_api.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    // Logic
    List<User> getAll();
    User getById(UUID id);
    User create(User user);
    void delete(UUID id);
}
