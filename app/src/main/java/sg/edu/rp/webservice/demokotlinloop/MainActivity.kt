package sg.edu.rp.webservice.demokotlinloop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCount.setOnClickListener {
//            for (i in 1..5){
//                Log.d("MainActivity","$i")
//
//        }
            var i = 1
            while (i<6){
                Log.d("MainActivity","$i")
                i++
            }
        }

        btnLetter.setOnClickListener {
            val word = etWord.text.toString()
            for (theletter in word){
                Log.d("MainActivity","$theletter")
            }
        }
    }
}
