package za.ac.cput.services;

import za.ac.cput.domain.User;
import za.ac.cput.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserService {
//    private final UserRepository userRepo;
//
//    public UserService(UserRepository userRepo) {
//        this.userRepo = userRepo;
//    }
//
//    public User createUser(User user) {
//        // Add validations as needed
//        return userRepo.save(user);
//    }
//
//    public List<User> getAllUsers() {
//        return userRepo.findAll();
//    }
//
//    public Optional<User> getUserById(String id) {
//        return userRepo.findById(id);
//    }
//
//    public void deleteUser(String id) {
//        userRepo.deleteById(id);
//    }

    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public User createUser(User user) {
        // add validations if needed
        return userRepo.save(user);
    }

    public Optional<User> getUser(String userId) {
        return userRepo.findById(userId);
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public void deleteUser(String userId) {
        userRepo.delete(userId);
    }
}

