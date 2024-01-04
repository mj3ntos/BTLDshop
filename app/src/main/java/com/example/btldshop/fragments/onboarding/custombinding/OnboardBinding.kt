package com.example.btldshop.fragments.onboarding.custombinding

import android.widget.ImageView
import androidx.databinding.Bindable
import androidx.databinding.BindingAdapter
import androidx.databinding.Observable
import androidx.databinding.PropertyChangeRegistry
import androidx.databinding.library.baseAdapters.BR
import com.bumptech.glide.Glide


class OnboardBinding: Observable {

    @get:Bindable
    var slogstitle : String ?= null

        set(value) {
            field = value
            listener.notifyChange(this, BR.slogstitle)
        }

    @get:Bindable
    var slogsdesc : String ?= null
        set(value) {
            field = value
            listener.notifyChange(this, BR.slogsdesc)
        }




    val listener : PropertyChangeRegistry = PropertyChangeRegistry()
    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        listener.add(callback)
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        listener.remove(callback)
    }

}