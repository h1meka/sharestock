package app.watanabe.watahime.sharestock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main5.*

class Main5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        fab1.setOnClickListener {

            val map = Intent (this,MapsActivity::class.java)
            startActivity(map)
        }

        imageBUTTON.setOnClickListener {

            val main = Intent (this,Main4Activity::class.java)
            startActivity(main);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        }

        fab.setOnClickListener {

            val favorite = Intent ( this,Main7Activity::class.java)
            startActivity(favorite)
        }
    }
}
