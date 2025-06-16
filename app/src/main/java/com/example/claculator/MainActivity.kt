package com.example.claculator

import android.os.Bundle
import android.provider.Telephony.Mms.Addr
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var etnum1:EditText
    lateinit var etnum2:EditText
    lateinit var btnAdd: Button
    lateinit var btnSubstract:Button
    lateinit var btnMultiply:Button
    lateinit var btnDivision:Button
    lateinit var tvresult: TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        castViews()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun castViews(){
        etnum1=findViewById(R.id.etnum1)
        etnum2=findViewById(R.id.etnum2)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubstract=findViewById(R.id.btnSubstract)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnDivision=findViewById(R.id.btnDivision)
        tvresult=findViewById(R.id.tvresult)
    }
    override fun onResume(){
        super.onResume()
        btnAdd.setOnClickListener{
            var num1=etnum1.text.toString()
            var num2=etnum2.text.toString()

            var sum=num1.toInt()+num2.toInt()
            tvresult.text=sum.toString()

        }
        btnSubstract.setOnClickListener {
            val num1 = etnum1.text.toString()
            val num2 = etnum2.text.toString()
            val substract = num1.toInt() - num2.toInt()
            tvresult.text = substract.toString()
        }
        btnMultiply.setOnClickListener {
            val num1 = etnum1.text.toString()
            val num2 = etnum2.text.toString()
            val multiply = num1.toInt() * num2.toInt()
            tvresult.text = multiply.toString()
        }
        btnDivision.setOnClickListener {
            val num1 = etnum1.text.toString()
            val num2 = etnum2.text.toString()
            val divide = num1.toInt() / num2.toInt()
            tvresult.text = divide.toString()
        }

}}