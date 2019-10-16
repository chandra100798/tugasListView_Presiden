package com.cj.presidenrepublikindonesia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    var listPresiden= ArrayList<Presiden>()
    var adapter:Adapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listPresiden.add(
            Presiden("Ir. Soekarno","Presiden ke-1.",R.drawable.soekarno)
        )
        listPresiden.add(
            Presiden("Soeharto","Presiden ke-2.",R.drawable.soeharto)
        )
        listPresiden.add(
            Presiden("B.J Habibie","Presiden ke-3.",R.drawable.habibie)
        )
        listPresiden.add(
            Presiden("Abdurrahman Wahid","Presiden ke-4.",R.drawable.gusdur)
        )
        listPresiden.add(
            Presiden("Megawati Soekarnoputri","Presiden ke-5.",R.drawable.megawati)
        )
        listPresiden.add(
            Presiden("Susilo Bambang Yudhoyono","Presiden ke-6.",R.drawable.sby)
        )
        listPresiden.add(
            Presiden("Ir. Joko Widodo","Presiden ke-7.",R.drawable.jokowi)
        )
        adapter= Adapter(listPresiden,this)
        listview.adapter=adapter
    }
}
