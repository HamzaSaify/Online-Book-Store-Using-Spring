package com.OnlineBooks.OnlineBook.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.OnlineBooks.OnlineBook.entity.Country;
@RepositoryRestResource(collectionResourceRel = "countries", path = "countries")

public interface CountryRepos extends JpaRepository<Country, Long>{

}
