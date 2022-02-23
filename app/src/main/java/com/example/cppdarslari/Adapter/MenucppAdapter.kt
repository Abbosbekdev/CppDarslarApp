package com.example.cppdarslari.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.cppdarslari.R
import com.example.cppdarslari.model.MenuModel
import kotlinx.android.synthetic.main.menu_item_layout.view.*


interface MenuCppOnclickListener{
    fun onClick(item : MenuModel)
}
class MenucppAdapter(val items : List<MenuModel>,val onclickListener: MenuCppOnclickListener):RecyclerView.Adapter<MenucppAdapter.ItemHolder>() {
    inner class ItemHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.menu_item_layout,parent,false))
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item = items[position]
        holder.itemView.tvMenu.text = item.titleName
        holder.itemView.imgMenu.setImageResource(item.icon)
        holder.itemView.setOnClickListener {
            onclickListener.onClick(item)
        }
    }
    override fun getItemCount(): Int {
        return items.count()
    }
}