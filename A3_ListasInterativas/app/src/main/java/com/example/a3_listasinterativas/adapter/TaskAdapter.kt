package com.example.a3_listasinterativas.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.a3_listasinterativas.R
import com.example.a3_listasinterativas.model.Task

class TaskAdapter(
    private val onTaskClicked: (Task) -> Unit,
    private val onDeleteClicked: (Task) -> Unit
) : ListAdapter<Task, TaskAdapter.TaskViewHolder>(TaskDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_task, parent, false)
        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val checkBoxTask: CheckBox = itemView.findViewById(R.id.checkBoxTask)
        private val textViewTitle: TextView = itemView.findViewById(R.id.textViewTitle)
        private val buttonDelete: ImageButton = itemView.findViewById(R.id.buttonDelete)

        fun bind(task: Task) {
            checkBoxTask.isChecked = task.isCompleted
            textViewTitle.text = task.title

            checkBoxTask.setOnClickListener {
                onTaskClicked(task)
            }

            buttonDelete.setOnClickListener {
                onDeleteClicked(task)
            }
        }
    }
}