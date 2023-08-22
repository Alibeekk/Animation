package dev.alibek.animation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        val bBounce = findViewById<Button>(R.id.b_bounce)
        val bSquential = findViewById<Button>(R.id.b_squential)
        val iv = findViewById<ImageView>(R.id.iv)
        val bTogather = findViewById<Button>(R.id.b_togather)
        val bFacebook = findViewById<Button>(R.id.b_facebook)
        val bYouTube = findViewById<Button>(R.id.b_youtube)
        val bTwitter = findViewById<Button>(R.id.b_twitter)
        var lavAnim=findViewById<LottieAnimationView>(R.id.anim)

        bBounce.setOnClickListener {
            val bounc = AnimationUtils.loadAnimation(this, R.anim.bounce)
            iv.startAnimation(bounc)
        }
        bSquential.setOnClickListener {
            val squential = AnimationUtils.loadAnimation(this, R.anim.squential)
            iv.startAnimation(squential)
        }
        bTogather.setOnClickListener {
            val togather = AnimationUtils.loadAnimation(this, R.anim.togather)
            iv.startAnimation(togather)
        }
        bFacebook.setOnClickListener {
            lavAnim.setAnimation("facebook.json")
            lavAnim.playAnimation()
        }
        bTwitter.setOnClickListener {
            lavAnim.setAnimation("twitter.json")
            lavAnim.playAnimation()
        }
        bYouTube.setOnClickListener {
            lavAnim.setAnimation("youtube.json")
            lavAnim.playAnimation()
        }
    }
}