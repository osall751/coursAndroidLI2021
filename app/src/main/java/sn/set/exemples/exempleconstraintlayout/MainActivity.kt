package sn.set.exemples.exempleconstraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.Group

class MainActivity : AppCompatActivity() {

    lateinit var monBouton:Button
    lateinit var monGroupe:Group

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        monBouton=findViewById(R.id.button10)
        monGroupe=findViewById(R.id.group)

        monBouton.setOnClickListener {
            if(monGroupe.visibility== View.GONE){
                monGroupe.visibility=View.VISIBLE
                monBouton.setText("Cacher les éléments du Groupe")
            }else{
                monGroupe.visibility=View.GONE
                monBouton.setText("Afficher les éléments du Groupe")
            }
        }
    }
}