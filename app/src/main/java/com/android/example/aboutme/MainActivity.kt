package com.android.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isGone

class MainActivity : AppCompatActivity() {

    private fun addNickname(view: View){ //A parameter called view of type View
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nickNameTextView = findViewById<TextView>(R.id.nickname_text)
        /*We set variables equal to the IDs of both our editText (what the user enters)
        and what the textView that the user will see once they click the "Done" button
        */

        nickNameTextView.text = editText.text
        /*We set the textView - which is currently in gone visibility
        (invisible and doesn't take up space) - equal to the editText that the user has entered.
        */

        editText.visibility = View.GONE
        /*We now set the visibility of the editView that the user was previously typing into GONE
        */

        view.visibility = View.GONE
        /*We now set the view parameter of this function to GONE visibility (we change the button
        View into GONE visibility
        */

        nickNameTextView.visibility = View.VISIBLE
        /*Finally we make the text View which will show the user's nick name visible
        */
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_done).setOnClickListener{ /*" setOnClickListener" is
            a method of button Views which will execute when the button is clicked*/

            addNickname(it) //"it" refers to the button_done view which is passed in as a reference
        }
    }
}