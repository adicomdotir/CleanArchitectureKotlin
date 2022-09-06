package com.example.myapplication.presentation

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.core.data.Note
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import androidx.databinding.DataBindingUtil
import com.example.myapplication.R
import com.example.myapplication.databinding.ItemNoteBinding
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList


class NotesListAdapter(var notes: ArrayList<Note>, val action: ListAction): RecyclerView.Adapter<NotesListAdapter.NoteViewHolder>() {

    fun updateNotes(newNotes: List<Note>) {
        notes.clear()
        notes.addAll(newNotes)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val binding: ItemNoteBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_note, parent, false)
        return NoteViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.bind(notes[position])
    }

    override fun getItemCount() = notes.size

    inner class NoteViewHolder(binding: ItemNoteBinding): RecyclerView.ViewHolder(binding.root) {
        private val layout = binding.noteLayout
        private val noteTitle = binding.title
        private val noteContent = binding.content
        private val noteDate = binding.date

        fun bind(note: Note) {
            noteTitle.text = note.title
            noteContent.text = note.content

            val sdf = SimpleDateFormat("MMM dd, HH:mm:ss")
            val resultDate = Date(note.updateTime)
            noteDate.text = "Last updated: ${sdf.format(resultDate)}"

            layout.setOnClickListener {
                action.onClick(note.id)
            }
        }
    }
}