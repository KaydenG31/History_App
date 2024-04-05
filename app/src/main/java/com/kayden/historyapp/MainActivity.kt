package com.kayden.historyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {





    //declare
    private lateinit var searchButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        //initialise
        searchButton= findViewById(R.id.searchButton)
        clearButton = findViewById(R.id.clearButton)
        ageInput = findViewById(R.id.ageInput)
        resultTextView= findViewById(R.id.resultTextView)


        searchButton.setOnClickListener {
            val age = ageInput.text.toString().toIntOrNull()

            if (age != null && age in 20..100) {
                val employeeName = when (age) {
                    56 -> "Adolf Hitler -  Hitler was the leader of the Nazi Party in Germany. He orchestrated the Holocaust, in which millions of Jews and others were systematically murdered."
                    39 -> "Martin Luther King Jr. - A prominent leader in the American civil rights movement, King was known for his nonviolent activism against racial discrimination."
                    55 -> "Julius Caeser - A Roman general and statesman, Caesar played a critical role in the events that led to the demise of the Roman Republic and the rise of the Roman Empire."
                    46 -> "John F. Kennedy - The 35th President of the United States, Kennedy was known for his charisma and leadership during the Cold War."
                    78 -> "Mahatma Ghandi - He advocated for nonviolent civil disobedience and inspired movements for civil rights and freedom across the world."
                    36 -> "Marilyn Monroe - An iconic American actress, Monroe was one of the most popular sex symbols of the 1950s."
                    54 -> "Abraham Lincoln - The 16th President of the United States, Lincoln led the country through the Civil War and is best known for his efforts to end slavery."
                    25 -> "Tupac Shakur -  A highly influential rapper and actor, Tupac was known for his socially conscious lyrics and volatile lifestyle."
                    36 -> "Princess Diana - A beloved member of the British royal family, Diana was known for her humanitarian work and her efforts to destigmatize issues like AIDS and landmines."
                    44 -> "Pablo Escobar - A notorious Colombian drug lord and narcoterrorist, Escobar was the founder and leader of the Medellín Cartel, which became one of the most powerful drug trafficking organizations in the world."



                    else -> null
                }

                val message = if (employeeName != null) "The famous person's name is $employeeName."
                else "No historian found with the entered age."
                resultTextView.text = message

            } else {
                resultTextView.text = "Invalid input. Please enter a valid age between 20 and 100."
            }
        }

        clearButton.setOnClickListener {
            ageInput.text.clear()
            resultTextView.text = ""
        }
    }
}