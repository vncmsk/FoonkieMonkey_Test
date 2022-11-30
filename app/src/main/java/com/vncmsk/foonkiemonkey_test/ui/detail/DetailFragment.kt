package com.vncmsk.foonkiemonkey_test.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vncmsk.foonkiemonkey_test.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

  private lateinit var binding: FragmentDetailBinding

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    binding = FragmentDetailBinding.inflate(inflater, container, false)
    return binding.root
  }
}