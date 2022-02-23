package com.example.cppdarslari.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cppdarslari.R
import com.example.cppdarslari.model.ProgrammingModel
import kotlinx.android.synthetic.main.programming_item_layout.view.*

interface ProgListener{
    fun onClick(item : ProgrammingModel)
}
class ProgrammingAdapter(val items : List<ProgrammingModel>,val progListener: ProgListener):RecyclerView.Adapter<ProgrammingAdapter.ItemHolder>() {
    inner class ItemHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.programming_item_layout,parent,false))
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        var item = items[position]
        holder.itemView.tvProgramming.text = item.titleProg
        holder.itemView.imgProgramming.setImageResource(item.imgProg)
        holder.itemView.setOnClickListener {
            progListener.onClick(item)
        }
    }

    override fun getItemCount(): Int {
        return items.count()
    }
}