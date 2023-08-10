package com.pairlearning.ExpenseTracker.repositories;

import com.pairlearning.ExpenseTracker.domain.User;
import com.pairlearning.ExpenseTracker.exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
