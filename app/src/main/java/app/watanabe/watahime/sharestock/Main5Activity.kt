package app.watanabe.watahime.sharestock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import kotlinx.android.synthetic.main.activity_main5.*
import kotlinx.android.synthetic.main.activity_main5.addmemobutton
import kotlinx.android.synthetic.main.activity_main6.*
import kotlinx.android.synthetic.main.activity_main7.*
import kotlinx.android.synthetic.main.item_memo_data_cell.*

class Main5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)


        RBUTTON.setOnClickListener {
            val db = FirebaseFirestore.getInstance()
            val query = db.collection("placememo").orderBy("favorite", Query.Direction.ASCENDING)
            val options = FirestoreRecyclerOptions.Builder<Main4Activity>()
                .setQuery(query, Main4Activity::class.java)

            class holder {

                private inner class ViewHolder internal constructor(private val view: View) :
                    RecyclerView.ViewHolder(view) {
                    internal fun setMemo(favorite: String, address: String) {

                        val textviewF = view.findViewById<TextView>(R.id.favorite1)
                        textviewF.text = favorite

                        val textviewA = view.findViewById<TextView>(R.id.address1)
                        textviewA.text = address

                    }
                }
            }
        }

        override fun onStart() {
            super.onStart()
            adapter!!.startListening()
        }
        override fun onStop() {
            super.onStop()

            if(adapter != null){
                adapter!!.stopListening()
            }
        }

            mapbutton.setOnClickListener {

            val map = Intent (this,MapsActivity::class.java)
            startActivity(map)
        }
            backbutton.setOnClickListener {

            val main = Intent (this,Main4Activity::class.java)
            startActivity(main);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        }
            addmemobutton.setOnClickListener {

            val favorite = Intent ( this,Main7Activity::class.java)
            startActivity(favorite)
        }
    }
}


