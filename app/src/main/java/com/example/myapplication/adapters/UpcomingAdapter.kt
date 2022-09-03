package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.UpcomingItemBinding
import com.example.myapplication.models.NoteModel
import java.util.*

class UpcomingAdapter(private var data: ArrayList<NoteModel>) : RecyclerView.Adapter<UpcomingAdapter.UpcomingViewHolder>() {
    class UpcomingViewHolder(private val binding: UpcomingItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(noteModel: NoteModel) {
            binding.pinnedtitle.text = noteModel.title
            binding.pinneddescription.text = noteModel.note
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UpcomingViewHolder {
        val binding: UpcomingItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.upcoming_item, parent, false)
        return UpcomingViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UpcomingViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}