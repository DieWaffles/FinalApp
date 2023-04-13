package edu.usna.mobileos.finalapp

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidmads.library.qrgenerator.QRGContents
import androidmads.library.qrgenerator.QRGEncoder

class GenQRCode : AppCompatActivity() {
    lateinit var qrView : ImageView
    lateinit var bitMap : Bitmap
    lateinit var qrEncoder : QRGEncoder
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gen_qrcode)
        QRGEncoder
    }
}