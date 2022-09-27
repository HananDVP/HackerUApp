package com.example.hackeruapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//class Person(private val myname:String, private val myAge: Int){
//    val name:String = myname
//    val age: Int = myAge
//}

class MainActivity : AppCompatActivity() {
    lateinit var person30: Person
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setButten3ClickListener()
    }
     fun getName(): String{
        var name:String = "Yakov"
         name = "Ron"
        return name
    }
    private fun setButten3ClickListener(){
        val butten3 = findViewById<Button>(R.id.button3)
        butten3.setOnClickListener {
            createList()
            createRecyclerView()
        }

    }



    private fun giveMeTheName(personList:MutableList<Person>):String {
        for (person: Person in personList) {
            when (person.age) {
                28 -> println("young")
                26 -> println("very young")
                else -> {
                    person30 = person
                    println("old")

                }
            }
        }
        return person30.name
    }

        private fun getPersonList(): MutableList<Person>{
            val personList = mutableListOf<Person>()

            personList.add(Person("Daniella", 30))
            personList.add(Person("Boaz",26))
            personList.add(Person("Shoham",28))
            personList.add(Person("Ron",36))

           return personList

        }

    fun onButtonClick(view: View) {
        val textView: TextView = findViewById<TextView>(R.id.hello_text)
        val personList = getPersonList()
        textView.text = giveMeTheName(personList)

    }

    private fun createList() {
        val listview = findViewById<ListView>(R.id.my_list)
        val personList = getPersonList()
        val myAdapter = ArrayAdapter(this,R.layout.item_layout,personList)
        listview.adapter = myAdapter
    }

    private fun createRecyclerView(){
        val listview = findViewById<RecyclerView>(R.id.my_list)
        val personList = getPersonList()
        val adapter = MyAdapter(personList)
        listview.adapter = adapter


    }

}


