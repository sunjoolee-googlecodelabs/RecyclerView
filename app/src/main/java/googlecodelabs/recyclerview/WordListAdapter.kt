package googlecodelabs.recyclerview

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WordListAdapter : RecyclerView.Adapter<WordListAdapter.WordViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


    class WordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        lateinit var wordItemView : TextView
        lateinit var mAdapter : WordListAdapter
        init{
            wordItemView = itemView.findViewById(R.id.word)
        }

        constructor(itemView: View, adapter: WordListAdapter) : this(itemView){
            this.mAdapter = adapter
        }
    }
}
