package com.example.btldshop.fragments.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("app:bind")
fun ImageView.bind(url: String){
    Glide.with(this.context).load(url).into(this)

}