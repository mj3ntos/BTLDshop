package com.example.btldshop.fragments.onboarding.viewmodel

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.btldshop.fragments.onboarding.custombind.OnboardBinding
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OnboardViewModel @Inject constructor(private val onboardBinding: OnboardBinding): ViewModel() {
    fun getStart(view: View){

    }

    init {
        onboardBinding.slogstitle=""
        onboardBinding.slogsdesc="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."

    }


}