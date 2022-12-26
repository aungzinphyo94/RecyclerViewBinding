package com.dandt.recyclerviewsample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dandt.recyclerviewsample.databinding.ItemRecyclerBinding

class NameRecyclerAdapter(var personList: List<Person>)
    : RecyclerView.Adapter<NameRecyclerAdapter.NameViewHolder>()  {

    inner class NameViewHolder(val binding: ItemRecyclerBinding)
        : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        val binding = ItemRecyclerBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return NameViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        holder.binding.txtName.text = personList[position].name
        holder.binding.txtPhone.text = personList[position].phoneNo
    }

    override fun getItemCount(): Int {
        return personList.size
    }

}