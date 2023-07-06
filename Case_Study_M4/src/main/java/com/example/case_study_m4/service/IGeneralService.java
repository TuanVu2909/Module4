package com.example.case_study_m4.service;

import java.util.Optional;

public interface IGeneralService<E> {
    Iterable<E> findAll();
    Optional<E> findOne(Long id);
    E save(E e);
    void remove(Long id);
}
