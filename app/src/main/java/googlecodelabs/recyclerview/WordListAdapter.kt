package googlecodelabs.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.LinkedList

class WordListAdapter() : RecyclerView.Adapter<WordListAdapter.WordViewHolder>() {

    lateinit var mWordList : MutableList<String>
    lateinit var mInflater: LayoutInflater

    constructor(context : Context, wordList: MutableList<String>) : this() {
        mWordList = wordList
        mInflater = LayoutInflater.from(context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val mItemView = mInflater.inflate(R.layout.wordlist_item, parent, false)
        return WordViewHolder(mItemView, this)
    }

    override fun getItemCount(): Int {
        return mWordList.size
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        val mCurrentWord : String = mWordList[position]
        holder.wordItemView.text = mCurrentWord
    }


    inner class WordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        lateinit var wordItemView : TextView
        lateinit var mAdapter : WordListAdapter

        constructor(itemView: View, adapter: WordListAdapter) : this(itemView){
            wordItemView = itemView.findViewById(R.id.word)
            this.mAdapter = adapter

            //Connect the onClickListener with the View
            itemView.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            val mPosition = layoutPosition
            val element : String = mWordList[mPosition]
            mWordList[mPosition] = "CLicked $element"

            // Notify the adapter that the data has changed so it can
            // update the RecyclerView to display the data.
            mAdapter.notifyDataSetChanged()
        }
    }
}
