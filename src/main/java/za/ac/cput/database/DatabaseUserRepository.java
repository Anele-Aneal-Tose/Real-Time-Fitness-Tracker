package za.ac.cput.database;

import za.ac.cput.domain.User;
import za.ac.cput.repositories.UserRepository;

import java.util.*;
//No real database connection yet!
//This satisfies the Future-Proofing requirement from Assignment 11.
//Later (in future versions), you can update save(), findById(), etc. to use JDBC, Hibernate, Spring
//Data, or another framework.

public class DatabaseUserRepository implements UserRepository {
    @Override
    public void save(User entity) {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }

    @Override
    public Optional<User> findById(String id) {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }

    @Override
    public List<User> findAll() {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }
}
