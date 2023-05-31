package com.mobile.pemasaranproduk.presentation.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mobile.pemasaranproduk.R
import com.mobile.pemasaranproduk.databinding.FragmentHomeBinding
import android.view.*

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var recommendProductAdapter: RecommendProductAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return _binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecommendProduct()
        onAction()
    }

    private fun onAction() {
        binding.etSearchHome.setOnClickListener {  }

        binding.btnCurrentLocation.setOnClickListener {  }

        recommendProductAdapter.onClick {

        }
    }

    private fun initRecommendProduct() {
        recommendProductAdapter = RecommendProductAdapter()
        binding.rvRecommendProductHome.adapter = recommendProductAdapter
    }

}