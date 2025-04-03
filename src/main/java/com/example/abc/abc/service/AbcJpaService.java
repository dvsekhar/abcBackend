package com.example.abc.abc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.Optional;
import com.example.abc.abc.model.Abc;
import com.example.abc.abc.repository.AbcJpaRepository;
import com.example.abc.abc.repository.AbcRepository;

@Service
public class AbcJpaService implements AbcRepository {

    @Autowired
    private AbcJpaRepository abcJpaRepository;

    @Override
    public Abc getAbcById(int id) {
		try {
			Abc abc = abcJpaRepository.findById(id).get();
			return abc;
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
    }

    @Override
    public Abc updateAbc(int id, Abc abc) {
        Optional<Abc> existingAbc = abcJpaRepository.findById(id);
        if (existingAbc.isPresent()) {
            Abc updatedAbc = existingAbc.get();
            updatedAbc.setHeading(abc.getHeading()); 
            return abcJpaRepository.save(updatedAbc);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Record not found");
        }
    }
}
