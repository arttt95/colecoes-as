package com.arttt95.colecoes

import android.database.DataSetObserver
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MensagemAdapter(
    private val lista: List<Mensagem>
) : RecyclerView.Adapter<MensagemAdapter.MensagemViewHolder> () {

    inner class MensagemViewHolder(
        itemView: View
    ) : ViewHolder( itemView ) {

        val textNome: TextView = itemView.findViewById(R.id.text_nome)
        val textUltima: TextView = itemView.findViewById(R.id.text_ultima)
        val textHorario: TextView = itemView.findViewById(R.id.text_horario)

    }

    // Ao criar o ViewHolder -> Criar a visualização
    override fun onCreateViewHolder( parent: ViewGroup, viewType: Int ): MensagemViewHolder {

        val layoutInflater = LayoutInflater.from(
            parent.context
        )

        val itemView = layoutInflater.inflate(
            R.layout.item_lista,
            parent,
            false
        )

        return MensagemViewHolder( itemView )
    }

    // Ao vincular o ViewHolder
    override fun onBindViewHolder(holder: MensagemViewHolder, position: Int) {
        /*val nome = lista[position].nome
        holder.textNome.text = nome
        val ultima = lista[position].ultima
        holder.textUltima.text = ultima
        val horario = lista[position].horario
        holder.textHorario.text = horario*/

        val mensagem = lista[position]
        holder.textNome.text = mensagem.nome
        holder.textUltima.text = mensagem.ultima
        holder.textHorario.text = mensagem.horario
    }

    // Recuperar a quantidade de itens
    override fun getItemCount(): Int {
        return lista.size
    }

}