package com.arttt95.colecoes

import android.database.DataSetObserver
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MensagemAdapter(
    private val lista: List<Mensagem>,
    private val clique: (String)-> Unit
) : RecyclerView.Adapter<MensagemAdapter.MensagemViewHolder> () {

    fun configurarClick() {

    }

    inner class MensagemViewHolder(
        itemView: View
    ) : ViewHolder( itemView ) {

        internal val textNome: TextView = itemView.findViewById(R.id.text_card_nome)
        internal val textUltima: TextView = itemView.findViewById(R.id.text_card_ultima)
//        val textHorario: TextView = itemView.findViewById(R.id.text_horario)
        internal val imgPerfil: ImageView = itemView.findViewById(R.id.img_card_perfil)
        private val carViewPerfil: CardView = itemView.findViewById(R.id.car_view_perfil)

        fun bind(mensagem: Mensagem) { // Conectar

            textNome.text = mensagem.nome
            textUltima.text = mensagem.ultima

            carViewPerfil.setOnClickListener{
                clique(mensagem.nome)
            }

        }

    }

    // Ao criar o ViewHolder -> Criar a visualização
    override fun onCreateViewHolder( parent: ViewGroup, viewType: Int ): MensagemViewHolder {

        val layoutInflater = LayoutInflater.from(
            parent.context
        )

        /*val itemView = layoutInflater.inflate(
            R.layout.item_lista,
            parent,
            false
        )*/

        val itemView = layoutInflater.inflate(
            R.layout.item_cardview,
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
        holder.bind(mensagem)

        /*holder.textNome.text = mensagem.nome
        holder.textUltima.text = mensagem.ultima
//        holder.textHorario.text = mensagem.horario*/

        // Aplicar eventos de clique
        /*val context = holder.imgPerfil.context
        holder.imgPerfil.setOnClickListener{
            clique()
        }*/

    }

    // Recuperar a quantidade de itens
    override fun getItemCount(): Int {
        return lista.size
    }

}