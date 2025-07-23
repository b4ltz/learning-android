package com.example.todoapp.data

data class Todo (
    val id: Int,
    val title: String,
    val isDone: Boolean = false
)