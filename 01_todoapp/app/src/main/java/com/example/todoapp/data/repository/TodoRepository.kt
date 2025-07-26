package com.example.todoapp.data.repository

import com.example.todoapp.data.local.TodoDao
import com.example.todoapp.data.local.TodoEntity
import javax.inject.Inject

class TodoRepository @Inject constructor(
    private val todoDao: TodoDao
) {

    suspend fun addTodo(todo: TodoEntity) = todoDao.insertTodo(todo)

    suspend fun getAllTodo() = todoDao.getAllTodos()
}