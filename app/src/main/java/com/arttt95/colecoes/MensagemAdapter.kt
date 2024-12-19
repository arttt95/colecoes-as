package com.arttt95.colecoes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MensagemAdapter(
    /*private val lista: List<Mensagem>,*/
    private val clique: (String)-> Unit
) : RecyclerView.Adapter<MensagemAdapter.MensagemViewHolder> () {

    private var listaMensagens = mutableListOf<Mensagem>()

    fun executarOperacao() {

        // notifyItemRangeRemoved - Avisa o Adapter que o iterável foi reduzido dentro de um range
        // específico
        // Int, Int (position start, total de itens)
        listaMensagens.removeAt(1)
        listaMensagens.removeAt(2)
        notifyItemRangeRemoved(1, 2)

        // notifyItemRemoved -> Removendo apenas um item específico
        /*listaMensagens.removeAt(1)
        notifyItemRemoved(1)*/

        // notifyItemRangeChanged -> Avisa o Adapter que o iterável foi alterado
        // esses itens alterados foram em um range específico
        // Int, Int (início, fim)
        /*listaMensagens[0] = Mensagem("Pain","Vocês vão sentir o sofrimento","10:20")
        listaMensagens[1] = Mensagem("Yahiko","Eu morri pelos meus amigos","10:20")

        notifyItemRangeChanged(0,2)*/

        // notifyItemInserted -> Passando uma posição antes do item a ser adicionado
        // especifica aonde você quer que o item seja alocado na nova leitura dos dados
        /*listaMensagens.add(
            0,
            Mensagem("Madara","Susanoo","10:20")
        )

        notifyItemInserted(0) //listaMensagens.size*/

        // notifyItemInserted -> Maneira Usual, passando apenas o item ele será inserido ao final
        // da nova leitura do iterável
        /*listaMensagens.add(
            Mensagem("Madara","Susanoo","10:20")
        )
        notifyItemInserted(listaMensagens.size)*/

        /*listaMensagens.add(
            Mensagem("Madara","Susanoo","10:20")
        )

        listaMensagens.add(
            Mensagem("Kakashi","1000 anos de sofrimento","07:40")
        )

        listaMensagens.add(
            Mensagem("Iruka","Vamos Naruto","14:07")
        )

        notifyItemRangeInserted(listaMensagens.size, 3)*/

        /*listaMensagens[0] = Mensagem("Pain","Vocês vão sentir o sofrimento","10:20")

        notifyItemChanged(0)*/

    }

    fun atualizarListaDados(lista: MutableList<Mensagem>) {
//        listaMensagens.addAll(lista)
        listaMensagens = lista
        notifyDataSetChanged()
    }

    /*fun configurarClick() {

    }*/

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

        val mensagem = listaMensagens[position]
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
        return listaMensagens.size
    }

}