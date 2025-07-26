package com.example.todoapp.ui.todo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class TodoViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(TodoUIState())

    val uiState : StateFlow<TodoUIState> = _uiState

    fun addTodo(title : String) {
        viewModelScope.launch {

        }
    }
}