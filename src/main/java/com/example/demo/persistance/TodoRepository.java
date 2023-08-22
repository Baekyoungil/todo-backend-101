package com.example.demo.persistance;

import com.example.demo.model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, String> {
    List<TodoEntity> findByUserId(String userId);

//    @Query("select * from TodoEntity t where t.userId = ?1")
//    List<TodoEntity> findByUserIdQuery(String userId);
}
