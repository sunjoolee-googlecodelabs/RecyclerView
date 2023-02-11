package googlecodelabs.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.LinkedList

class MainActivity : AppCompatActivity() {
    private val mWordList : LinkedList<String> = LinkedList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setImageResource(R.drawable.ic_add_for_fab)

        for(i in 0 until 20){
            mWordList.addLast("Word $i")
        }
    }
}