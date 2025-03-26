package com.example.playlistmaker

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings) // Используем разметку настроек

        // Обработчик нажатия кнопки "Назад"
        val backButton = findViewById<Button>(R.id.btn_back)
        backButton.setOnClickListener {

        finish()
        // Закрываем Activity и возвращаемся назад
        }
    }
}
