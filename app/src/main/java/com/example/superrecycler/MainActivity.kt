package com.example.superrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.superrecycler.adapters.PaisAdapter
import com.example.superrecycler.modelo.Pais

class MainActivity : AppCompatActivity() {
    var miRecycler:RecyclerView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        miRecycler = findViewById(R.id.miRecycler)
        val listaPaises = ArrayList<Pais>()

        listaPaises.add(Pais("Mexico","https://www.tamaulipas.gob.mx/fomentocivico/wp-content/uploads/sites/20/2017/04/bandera-mexico-portavox-e1492461746506.jpg"))
        listaPaises.add(Pais("Peru","https://upload.wikimedia.org/wikipedia/commons/f/f2/Bandera_peruana_DOS.jpg"))
        listaPaises.add(Pais("Venezuela","https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Flag_of_Venezuela.svg/1200px-Flag_of_Venezuela.svg.png"))
        listaPaises.add(Pais("USA","https://www.lifeder.com/wp-content/uploads/2018/11/bandera-1795-1818.png"))
        listaPaises.add(Pais("Cuba","https://www.visitarcuba.org/Images/bandera-de-cuba.jpg"))
        listaPaises.add(Pais("Brasil","https://ifespespanholavr.files.wordpress.com/2015/09/brasilbanderiaatual.jpg"))
        


        miRecycler!!.layoutManager = GridLayoutManager(this,1)
        miRecycler!!.setHasFixedSize(true)
        miRecycler!!.adapter = PaisAdapter(listaPaises,this)
    }
}