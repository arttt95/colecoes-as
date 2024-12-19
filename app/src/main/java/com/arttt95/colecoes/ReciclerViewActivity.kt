package com.arttt95.colecoes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.arttt95.colecoes.testes.Mensagem

class ReciclerViewActivity : AppCompatActivity() {

    private lateinit var rvLista: RecyclerView
    private lateinit var btnClique: Button
    private lateinit var mensagemAdapter: MensagemAdapter

    override fun onStart() {
        super.onStart()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recicler_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val lista = mutableListOf(
            Mensagem(
                "Obito",
                "Eai",
                "10:28"
            ),
            Mensagem(
                "Minato",
                "Lorem Ipsum is simply dummy text of the printing and typesetting " +
                        "industry. Lorem Ipsum has been the industry's standard dummy text " +
                        "ever since the 1500s",
                "08:12"
            ),
            Mensagem(
                "Hashirama",
                "Meu irmão está sempre caçando Uchihas",
                "22:08"
            ),
            Mensagem(
                "Nagato",
                "Todos vão sentir o sofrimento com os meus 7 caminhos",
                "16:33"
            )
        )

//         "Shisui", "Nagato", "Obito", "Pain", "Yahiko", "Minato", "Hashirama", "Tobirama"

        rvLista = findViewById(R.id.rv_lista)
        btnClique = findViewById(R.id.btn_clique)

        mensagemAdapter = MensagemAdapter/*(lista)*/ { nome: String ->
            Toast.makeText(this, "Olá $nome", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ListViewActivity::class.java)

            startActivity(
                intent.putExtra("nome", nome)
            )
        }

        mensagemAdapter.atualizarListaDados(lista)

        rvLista.adapter = mensagemAdapter

        // LinearLayoutManager (XML e Código)
        rvLista.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL,
            false
        )

        btnClique.setOnClickListener {

            mensagemAdapter.executarOperacao()

            /*lista.add( Mensagem("Madara","Susanoo","10:20") )
            mensagemAdapter.atualizarListaDados(lista)*/
        }

        // Divisor de item -> DividerItemDecoration
        /*rvLista.addItemDecoration(
            DividerItemDecoration(
                this, RecyclerView.VERTICAL
            )
        )*/

        // GridLayoutManager
        /*rvLista.layoutManager = GridLayoutManager(
            this,
            2,
            RecyclerView.VERTICAL,
            false
        )*/

        // StaggeredGridLayout
        /*rvLista.layoutManager = StaggeredGridLayoutManager(
            2,
            RecyclerView.VERTICAL
        )*/

    }
}