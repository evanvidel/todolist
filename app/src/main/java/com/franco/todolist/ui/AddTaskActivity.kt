
package com.franco.todolist.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.franco.todolist.R
import com.franco.todolist.databinding.ActivityAddTaskBinding

class AddTaskActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddTaskBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}