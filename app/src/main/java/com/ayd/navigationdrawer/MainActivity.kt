package com.ayd.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import com.ayd.navigationdrawer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        toggle = ActionBarDrawerToggle(this,binding.drawerLayout,R.string.open,R.string.close) //açılıp kapanabilmesi için
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true) //bar yani toggle görünür böylelikle.

        binding.navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.item1 -> Toast.makeText(applicationContext,"item1",Toast.LENGTH_SHORT).show()
                R.id.item2 -> Toast.makeText(applicationContext,"item2",Toast.LENGTH_SHORT).show()
                R.id.item3 -> Toast.makeText(applicationContext,"item3",Toast.LENGTH_SHORT).show()
                R.id.item4 -> Toast.makeText(applicationContext,"item4",Toast.LENGTH_SHORT).show()
            }
            true
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }

        return super.onOptionsItemSelected(item)
    }


}