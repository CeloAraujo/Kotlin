package com.example.aula05

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aula05.dao.PessoaDAO
import com.example.aula05.model.Pessoa
import com.google.android.material.floatingactionbutton.FloatingActionButton
import org.w3c.dom.Text
import java.math.BigDecimal

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onResume() {
        super.onResume()
        setContentView(R.layout.main_constraint)

        val dao = PessoaDAO(this);

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ListarPessoaAdapter(
            pessoas = dao.buscarPessoas()
        )

        recyclerView.layoutManager = (LinearLayoutManager(this))

        val fab = findViewById<FloatingActionButton>(R.id.fabTela)
        fab.setOnClickListener{
            val intent = Intent(this, FormularioPessoaActivity::class.java)
            startActivity(intent)
        }
    }
}