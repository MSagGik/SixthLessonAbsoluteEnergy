package com.msaggik.sixthlessonabsoluteenergy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // создание полей для вывода на экран нужных значений
    private EditText massIn; // поле ввода размера массы
    private Button button; // кнопка обработки информации
    private TextView energyOut; // поле вывода результирующей информации

    // создание поля для алгоритма
    private String mass = ""; // переменная для записи входного значения

    // создадим объект нашего алгоритма, чтобы мы могли получить доступ к его методам
    Algorithm algorithm = new Algorithm();

    // вывод на экран полученных значений
    @Override
    protected void onCreate(Bundle savedInstanceState) { // создание жизненного цикла активности
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // присваивание жизненному циклу активити представления activity_main

        // присваивание переменным активити элементов представления activity_main
        massIn = findViewById(R.id.massIn); // поле ввода
        button = findViewById(R.id.button); // кнопка обработки
        energyOut = findViewById(R.id.energyOut); // поле вывода

        // выполнение действий при нажании кнопки
        button.setOnClickListener(listener); // обработка нажатия кнопки
    }

    // объект обработки нажатия кнопки
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // считывание введённого значения
            mass = massIn.getText().toString();

            // вывод полученной информации на экран
            energyOut.setText("В данной массе сосредоточено " + algorithm.absoluteEnergyCalculation(mass) + " Джоулей абсолютной энергии");
        }
    };
}