package com.example.todoapp.ui.todo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.todoapp.ui.components.AddTodo
import com.example.todoapp.ui.components.AddTodoDialog
import com.example.todoapp.ui.components.AppBar
import com.example.todoapp.ui.theme.TodoAppTheme

@Composable
fun TodoApp(){
    val openAlertDialog = remember { mutableStateOf(false) }
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            AppBar()
        },
        floatingActionButton = {
            AddTodo {
                openAlertDialog.value = true
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            Text("qweqwe")
        }
        if (openAlertDialog.value) {
            AddTodoDialog(
                onDismissRequest = {openAlertDialog.value = false },
                onConfirmation ={
                    openAlertDialog.value = false
                    println(it)
                },
                dialogTitle = "Add Todo",
                icon = Icons.Filled.Add
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TodoAppPreview() {
    TodoAppTheme {
        TodoApp()
    }
}