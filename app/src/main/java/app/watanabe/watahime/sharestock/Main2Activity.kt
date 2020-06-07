package app.watanabe.watahime.sharestock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        auth = FirebaseAuth.getInstance()

        button1.setOnClickListener {

            val emailText = editText.text.toString()
            val passText = editText2.text.toString()

            auth.signInWithEmailAndPassword(emailText, passText)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(
                            baseContext, "Login 成功",
                            Toast.LENGTH_SHORT
                        ).show()

                        val memoA = Intent ( this, Main5Activity::class.java)
                        startActivity(memoA)



                    } else {
                        Toast.makeText(
                            baseContext, "Login 失敗",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
        }
    }
}




