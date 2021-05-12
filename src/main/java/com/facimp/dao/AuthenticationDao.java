package com.facimp.dao;

public interface AuthenticationDao<T> {
    public T authenticate(String email, String password);
}
