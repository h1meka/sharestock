package app.watanabe.watahime.sharestock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main4.*

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        recyclerView.setOnClickListener {

            val note = Intent (this,Main5Activity::class.java)
            startActivity(note)

        }

        imageButton2.setOnClickListener {

            val add = Intent (this,Main6Activity::class.java)
            startActivity(add)
        }

        // Create a new user with a first and last name

    }
}
