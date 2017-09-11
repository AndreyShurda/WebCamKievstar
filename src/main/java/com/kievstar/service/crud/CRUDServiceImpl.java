package com.kievstar.service.crud;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public abstract class CRUDServiceImpl<T> implements CRUDService<T> {

    @Autowired
//    private SubscriberRepository subscriberRepository;
    private JpaRepository<T, Long> jpaRepository;


    @Override
    public T findById(Long id) {
        return (T)jpaRepository.findOne(id);
    }

    @Override
    public void save(T entity) {
        jpaRepository.save(entity);
    }


    @Override
    public void update(T entity) {
       save(entity);
    }

    @Override
    public void deleteById(Long id) {
        jpaRepository.delete(id);
    }

    @Override
    public List<T> findAll() {
        return (List<T>)jpaRepository.findAll();
    }
}
