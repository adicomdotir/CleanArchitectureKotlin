package com.example.myapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentSingleNoteBinding

class SingleNoteFragment : Fragment() {
    private lateinit var binding: FragmentSingleNoteBinding
    private var savedColor = "#64C8FD"


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_single_note, container, false)
        binding.singleNote = this

        binding.fabcheckBtn.setOnClickListener {
        }

        return binding.root
    }

    fun onColorViewClick(check: View){
        hideAllCheck()
        check.visibility = View.VISIBLE

        when(check.id){
            binding.check1.id -> savedColor = "#64C8FD"
            binding.check2.id -> savedColor = "#8069FF"
            binding.check3.id -> savedColor = "#FFCC36"
            binding.check4.id -> savedColor = "#D77FFD"
            binding.check5.id -> savedColor = "#FF419A"
            binding.check6.id -> savedColor = "#7FFB76"
        }

    }

    private fun hideAllCheck(){
        binding.check1.visibility = View.INVISIBLE
        binding.check2.visibility = View.INVISIBLE
        binding.check3.visibility = View.INVISIBLE
        binding.check4.visibility = View.INVISIBLE
        binding.check5.visibility = View.INVISIBLE
        binding.check6.visibility = View.INVISIBLE
    }

    fun onAddNoteClick(view: View) {
    }
}