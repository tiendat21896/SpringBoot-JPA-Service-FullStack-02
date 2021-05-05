package com.example.springboottodomvcmysqlvuejs.todo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository stockRepository;

    public TodoService(TodoRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public List<Todo> findAll(){ return stockRepository.findAll();}

    public List<Todo> saveAll(List<Todo> todos) { return stockRepository.saveAll(todos);}

}
