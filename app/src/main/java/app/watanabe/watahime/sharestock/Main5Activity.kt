package app.watanabe.watahime.sharestock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.common.io.Files.copy
import com.google.firebase.firestore.FirebaseFirestore

import kotlinx.android.synthetic.main.activity_main5.*
import kotlinx.android.synthetic.main.activity_main5.addmemobutton
import java.lang.invoke.MethodHandleInfo.toString
import java.util.Collections.copy
import java.util.Collections.list
import kotlin.Unit.toString

class Main5Activity : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val docRef = db.collection("memo")
        docRef.get().addOnSuccessListener {
                documentSnapshot ->
            val memo = listOf(documentSnapshot.toObjects(memoData::class.java))

            Log.d("hoge","${memo.toString()}}")
        }


        val adapter = RecyclerViewAdapter(this)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = adapter

        adapter.addAll(memo)

        button.setOnClickListener {
                val map = Intent(this, Main2Activity::class.java)
                startActivity(map)
            }
            addmemobutton.setOnClickListener {
                val favorite = Intent(this, Main7Activity::class.java)
                startActivity(favorite)
            }
        }
    }







