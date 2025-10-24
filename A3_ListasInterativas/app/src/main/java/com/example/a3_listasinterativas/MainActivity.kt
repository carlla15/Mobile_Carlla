package com.example.a3_listasinterativas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a3_listasinterativas.adapter.TaskAdapter
import com.example.a3_listasinterativas.model.Task

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerViewTasks: RecyclerView
    private lateinit var editTextTask: EditText
    private lateinit var buttonAdd: Button

    private lateinit var taskAdapter: TaskAdapter
    private var taskList = mutableListOf<Task>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerViewTasks = findViewById(R.id.recyclerViewTasks)
        editTextTask = findViewById(R.id.editTextTask)
        buttonAdd = findViewById(R.id.buttonAdd)

        setupRecyclerView()
        setupClickListeners()
    }

    private fun setupRecyclerView() {
        taskAdapter = TaskAdapter(
            onTaskClicked = { task ->
                task.isCompleted = !task.isCompleted
                taskAdapter.submitList(taskList.toList())
            },
            onDeleteClicked = { task ->
                taskList.remove(task)
                taskAdapter.submitList(taskList.toList())
            }
        )

        recyclerViewTasks.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = taskAdapter
        }
    }

    private fun setupClickListeners() {
        buttonAdd.setOnClickListener {
            val taskTitle = editTextTask.text.toString().trim()

            if (taskTitle.isNotEmpty()) {
                val newTask = Task(title = taskTitle)
                taskList.add(newTask)
                taskAdapter.submitList(taskList.toList())

                editTextTask.text.clear()
            }
        }
    }
}