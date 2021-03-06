/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashwork.repository.people.Impl;

import hashwork.domain.people.PersonIdentity;
import hashwork.repository.people.PersonIdentityRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/**
 * @author BONGANI
 */
public class PersonIdentityRepositoryImpl implements PersonIdentityRepository {

    Map<String, PersonIdentity> lists = new HashMap<>();

    public PersonIdentityRepositoryImpl() {

    }

    @Override
    public PersonIdentity findById(String s) {
        return lists.get(s);
    }

    @Override
    public PersonIdentity save(PersonIdentity entity) {
        return lists.put(entity.getId(), entity);
    }

    @Override
    public PersonIdentity update(PersonIdentity entity) {
        return lists.put(entity.getId(), entity);
    }

    @Override
    public void delete(PersonIdentity entity) {
        lists.remove(entity.getId());
    }

    @Override
    public Set<PersonIdentity> findAll() {
        Set<PersonIdentity> set = new HashSet<>();
        for (Map.Entry<String, PersonIdentity> entry : lists.entrySet()) {
            set.add(entry.getValue());
        }
        return set;
    }

}
