package com.example.projectandroidpemula

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListFoodAdapter(private val listFood: ArrayList<Food>): RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_food, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val foodArray = listFood[position]
        Glide.with(holder.itemView.context)
            .load(foodArray.photo)
            .apply(RequestOptions().override(70, 100))
            .into(holder.imgPhoto)
        holder.tvName.text = foodArray.name
        holder.tvDescription.text = foodArray.description
        val context= holder.itemView.context
        holder.itemView.setOnClickListener{
            val intentDetail = Intent(context, FoodDetailActivity::class.java)
            intentDetail.putExtra(FoodDetailActivity.extraTitle, foodArray.name )
            intentDetail.putExtra(FoodDetailActivity.extraDescription, foodArray.description )
            intentDetail.putExtra(FoodDetailActivity.extraPhoto, foodArray. photo )
            intentDetail.putExtra(FoodDetailActivity.extraBahan, foodArray.bahan_bahan)

            context.startActivity(intentDetail)
        }

    }

    override fun getItemCount(): Int = listFood.size

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvDescription: TextView = itemView.findViewById(R.id.tv_item_description)

    }
}