package com.example.uipaypal

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_balance.view.*

class ListBalanceAdapter(var arrayList: ArrayList<BalanceChange>) :
    RecyclerView.Adapter<ListBalanceAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var username = view.tvName
        var notification = view.tvNotification
        var money = view.tvMoney
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_balance, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.username.text = arrayList[position].name
        holder.notification.text = arrayList[position].notification
        holder.money.text = arrayList[position].money.toString() + "€"
        if (arrayList[position].money > 0) holder.money.setTextColor(Color.rgb(0, 197, 91))
        else holder.money.setTextColor(Color.rgb(0, 0, 0))
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}