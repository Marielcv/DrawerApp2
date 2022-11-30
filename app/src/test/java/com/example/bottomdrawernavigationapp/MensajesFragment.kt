package com.example.bottomdrawernavigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

//R.layout.fragment_mensajes
class MensajesFragment : Fragment() {
    private lateinit var tvMensajes:TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_mensajes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvMensajes = view.findViewById(R.id.tv_Mensajes)

        tvMensajes.text = "Estoy envien un dato distinto"
    }





}