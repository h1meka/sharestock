package app.watanabe.watahime.sharestock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Button2.setOnClickListener {

            val signin = Intent (this,Main2Activity::class.java)
            startActivity(signin)
        }

        Button.setOnClickListener {

            val account = Intent ( this,Main3Activity::class.java)
            startActivity(account)
        }

        // Access a Cloud Firestore instance from your Activity
        val db = FirebaseFirestore.getInstance()

        // Create a new user with a first and last name
        val user = hashMapOf(
            "first" to "Ada",
            "last" to "Lovelace",
            "born" to 1815
        )

// Add a new document with a generated ID
        db.collection("users")
            .add(user)
            .addOnSuccessListener { documentReference ->
                Log.d("hoge", "DocumentSnapshot added with ID: ${documentReference.id}")
            }
//            .addOnFailureListener { e ->
//                Log.w("hoge", "Error adding document", e)
//            }

        db.collection("users")
            .get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    Log.d("hoge", "${document.id} => ${document.data}")
                }
            }
//            .addOnFailureListener { exception ->
//                Log.w("hoge", "Error getting documents.", exception)
//            }

        // Create a new user with a first, middle, and last name












    }


}













