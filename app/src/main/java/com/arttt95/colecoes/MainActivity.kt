package com.arttt95.colecoes

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.arttt95.colecoes.testes.Recursos

/*class Usuario {
    companion object {
        var nome: String = ""
        val num: Int = 1001
    }
}*/

class MainActivity : AppCompatActivity() {

    private lateinit var textResultado: TextView
    private lateinit var btnExecutar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        textResultado = findViewById(R.id.text_resultado)
        btnExecutar = findViewById(R.id.btn_executar)

        /*Usuario.nome = "Pessi"
        Usuario.num*/

        /*Recursos.id.text_numero*/

        btnExecutar.setOnClickListener {

            textResultado.text = "Cristiano Penaldo"

        }

    }

    fun cliqueBotao(view: View) {

//        view.display

        textResultado.text = "Cristiano Penaldo"

    }

}