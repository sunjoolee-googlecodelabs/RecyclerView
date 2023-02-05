package googlecodelabs.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.LinkedList

class MainActivity : AppCompatActivity() {
    private val mWordList : LinkedList<String> = LinkedList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for(i in 0 until 20){
            mWordList.addLast("Word $i")
        }
    }
}