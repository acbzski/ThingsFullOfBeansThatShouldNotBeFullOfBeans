package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Beans;

@Repository
public interface BeanRepository extends JpaRepository<Beans, Long> { }