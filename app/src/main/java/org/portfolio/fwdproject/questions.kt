package org.portfolio.fwdproject

import android.os.Bundle
import android.speech.tts.TextToSpeech
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.questions.*
import kotlinx.android.synthetic.main.questions.view.*
import java.util.*


class questions : Fragment() {
     var que:Array<String>?=null
    lateinit var tos:TextToSpeech
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.questions, container, false)


        //Text To Speech
        tos= TextToSpeech(view.context, TextToSpeech.OnInitListener {
            tos.setLanguage(Locale.ENGLISH)
        })
        view.speak.setOnClickListener{
            tos.speak(view.questionsview.text.toString(),TextToSpeech.QUEUE_FLUSH,null,null)
        }




        que= resources.getStringArray(R.array.question)
        var i = 1
        view.number.text="$i/10"
        view.questionsview.text= que!![0]

        view.next.setOnClickListener{
            if(i<=9)
            { i+=1
            number.text="$i/10"
            questionsview.text= que!![i-1]}
        }


        view.back.setOnClickListener{
            if(i>=2)
            { i-=1
                number.text="$i/10"
                questionsview.text= que!![i-1]}
        }



        return view
    }



}