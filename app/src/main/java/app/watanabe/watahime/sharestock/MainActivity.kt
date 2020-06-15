package app.watanabe.watahime.sharestock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main5.*

class MainActivity : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()


    //val Memodata: List<memoData>
    // = listOf()

    // private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//            val adapter = RecyclerViewAdapter(this)
//        recyclerview.layoutManager = LinearLayoutManager(this)
//        recyclerview.adapter = adapter
//        adapter.addAll(Memodata)

//        mapbutton.setOnClickListener {
//                val map = Intent(this, MapsActivity::class.java)
//                startActivity(map)
//            }

//        addmemobutton.setOnClickListener {
//            val favorite = Intent(this, Main7Activity::class.java)
//            startActivity(favorite)
//        }
//    }
//}
//


//        auth = FirebaseAuth.getInstance()
//
//        sakuseibutton.setOnClickListener {
//
//            val emailText = emailText.text.toString()
//            val passText = passwordText.text.toString()
//
//            auth.createUserWithEmailAndPassword(emailText, passText)
//                .addOnCompleteListener(this) { task ->
//                    if (task.isSuccessful) {
//                        Toast.makeText(
//                            baseContext, "SignUp 成功",
//                            Toast.LENGTH_LONG
//                        ).show()
//
//                        val account = Intent ( this,Main3Activity::class.java)
//                        startActivity(account)
//                    } else {
//                        Toast.makeText(
//                            baseContext, "SignUp 失敗",
//                            Toast.LENGTH_LONG
//                        ).show()
//                    }
//                }
//        }
//
        button_.setOnClickListener {

            val signin = Intent(this, Main5Activity::class.java)
            startActivity(signin)
        }
    }
}

//
//            if (Text2.text.isNotEmpty()&&Text1.text.isNotEmpty()){
//
//                val account1 = hashMapOf(
//                    "email" to Text1.text.toString(),
//                    "password" to Text2.text.toString())
//
//                db.collection("account")
//                    .add(account1)
//                    .addOnSuccessListener {Toast.makeText(applicationContext,"アカウントが作られました",Toast.LENGTH_SHORT).show()
//                    }
//                    .addOnFailureListener {Toast.makeText(applicationContext,"アカウント作成に失敗しました",Toast.LENGTH_SHORT).show()
//                    }
//


//        }

//        auth = FirebaseAuth.getInstance()}
//
//         override fun onStart() {
//             super.onStart()
//             // Check if user is signed in (non-null) and update UI accordingly.
//             val currentUser = auth.currentUser
             //updateUI(currentUser)


//        val emailEditText = findViewById<EditText>(R.id.Text1)
//        val emailText = emailEditText.text.toString()
//
//        val passEditText = findViewById<EditText>(R.id.Text2)
//        val passText = passEditText.text.toString()

//             auth.createUserWithEmailAndPassword(Text1.text.toString(), Text2.text.toString())
//                 .addOnCompleteListener(this) { task ->
//                     if (task.isSuccessful) {
//                         // Sign in success, update UI with the signed-in user's information
//                         Log.d("a", "createUserWithEmail:success")
//                         val user = auth.currentUser
//                         //updateUI(user)
//                     } else {
//                         // If sign in fails, display a message to the user.
//                         Log.w("a", "createUserWithEmail:failure", task.exception)
//                         Toast.makeText(
//                             baseContext, "Authentication failed.",
//                             Toast.LENGTH_SHORT
//                         ).show()
//                         //updateUI(null)
//                     }

                     // ...


//        auth.createUserWithEmailAndPassword(emailText, passText)
//            .addOnCompleteListener(this) { task ->
//                if (task.isSuccessful) {
//                    Toast.makeText(
//                        baseContext, "SignUp 成功",
//                        Toast.LENGTH_SHORT
//                    ).show()
//                } else {
//                    Toast.makeText(
//                        baseContext, "SignUp 失敗",
//                        Toast.LENGTH_SHORT
//                    ).show()
//                }
//            }




























