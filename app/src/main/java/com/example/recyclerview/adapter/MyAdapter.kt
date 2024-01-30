package com.example.recyclerview.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.models.Mymodel

class MyAdapter(var context:Context, var arrayList: ArrayList<Mymodel>):
    RecyclerView.Adapter<MyAdapter.ItemHolder>(){

    class ItemHolder (itemView: View): RecyclerView.ViewHolder(itemView){

        var icons = itemView.findViewById<ImageView>(R.id.icon_image)
        var txt = itemView.findViewById<TextView>(R.id.txtTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        var itemholder = LayoutInflater.from(parent.context).inflate(R.layout.card, parent , false)
        return ItemHolder(itemholder)

    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        var myCard:Mymodel = arrayList.get(position)
        holder.icons.setImageResource(myCard.iconsCard!!)
        holder.txt.text = myCard.textCard

        holder.txt.setOnClickListener {
            Toast.makeText(context , myCard.textCard ,Toast.LENGTH_LONG )
        }


    }

}