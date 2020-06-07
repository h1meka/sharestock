package app.watanabe.watahime.sharestock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_main7.*

class Main7Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        //val db = FirebaseFirestore.getInstance()

        // Create a new user with a first and last name
//        RBUTTON.setOnClickListener {
//            val memo1 = hashMapOf(
//                "favorite" to editText5.text.toString(),
//                "address" to editText6.text.toString()
//            )
//
//// Add a new document with a generated ID
//            db.collection("placememo")
//                .add(memo1)
//
//
//        }

        imageBUTTON.setOnClickListener {
            val memo2 = Intent(this,Main5Activity::class.java)
            startActivity(memo2);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        }
    }
}
