package com.anim007sharma.urlshortner.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anim007sharma.urlshortner.entity.URL;

@Repository
public interface URLRepository extends CrudRepository<URL, String>{

}
