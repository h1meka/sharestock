package app.watanabe.watahime.sharestock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_main5.*
import kotlinx.android.synthetic.main.activity_main5.imageBUTTON
import kotlinx.android.synthetic.main.activity_main7.*
import kotlinx.android.synthetic.main.item_memo_data_cell.*

class Main5Activity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val db = FirebaseFirestore.getInstance()

        RBUTTON.setOnClickListener {
            val memo1 = hashMapOf(
                "favorite" to editText5.text.toString(),
                "address" to editText6.text.toString()
            )

// Add a new document with a generated ID
            db.collection("placememo")
                .add(memo1)


        }



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
