package com.example.myapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.myapplication.R
import com.example.myapplication.adapters.PinnedAdapter
import com.example.myapplication.databinding.FragmentHomeBinding
import com.example.myapplication.models.NoteModel
import java.util.*

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater ,R.layout.fragment_home, container, false)
        setupPinnedRecyclerView()
        return binding.root
    }

    private fun setupPinnedRecyclerView() {
        val data = ArrayList<NoteModel>()
        data.add(NoteModel("Note 1", "This is Note 1"))
        data.add(NoteModel("Note 2", "This is Note 2"))
        data.add(NoteModel("Note 3", "This is Note 3"))

        if (data.isEmpty()) {
            binding.pinnedCon.visibility = View.GONE
        } else {
            binding.pinnedCon.visibility = View.VISIBLE
        }

        binding.pinnedRv.adapter = PinnedAdapter(data)
    }

}