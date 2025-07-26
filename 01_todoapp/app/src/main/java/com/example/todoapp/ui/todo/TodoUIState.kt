package com.example.todoapp.ui.todo

import com.example.todoapp.data.Todo

data class TodoUIState(
    val todoList : List<Todo> = emptyList(),
    val isTodoDialogOpen : Boolean = false,
)