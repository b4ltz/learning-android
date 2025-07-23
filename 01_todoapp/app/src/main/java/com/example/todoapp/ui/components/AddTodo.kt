package com.example.todoapp.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.todoapp.ui.theme.TodoAppTheme

@Composable
fun AddTodo(onClick : () -> Unit) {
    FloatingActionButton(onClick= onClick) {
        Icon(Icons.Filled.Add, contentDescription = "Add Task")
    }
}

@Preview(showBackground = true)
@Composable
fun AddTodoPreview(){
    TodoAppTheme {
        AddTodo {  }
    }
}