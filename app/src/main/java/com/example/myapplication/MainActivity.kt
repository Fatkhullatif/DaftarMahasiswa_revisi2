package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Daftar mahasiswa
        val students = listOf(
            "Nama: Mahasiswa 1                     NIM: 1234567890",
            "Nama: Mahasiswa 2                     NIM: 1234567890",
            "Nama: Mahasiswa 3                     NIM: 1234567890",
            "Nama: Mahasiswa 4                     NIM: 1234567890",
            "Nama: Mahasiswa 5                     NIM: 1234567890",
            "Nama: Fatkhul Latif                    NIM: SSI202203159",
            "Nama: Mahasiswa 7                     NIM: 1234567890",
            "Nama: Mahasiswa 8                     NIM: 1234567890",
            "Nama: Mahasiswa 9                     NIM: 1234567890",
            "Nama: Mahasiswa 10                     NIM: 1234567890",
            "Nama: Mahasiswa 11                     NIM: 1234567890"
        )

        // Map ID TextView ke daftar mahasiswa
        val studentTextViews = listOf(
            findViewById<TextView>(R.id.student1),
            findViewById<TextView>(R.id.student2),
            findViewById<TextView>(R.id.student3),
            findViewById<TextView>(R.id.student4),
            findViewById<TextView>(R.id.student5),
            findViewById<TextView>(R.id.student6),
            findViewById<TextView>(R.id.student7),
            findViewById<TextView>(R.id.student8),
            findViewById<TextView>(R.id.student9),
            findViewById<TextView>(R.id.student10),
            findViewById<TextView>(R.id.student11)
        )

// TextView sesuai dengan daftar mahasiswa
        for ((index, textView) in studentTextViews.withIndex()) {
            textView.text = students[index]
        }
    }
}
