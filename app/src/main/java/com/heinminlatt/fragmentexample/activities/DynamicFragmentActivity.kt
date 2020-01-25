package com.heinminlatt.fragmentexample.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.heinminlatt.fragmentexample.R
import com.heinminlatt.fragmentexample.fragments.BlankFragment
import com.heinminlatt.fragmentexample.fragments.FragmentOne
import com.heinminlatt.fragmentexample.fragments.FragmentTwo
import kotlinx.android.synthetic.main.activity_dynamic_fragment.*
import kotlinx.android.synthetic.main.activity_main.*

class DynamicFragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_fragment)



        btnOne.setOnClickListener {

            //TODO : animition

            supportFragmentManager.beginTransaction()
                .replace(R.id.flContainer,FragmentOne())
                .setCustomAnimations(R.anim.enter,R.anim.exit)
                .commit()
        }

        btnTwo.setOnClickListener {
            //TODO : call fragment two

            supportFragmentManager.beginTransaction()
                .replace(R.id.flContainer,FragmentTwo())
                .commit()
        }

        btnThree.setOnClickListener {
            //TODO : backStack
            supportFragmentManager.beginTransaction()
                .replace(R.id.flContainer,BlankFragment.newInstance("1","2"))
                .addToBackStack(null)
                .commit()
        }
    }



}
