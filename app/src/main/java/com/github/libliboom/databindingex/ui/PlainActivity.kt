package com.github.libliboom.databindingex.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.github.libliboom.databindingex.R
import com.github.libliboom.databindingex.data.SimpleViewModel
import com.github.libliboom.databindingex.databinding.ActivityPlainBinding

/**
 * Plain old activity with lots of problems to fix.
 */

class PlainActivity : AppCompatActivity() {

    // Obtain ViewModel from ViewModelProviders
    private val viewModel by lazy {
        ViewModelProviders.of(this).get(SimpleViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /** activity_plain -> ActivityPlainBinding **/
        val binding: ActivityPlainBinding =
            DataBindingUtil.setContentView(this,
                R.layout.activity_plain
            )

        binding.lifecycleOwner = this

        binding.viewmodel = viewModel
    }
}