import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.salonapp.R
import com.example.salonapp.models.Model

class SetFragAdapt(private val context: Context, private val stylists: List<Model>) :
    RecyclerView.Adapter<SetFragAdapt.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.stylist_img) // Assuming you have a name field
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.home_stylist, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = stylists[position]
        holder.imageView.setImageResource(item.image)
        // Assuming SetModel has a name field
    }

    override fun getItemCount(): Int {
        return stylists.size
    }
}
