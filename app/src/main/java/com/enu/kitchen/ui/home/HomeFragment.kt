package com.enu.kitchen.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.enu.kitchen.R
import com.enu.kitchen.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val data = arrayListOf<Kitchen>()
        data.add(Kitchen(R.string.tort1, R.drawable.tort1, R.string.text_tort1))
        data.add(Kitchen(R.string.tort2, R.drawable.tort2, R.string.text_tort2))
        data.add(Kitchen(R.string.tort3, R.drawable.tort3, R.string.text_tort3))
        data.add(Kitchen(R.string.tort4, R.drawable.tort4, R.string.text_tort4))
        data.add(Kitchen(R.string.tort5, R.drawable.tort5, R.string.text_tort5))
        val adapter = context?.let { KitchenAdapter(data, it) }
        binding.recyclerView.adapter = adapter
        return root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}