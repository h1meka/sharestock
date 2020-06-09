package app.watanabe.watahime.sharestock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val db = FirebaseFirestore.getInstance()

        registorbutton.setOnClickListener {
            if (usernemaText.text.isNotEmpty()){

                val information = hashMapOf(
                    "username" to usernemaText.text.toString())

                db.collection("information")
                    .add(information)
            }

           val memo = Intent ( this, Main5Activity::class.java)
           startActivity(memo)
        }
    }
}

