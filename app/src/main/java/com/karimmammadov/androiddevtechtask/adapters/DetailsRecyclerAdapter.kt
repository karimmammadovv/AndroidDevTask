package com.karimmammadov.androiddevtechtask.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.karimmammadov.androiddevtechtask.R
import com.karimmammadov.androiddevtechtask.databinding.ActivityStatsBinding
import com.karimmammadov.androiddevtechtask.databinding.DetailsRecyclerRowBinding
import com.karimmammadov.androiddevtechtask.models.DetailsModel
import kotlinx.android.synthetic.main.details_recycler_row.view.*

class DetailsRecyclerAdapter(val detailList : ArrayList<DetailsModel>) : RecyclerView.Adapter<DetailsRecyclerAdapter.PostHolder>() {

    class PostHolder(view:View) : RecyclerView.ViewHolder(view){

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DetailsRecyclerAdapter.PostHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.details_recycler_row, parent, false)
        return PostHolder(view)
    }

    override fun onBindViewHolder(holder: DetailsRecyclerAdapter.PostHolder, position: Int) {
        holder.itemView.txtTitle.text = detailList.get(position).title
        holder.itemView.txtDate.text = detailList.get(position).date
        holder.itemView.txtPrice.text = detailList.get(position).price
    }

    override fun getItemCount(): Int {
        return detailList.size
    }
}