import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main7.view.*

class ViewHolder (itemView: View) :RecyclerView.ViewHolder(itemView){
    var favorite: TextView? = null
    var address : TextView? = null

    init {
        favorite = itemView.favoritetext
        address = itemView.addresstext
    }
}


