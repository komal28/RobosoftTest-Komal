package com.robosofttest.ui.activity
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.robosofttest.databinding.ActivitySplashScreenBinding

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewBinding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        Handler(Looper.getMainLooper()).postDelayed({
            Handler(Looper.getMainLooper()).postDelayed({
                Handler(Looper.getMainLooper()).postDelayed({
                    Handler(Looper.getMainLooper()).postDelayed({
                        Handler(Looper.getMainLooper()).postDelayed({
                            Handler(Looper.getMainLooper()).postDelayed({
                                Handler(Looper.getMainLooper()).postDelayed({
                                    viewBinding.txtViewC.visibility = View.VISIBLE
                                    val secondActivityIntent =
                                        Intent(this, MainActivity::class.java)
                                    startActivity(secondActivityIntent)
                                }, 500)
                                viewBinding.txtViewB.visibility = View.VISIBLE
                            }, 500)
                            viewBinding.txtViewA.visibility = View.VISIBLE
                        }, 500)
                        viewBinding.txtAppName.visibility = View.VISIBLE
                    }, 500)
                    viewBinding.view3.visibility = View.VISIBLE
                }, 1000)
                viewBinding.view2.visibility = View.VISIBLE
            }, 1000)
            viewBinding.view1.visibility = View.VISIBLE
        }, 1000)
    }
}
