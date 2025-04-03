package com.example.abc.abc.repository;

import com.example.abc.abc.model.Abc;

public interface AbcRepository {
    Abc getAbcById(int id);
    Abc updateAbc(int id, Abc abc);
}
