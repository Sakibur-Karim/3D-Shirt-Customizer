package com.pairlearning.ExpenseTracker.services;

import com.pairlearning.ExpenseTracker.domain.User;
import com.pairlearning.ExpenseTracker.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;
    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;

}
