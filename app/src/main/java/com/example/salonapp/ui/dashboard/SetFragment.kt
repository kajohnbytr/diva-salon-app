package com.example.salonapp.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.salonapp.R
import com.example.salonapp.adapters.HomeStyAdapter
import com.example.salonapp.databinding.FragmentSetBinding
import com.example.salonapp.models.Model

class SetFragment : Fragment() {

    private var _binding: FragmentSetBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSetBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recyclerView = binding.stylistRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        val stylistList = mutableListOf(
            Model(R.drawable.stylist_1, "Savannah"),
            Model(R.drawable.stylist_2, "Ralph"),
            Model(R.drawable.stylist_5, "Eleanor"),
            Model(R.drawable.stylist_4, "Brooklyn")

        )

        val stylistAdapter = HomeStyAdapter(requireContext(), stylistList)

        binding.stylistRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            adapter = stylistAdapter
            setHasFixedSize(true)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
