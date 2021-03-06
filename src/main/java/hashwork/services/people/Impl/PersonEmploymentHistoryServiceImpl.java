/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashwork.services.people.Impl;

import hashwork.domain.people.PersonEmploymentHistory;
import hashwork.repository.people.Impl.PersonEmploymentHistoryRepositoryImpl;
import hashwork.repository.people.PersonEmploymentHistoryRepository;
import hashwork.services.people.PersonEmployementHistoryService;

import java.util.Set;

/**
 * @author BONGANI
 */
public class PersonEmploymentHistoryServiceImpl implements PersonEmployementHistoryService {
    private final PersonEmploymentHistoryRepository repo = new PersonEmploymentHistoryRepositoryImpl();

    @Override
    public PersonEmploymentHistory findById(String s) {
        return repo.findById(s);
    }

    @Override
    public PersonEmploymentHistory save(PersonEmploymentHistory entity) {
        return repo.save(entity);
    }

    @Override
    public PersonEmploymentHistory update(PersonEmploymentHistory entity) {
        return repo.save(entity);
    }

    @Override
    public void delete(PersonEmploymentHistory entity) {
        repo.delete(entity);
    }

    @Override
    public Set<PersonEmploymentHistory> findAll() {
        return repo.findAll();
    }
}
