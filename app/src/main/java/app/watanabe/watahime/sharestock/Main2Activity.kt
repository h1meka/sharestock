package app.watanabe.watahime.sharestock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main5.*
import kotlinx.android.synthetic.main.activity_main7.*
import kotlin.random.Random

class Main2Activity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        backbutton3.setOnClickListener {
            val favorit = Intent(this, Main5Activity::class.java)
            startActivity(favorit)
            overridePendingTransition(
                android.R.anim.slide_in_left,
                android.R.anim.slide_out_right
            )
        }


    }
        //BUTTON.setOnClickListener {
        fun decide (view: View?){

            val random = arrayOf<String>(
                editText.text.toString(),
                editText2.text.toString(),
                editText3.text.toString(),
                editText4.text.toString(),
                editText5.text.toString()
            )
            val randomName = Random
            val index = randomName.nextInt(4)
            val name = random[index]
            textView.text = name


        }






    }


