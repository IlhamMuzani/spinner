package com.ilham.dropdownbuttoncategory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var list: Spinner
    private lateinit var btn_pilih: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setMenu()

        list = findViewById(R.id.list_pembuatan)
        btn_pilih = findViewById(R.id.btn_pilih)

        btn_pilih.setOnClickListener {
            val toast =
                Toast.makeText(this, "Kamu memilih ${list.selectedItem}", Toast.LENGTH_SHORT)
            toast.show()
        }
    }

    fun setMenu() {

        btn_lanjutkan.setOnClickListener {
            startActivity(Intent(this, GetDataActivity::class.java))
        }
    }
}