package org.portfolio.fwdproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {
    //private val controller=findNavController(R.id.NavController)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val controller=findNavController(R.id.NavController)
        setupActionBarWithNavController(controller)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)

    }

    override fun onSupportNavigateUp(): Boolean {
        val controller=findNavController(R.id.NavController)
        return controller.navigateUp()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val controller=findNavController(R.id.NavController)
        return item.onNavDestinationSelected(controller)
    }
}