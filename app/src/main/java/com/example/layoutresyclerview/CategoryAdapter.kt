package com.example.layoutresyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter(private val list1:Array<String>) :RecyclerView.Adapter<CategoryAdapter.CategoryAdapterViewHolder>() {

    class CategoryAdapterViewHolder(ItemView: View):RecyclerView.ViewHolder(ItemView) {
        val textview = ItemView.findViewById<TextView>(R.id.textView2)
        val btn=ItemView.findViewById<Button>(R.id.btn)
        val tv_txt=ItemView.findViewById<TextView>(R.id.tv_txt)

    }
private lateinit var context:Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryAdapterViewHolder {
        context=parent.context
        val view =LayoutInflater.from(parent.context).inflate(R.layout.item_category,parent,false)
        return CategoryAdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryAdapterViewHolder, position: Int) {
        holder.textview.text=list1.get(position)

        holder.btn.setOnClickListener {
            Toast.makeText(context, list1.get(position), Toast.LENGTH_SHORT).show()
            holder.tv_txt.text="09121234567"

        }
    }

    override fun getItemCount(): Int {
        return list1.size
    }
}




