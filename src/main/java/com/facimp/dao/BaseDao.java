package com.facimp.dao;

import java.util.List;

public interface BaseDao<T> {
    public void insert(T t);
    
    public T select(int id);
    
    public void delete(int id);
    
    public void update(T t);
    
    public List<T> all();
}
