package com.OnlineBooks.OnlineBook.Repository;

import java.awt.Taskbar.State;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface StateRepos extends JpaRepository<State, Long>{
	List<State> findByCountryCode(@Param("code") String code);
}
