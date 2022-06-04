package com.example.taco2.data;

import com.example.taco2.entity.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
