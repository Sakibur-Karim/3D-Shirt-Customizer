package com.pairlearning.ExpenseTracker.repositories;

import com.pairlearning.ExpenseTracker.domain.User;
import com.pairlearning.ExpenseTracker.exceptions.EtAuthException;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public Integer create(String firstName, String lastName, String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public Integer getCountByEmail(String email) {
        return null;
    }

    @Override
    public User findById(Integer userId) {
        return null;
    }
}
