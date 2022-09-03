package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.PinnedItemBinding
import com.example.myapplication.models.NoteModel
import java.util.*

class PinnedAdapter(private var data: ArrayList<NoteModel>) : RecyclerView.Adapter<PinnedAdapter.PinnedViewHolder>() {
    class PinnedViewHolder(private val binding: PinnedItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(noteModel: NoteModel) {
            binding.pinnedtitle.text = noteModel.title
            binding.pinneddescription.text = noteModel.note
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PinnedViewHolder {
        val binding: PinnedItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.pinned_item, parent, false)
        return PinnedViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PinnedViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}