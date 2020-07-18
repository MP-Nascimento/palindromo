package com.example.palindromo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.palindromo.domain.Palindromo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_verificar.setOnClickListener(this)
    }

    override fun onClick(view: View?) {

        val palindromo = Palindromo(et_palindromo.text.toString().trim())

        tv_resposta.text = if(palindromo.ehPalindromo())

            "${palindromo.conteudo} é um Palindromo"
        else
            "${palindromo.conteudo} Não é um palindromo"

    }
}