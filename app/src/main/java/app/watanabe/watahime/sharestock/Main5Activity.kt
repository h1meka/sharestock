package app.watanabe.watahime.sharestock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query

import kotlinx.android.synthetic.main.activity_main5.*
import kotlinx.android.synthetic.main.activity_main5.addmemobutton
import kotlinx.android.synthetic.main.activity_main7.*
import kotlinx.android.synthetic.main.item_memo_data_cell.*
import java.lang.reflect.Array.get
import java.lang.reflect.Modifier.toString
import java.util.Arrays.toString
import java.util.Objects.toString
import kotlin.Unit.toString

class Main5Activity : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()



    val Memodata: List<memoData>
            = listOf(memoData())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val adapter = RecyclerViewAdapter(this)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = adapter
        adapter.addAll(Memodata)

        mapbutton.setOnClickListener {
                val map = Intent(this, MapsActivity::class.java)
                startActivity(map)
            }

            addmemobutton.setOnClickListener {
                val favorite = Intent(this, Main7Activity::class.java)
                startActivity(favorite)
            }
        }
    }







