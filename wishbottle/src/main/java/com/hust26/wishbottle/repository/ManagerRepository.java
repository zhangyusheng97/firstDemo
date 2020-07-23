package com.hust26.wishbottle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hust26.wishbottle.entity.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Integer> {

    public Manager findByAccount(String account);
}
