package com.vicconuv.cumpleanios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //todos los elemnetos que existen en una app son considerados Views
        //un ejemplo es un TextView que sirve para mostrar texto

        //un ViewGroup es un contenedor de views (elementos)

        //un tipo de viewgropu es un constraintLayout que te permite organizar
        //los elementos de manera flexible
    }
}