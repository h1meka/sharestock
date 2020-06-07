package app.watanabe.watahime.sharestock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main6.*

class Main6Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        imageBUTTON.setOnClickListener {

            val main1 = Intent ( this, Main4Activity::class.java)
            startActivity(main1)
        }

        addbutton.setOnClickListener {

            val main = Intent ( this,Main4Activity::class.java)
            startActivity(main)
        }
    }
}
