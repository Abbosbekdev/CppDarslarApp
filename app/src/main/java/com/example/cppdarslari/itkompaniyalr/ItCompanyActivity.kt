package com.example.cppdarslari.itkompaniyalr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cppdarslari.R
import kotlinx.android.synthetic.main.activity_it_company.*

class ItCompanyActivity : AppCompatActivity() {
    val companyimages = arrayOf(
        R.drawable.google,
        R.drawable.facebook,
        R.drawable.apple,
        R.drawable.microsoft,
    )
    val googleImages = arrayOf(
        R.drawable.google,
        R.drawable.google2,
        R.drawable.google3,
        R.drawable.google4
    )
    val appleImages = arrayOf(
        R.drawable.apple,
        R.drawable.apple2,
        R.drawable.apple3,
        R.drawable.apple4,
    )
    val facebookImages = arrayOf(
        R.drawable.facebook,
        R.drawable.facebook2,
        R.drawable.facebook3,
        R.drawable.facebook4
    )
    val microsoftImages = arrayOf(
        R.drawable.microsoft,
        R.drawable.microsoft2,
        R.drawable.microsoft3,
        R.drawable.microsoft4,
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_it_company)

        carouselViewGoogle.pageCount = googleImages.count()
        carouselViewGoogle.setImageListener { position, imageView ->
            imageView.setImageResource(googleImages[position])
        }
        carouselViewApple.pageCount = appleImages.count()
        carouselViewApple.setImageListener { position, imageView ->
            imageView.setImageResource(appleImages[position])
        }
        carouselViewFacebook.pageCount = facebookImages.count()
        carouselViewFacebook.setImageListener { position, imageView ->
            imageView.setImageResource(facebookImages[position])
        }
        carouselViewMicrosoft.pageCount = microsoftImages.count()
        carouselViewMicrosoft.setImageListener { position, imageView ->
            imageView.setImageResource(microsoftImages[position])
        }
        tvGoogle.text = getString(R.string.google)
        tvApple.text = getString(R.string.apple)
        tvFacebook.text = getString(R.string.meta)
        tvMicrosoft.text = getString(R.string.microsoft)
    }
}