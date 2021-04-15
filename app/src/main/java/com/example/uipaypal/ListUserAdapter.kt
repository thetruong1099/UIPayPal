package com.example.uipaypal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_user.view.*

class ListUserAdapter(var arrayList:ArrayList<User>): RecyclerView.Adapter<ListUserAdapter.ViewHolder>() {
    class ViewHolder(view:View): RecyclerView.ViewHolder(view) {
        var username = view.tvUserName
        var avatar = view.imgvAvartar
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_user, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.username.text = arrayList[position].username
        holder.avatar.setImageResource(arrayList[position].avatar)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}