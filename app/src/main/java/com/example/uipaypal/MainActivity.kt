package com.example.uipaypal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private var listUser = ArrayList<User>()
    private val listUserAdapter = ListUserAdapter(listUser)

    private var listBalance = ArrayList<BalanceChange>()
    private val listBalanceAdapter = ListBalanceAdapter(listBalance)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView.background = null

        listUser.add(User("Carlos Roca", R.drawable.avatar_3))
        listUser.add(User("Ruby Sanz", R.drawable.avatar_2))
        listUser.add(User("Mary Rich", R.drawable.avartar_1))
        listUser.add(User("José Porto", R.drawable.avartar_5))
        listUser.add(User("Carlos Roca", R.drawable.avatar_3))
        listUser.add(User("Carlos Roca", R.drawable.avatar_3))
        listUser.add(User("Carlos Roca", R.drawable.avatar_3))
        listUser.add(User("Carlos Roca", R.drawable.avatar_3))

        rvUser.adapter = listUserAdapter
        rvUser.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvUser.setHasFixedSize(true)

        listBalance.add(BalanceChange("El corte inglés", "Pago aceptado", -50))
        listBalance.add(BalanceChange("Maria Lujan", "Pago aceptado", 650))
        listBalance.add(BalanceChange("Maria Lujan", "Pago aceptado", 450))
        listBalance.add(BalanceChange("Maria Lujan", "Pago aceptado", 250))
        listBalance.add(BalanceChange("El corte inglés", "Pago aceptado", -100))
        listBalance.add(BalanceChange("El corte inglés", "Pago aceptado", -100))
        listBalance.add(BalanceChange("Maria Lujan", "Pago aceptado", 250))
        listBalance.add(BalanceChange("Maria Lujan", "Pago aceptado", 250))

        rvBalance.adapter = listBalanceAdapter
        rvBalance.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvBalance.setHasFixedSize(true)


        floatingActionButton.setOnClickListener {
            val intent = Intent(this, PayActivity::class.java)
            startActivity(intent)
        }
    }
}