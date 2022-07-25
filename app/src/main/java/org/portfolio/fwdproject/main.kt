package org.portfolio.fwdproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.main.*
import kotlinx.android.synthetic.main.main.view.*


class main : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view=inflater.inflate(R.layout.main, container, false)

        view.questions1.setOnClickListener{
            findNavController().navigate(R.id.action_main_to_questions2)
        }
        view.answer.setOnClickListener{
            findNavController().navigate(R.id.action_main_to_answer2)
        }
        return view
    }


}