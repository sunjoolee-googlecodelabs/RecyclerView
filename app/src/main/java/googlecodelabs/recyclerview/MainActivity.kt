package googlecodelabs.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.LinkedList

class MainActivity : AppCompatActivity() {
    private val mWordList : MutableList<String> = mutableListOf()

    lateinit var mRecyclerView: RecyclerView
    lateinit var mAdapter: WordListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for(i in 0 until 20){
            mWordList.add("Word $i")
        }
        Log.d("mWordList", mWordList.toString())

        mRecyclerView = findViewById(R.id.recyclerview)
        mAdapter = WordListAdapter(this, mWordList)

        mRecyclerView.adapter = mAdapter
        mRecyclerView.layoutManager = LinearLayoutManager(this)

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.apply{
            setImageResource(R.drawable.ic_add_for_fab)
            setOnClickListener {
                val wordListSize : Int = mWordList.size
                mWordList.add("+ Word $wordListSize")

                (mRecyclerView.adapter as WordListAdapter).notifyItemInserted(wordListSize)
                mRecyclerView.smoothScrollToPosition(wordListSize)
            }
        }

    }
}