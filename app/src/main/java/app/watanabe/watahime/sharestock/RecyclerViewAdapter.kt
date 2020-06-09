package app.watanabe.watahime.sharestock

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.firestore.FirestoreRecyclerOptions

    class  RecyclerViewAdapter {
        private inner class FirestoreRecyclerAdapter internal constructor(options: FirestoreRecyclerOptions<>) :
            RecyclerView.ViewHolder<RecyclerViewAdapter, RecyclerView.ViewHolder>(options) {
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_memo_data_cell, parent, false)
                return RecyclerView.ViewHolder(view)
            }

            override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int, model:MemoData) {
                holder.setMemodata(model.favorite!!, model.address!!)
            }
        }
    }

