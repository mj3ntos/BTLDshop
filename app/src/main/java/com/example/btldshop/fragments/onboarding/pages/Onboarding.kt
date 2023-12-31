package com.example.btldshop.fragments.onboarding.pages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.inflate
import androidx.fragment.app.viewModels
import com.example.btldshop.R
import com.example.btldshop.databinding.BindOnboard
import com.example.btldshop.fragments.onboarding.viewmodel.OnboardViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class Onboarding : Fragment() {
    private var binding : BindOnboard?= null
    private val onboardVM : OnboardViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = inflate(inflater, R.layout.fragment_onboarding, container, false)

        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}