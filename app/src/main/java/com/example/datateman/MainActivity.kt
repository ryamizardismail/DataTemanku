 package com.example.datateman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

import java.util.ResourceBundle

 class MainActivity : AppCompatActivity() {
    val menuTeks = arrayOf("Teman", "Profile", "GitHub")
    val menuIcon = arrayOf(R.drawable.house, R.drawable.profile, R.drawable.add)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPagerAdapter(this)
        view_pager.setAdapter(adapter);
        TabLayoutMediator(tab_layout, view_pager,
            { tab,position ->
                tab.text = menuTeks[position]
                tab.icon=ResourcesCompat.getDrawable(resources, menuIcon[position], null)
            }).attach()
    }
}