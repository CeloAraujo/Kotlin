package com.example.aula05

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aula05.model.Pessoa
import java.math.BigDecimal

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_constraint)

        /*val nome = findViewById<TextView>(R.id.nome_pessoa)
        nome.setText("Marcelo Araujo")
        val idade = findViewById<TextView>(R.id.idade_pessoa)
        idade.setText("24")
        val profissao = findViewById<TextView>(R.id.profissao_pessoa)
        profissao.setText("Programador")*/

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ListarPessoaAdapter(
            pessoas = listOf(
                Pessoa(
                    nome = "Marcelo",
                    idade = 24,
                    profissao = "Programador",
                    altura = BigDecimal(1.78)
                )
            )
        )
        recyclerView.layoutManager=(LinearLayoutManager(this))
    }

}