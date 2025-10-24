package com.example.a3_listasinterativas.model

data class Task(
    val id: Long = System.currentTimeMillis(),
    val title: String,
    var isCompleted: Boolean = false
)