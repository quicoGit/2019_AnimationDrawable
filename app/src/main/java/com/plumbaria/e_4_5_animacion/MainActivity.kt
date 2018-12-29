package com.plumbaria.e_4_5_animacion

import android.graphics.Color
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var animacion:AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        animacion = ContextCompat.getDrawable(this.applicationContext,R.drawable.animacion) as AnimationDrawable
        var imageView:ImageView = ImageView(this)
        imageView.setBackgroundColor(Color.WHITE)
        imageView.setImageDrawable(animacion)
        imageView.setOnClickListener(this)

        setContentView(imageView)
    }

    override fun onClick(v: View?) {
        animacion.start()
    }
}
