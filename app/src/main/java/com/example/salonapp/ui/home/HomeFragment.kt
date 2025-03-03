package com.example.salonapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.salonapp.R
import com.example.salonapp.adapters.HomeHorAdapters
import com.example.salonapp.adapters.HomeStyAdapter
import com.example.salonapp.databinding.FragmentHomeBinding
import com.example.salonapp.models.Model

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private lateinit var homeHorModelList: MutableList<Model>
    private lateinit var adapter: HomeHorAdapters

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Initialize Horizontal Services RecyclerView
        homeHorModelList = mutableListOf(
            Model(R.drawable.hair_coloring_1, "Hair Coloring"),
            Model(R.drawable.haircut_1, "Haircut"),
            Model(R.drawable.salon_1, "Salon"),
            Model(R.drawable.facial_1, "Facial"),
            Model(R.drawable.manicure_1, "Manicure"),
            Model(R.drawable.pedicure_1, "Pedicure")
        )

        adapter = HomeHorAdapters(requireContext(), homeHorModelList)

        binding.servicesHome.apply {
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            adapter = this@HomeFragment.adapter
            setHasFixedSize(true)
            isNestedScrollingEnabled = false
        }

        // Initialize Stylist RecyclerView
        val stylistList = mutableListOf(
            Model(R.drawable.stylist_1, "Savannah"),
            Model(R.drawable.stylist_2, "Ralph"),
            Model(R.drawable.stylist_5, "Eleanor"),
            Model(R.drawable.stylist_4, "Brooklyn")

        )

        val stylistAdapter = HomeStyAdapter(requireContext(), stylistList)

        binding.stylistRecycler.apply {
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
