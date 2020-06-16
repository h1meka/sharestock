package app.watanabe.watahime.sharestock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import kotlinx.android.synthetic.main.activity_main.*

import kotlinx.android.synthetic.main.activity_main5.*
import kotlinx.android.synthetic.main.activity_main5.addmemobutton

class Main5Activity : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)



        val docRef = db.collection("memomemo")
        docRef.get().addOnSuccessListener { documentSnapshot ->
            val memo
            // :List<memoData>
                    = documentSnapshot.toObjects(memoData::class.java)

            Log.d("hoge", "${memo.toString()}}")



        val adapter = RecyclerViewAdapter(this)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = adapter


        adapter.addAll(memo)}

        button.setOnClickListener {
                val map = Intent(this, Main2Activity::class.java)
                startActivity(map)
        }
        addmemobutton.setOnClickListener {
            val favorite = Intent(this, Main7Activity::class.java)
            startActivity(favorite)
        }

        val itemTouchHelperCallback = object : ItemTouchHelper.SimpleCallback (0,ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT){
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return false
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                




            }
        }

        val itemTouchHelper = ItemTouchHelper(itemTouchHelperCallback)
        itemTouchHelper.attachToRecyclerView(recyclerview)


    }



//    private fun getSwipeToDismissTouchHelper(adapter: RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>) =
//        ItemTouchHelper(object : ItemTouchHelper.SimpleCallback(
//            ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT,
//            ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT
//        ) {
//            override fun onMove(
//                recyclerView: RecyclerView,
//                viewHolder: RecyclerView.ViewHolder,
//                target: RecyclerView.ViewHolder
//            ): Boolean {
//                return false
//            }
//
//            //スワイプ時に実行
//            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
//                //データリストからスワイプしたデータを削除
//               // memoData.removeAt(viewHolder.adapterPosition)
//
//                //リストからスワイプしたカードを削除
//                adapter.notifyItemRemoved(viewHolder.adapterPosition)
//            }
//
//        })



}
