package com.vncmsk.foonkiemonkey_test.ui.frontMain

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.vncmsk.foonkiemonkey_test.R
import com.vncmsk.foonkiemonkey_test.databinding.FragmentMainBinding
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

  private lateinit var binding: FragmentMainBinding

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    binding = FragmentMainBinding.inflate(inflater, container, false)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    button_getInTouch.setOnClickListener {
      callMail()
    }

    button_getInTouch2.setOnClickListener {
      callMail()
    }

    button_menu.setOnClickListener {
      it.findNavController().navigate(R.id.listFragment)
    }
  }

  private fun callMail() {

    val address = "contact@foonkiemonkey.co.uk"
    val subject = "I want a quote"
    val body = "Hi there! I need you to build an application"

    val sendMail = Intent(Intent.ACTION_SEND).apply {

      data = Uri.parse("mailto:")

      putExtra(Intent.EXTRA_EMAIL, arrayOf(address))
      putExtra(Intent.EXTRA_SUBJECT,subject)
      putExtra(Intent.EXTRA_TEXT,body)
    }

    startActivity(sendMail)
  }
}