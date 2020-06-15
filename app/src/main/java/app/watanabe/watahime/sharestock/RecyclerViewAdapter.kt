package app.watanabe.watahime.sharestock

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.firestore.FirestoreRecyclerAdapter
import com.firebase.ui.firestore.FirestoreRecyclerOptions

class RecyclerViewAdapter (private val context : Context):
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    val items: MutableList<memoData> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.item_memo_data_cell, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

   override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.favoriteTextView.text = item.favorite
        holder.addressTextView.text = item.address
       holder.percentTextView.text = item.percent
    }

    fun addAll(items:List<memoData>) {
        this.items.addAll(items)
        notifyDataSetChanged()
   }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
   val favoriteTextView: TextView = view.findViewById(R.id.favorite1)
        val addressTextView: TextView = view.findViewById(R.id.address1)
        val percentTextView: TextView = view.findViewById(R.id.percent1)

    }
}