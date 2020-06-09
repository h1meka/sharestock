package app.watanabe.watahime.sharestock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_main7.*
import kotlinx.android.synthetic.main.activity_main7.addresstext
import kotlinx.android.synthetic.main.item_memo_data_cell.*

class Main7Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        val db = FirebaseFirestore.getInstance()

       RBUTTON.setOnClickListener {
            val memo1 = hashMapOf(
               "favorite" to favorite1.text.toString(),
                "address" to addresstext.text.toString()
           )
           val favorite = favoritetext.text.toString()
           val address = addresstext.text.toString()
           val memo = MemoData(favorite, address)

           db.collection("placememo")
               .add(memo1)
       }

        backbutton2.setOnClickListener {
            val memo2 = Intent(this,Main5Activity::class.java)
            startActivity(memo2);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        }
    }
}

