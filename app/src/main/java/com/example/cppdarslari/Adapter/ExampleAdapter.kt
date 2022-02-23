package com.example.cppdarslari.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cppdarslari.R
import com.example.cppdarslari.model.ExampleModel
import kotlinx.android.synthetic.main.example_item_layout.view.*

interface ExampleListener{
    fun onClick(item : ExampleModel)
}
class ExampleAdapter(val items : List<ExampleModel>,val exampleListener: ExampleListener):RecyclerView.Adapter<ExampleAdapter.ItemHoldeer>() {
    inner class ItemHoldeer(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHoldeer {
        return ItemHoldeer(LayoutInflater.from(parent.context).inflate(R.layout.example_item_layout,parent,false))
    }

    override fun onBindViewHolder(holder: ItemHoldeer, position: Int) {
        var item = items[position]
        holder.itemView.imgExample.setImageResource(item.imgExample)
        holder.itemView.setOnClickListener {
            exampleListener.onClick(item)
        }
    }

    override fun getItemCount(): Int {
        return items.count()
    }
}