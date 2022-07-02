package com.karimmammadov.androiddevtechtask.views

import android.content.Intent

import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import com.karimmammadov.androiddevtechtask.R
import com.karimmammadov.androiddevtechtask.databinding.ActivityStatsBinding

class StatsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStatsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStatsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
/*
        val year = resources.getStringArray(R.array.Year)
        val arrayAdapter = ArrayAdapter(this,R.layout.dropdown_item, year)
        binding.auto.setAdapter(arrayAdapter)

        val month = resources.getStringArray(R.array.Month)
        val arrayAdapterMonth = ArrayAdapter(this,R.layout.dropdown_item, month)
        binding.autoComplete.setAdapter(arrayAdapterMonth)

        val categories = resources.getStringArray(R.array.Categories)
        val arrayAdapterCateg = ArrayAdapter(this,R.layout.dropdown_item,categories)
        binding.autoCompleteToEnd.setAdapter(arrayAdapterCateg)
 */

        val viewst = binding.viewStatem
        viewst.paintFlags = viewst.paintFlags or Paint.UNDERLINE_TEXT_FLAG

        dropdownMenu1()
        dropdownMenu2()
        dropdownMenu3()
    }

    fun goToDetailActivity(view: View) {
        val ctg = binding.selectBtn3.text.toString()
        val year = binding.selectBtn1.text.toString()
        val month = binding.selectBtn2.text.toString()
        val price = binding.costId.text.toString()
        val date = "$year $month"
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("ctg", ctg)
        intent.putExtra("date", date)
        intent.putExtra("price", price)
        startActivity(intent)
    }

    private fun dropdownMenu1() {
        //drop_down1
        val popupMenu = PopupMenu(applicationContext, binding.selectBtn1)
        popupMenu.inflate(R.menu.popup_menu1)
        popupMenu.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.year1 -> {
                    binding.selectBtn1.setText("2020")
                    if (binding.selectBtn2.text.equals("January")) {
                        binding.expences.setText("10000")
                        binding.incomingsValue.setText("20000")
                        binding.cashbackValue.setText("30000")
                    } else if (binding.selectBtn2.text.equals("February")) {
                        binding.expences.setText("11000")
                        binding.incomingsValue.setText("12000")
                        binding.cashbackValue.setText("13000")
                    } else if (binding.selectBtn2.text.equals("March")) {
                        binding.expences.setText("14000")
                        binding.incomingsValue.setText("15000")
                        binding.cashbackValue.setText("16000")
                    } else if (binding.selectBtn2.text.equals("April")) {
                        binding.expences.setText("17000")
                        binding.incomingsValue.setText("18000")
                        binding.cashbackValue.setText("19000")
                    } else if (binding.selectBtn2.text.equals("May")) {
                        binding.expences.setText("20000")
                        binding.incomingsValue.setText("21000")
                        binding.cashbackValue.setText("22000")
                    } else if (binding.selectBtn2.text.equals("June")) {
                        binding.expences.setText("23000")
                        binding.incomingsValue.setText("24000")
                        binding.cashbackValue.setText("25000")
                    } else if (binding.selectBtn2.text.equals("July")) {
                        binding.expences.setText("26000")
                        binding.incomingsValue.setText("27000")
                        binding.cashbackValue.setText("28000")
                    } else if (binding.selectBtn2.text.equals("August")) {
                        binding.expences.setText("29000")
                        binding.incomingsValue.setText("30000")
                        binding.cashbackValue.setText("31000")
                    } else if (binding.selectBtn2.text.equals("September")) {
                        binding.expences.setText("32000")
                        binding.incomingsValue.setText("33000")
                        binding.cashbackValue.setText("34000")
                    } else if (binding.selectBtn2.text.equals("October")) {
                        binding.expences.setText("35000")
                        binding.incomingsValue.setText("36000")
                        binding.cashbackValue.setText("37000")
                    } else if (binding.selectBtn2.text.equals("November")) {
                        binding.expences.setText("38000")
                        binding.incomingsValue.setText("39000")
                        binding.cashbackValue.setText("40000")
                    } else if (binding.selectBtn2.text.equals("December")) {
                        binding.expences.setText("41000")
                        binding.incomingsValue.setText("42000")
                        binding.cashbackValue.setText("43000")
                    }
                    true
                }
                R.id.year2 -> {
                    binding.selectBtn1.setText("2021")
                    if (binding.selectBtn2.text.equals("January")) {
                        binding.expences.setText("23000")
                        binding.incomingsValue.setText("24000")
                        binding.cashbackValue.setText("25000")
                    } else if (binding.selectBtn2.text.equals("February")) {
                        binding.expences.setText("20000")
                        binding.incomingsValue.setText("21000")
                        binding.cashbackValue.setText("22000")
                    } else if (binding.selectBtn2.text.equals("March")) {
                        binding.expences.setText("17000")
                        binding.incomingsValue.setText("18000")
                        binding.cashbackValue.setText("19000")
                    } else if (binding.selectBtn2.text.equals("April")) {
                        binding.expences.setText("14000")
                        binding.incomingsValue.setText("15000")
                        binding.cashbackValue.setText("16000")
                    } else if (binding.selectBtn2.text.equals("May")) {
                        binding.expences.setText("11000")
                        binding.incomingsValue.setText("12000")
                        binding.cashbackValue.setText("13000")
                    } else if (binding.selectBtn2.text.equals("June")) {
                        binding.expences.setText("10000")
                        binding.incomingsValue.setText("20000")
                        binding.cashbackValue.setText("30000")
                    } else if (binding.selectBtn2.text.equals("July")) {
                        binding.expences.setText("41000")
                        binding.incomingsValue.setText("42000")
                        binding.cashbackValue.setText("43000")
                    } else if (binding.selectBtn2.text.equals("August")) {
                        binding.expences.setText("38000")
                        binding.incomingsValue.setText("39000")
                        binding.cashbackValue.setText("40000")
                    } else if (binding.selectBtn2.text.equals("September")) {
                        binding.expences.setText("35000")
                        binding.incomingsValue.setText("36000")
                        binding.cashbackValue.setText("37000")
                    } else if (binding.selectBtn2.text.equals("October")) {
                        binding.expences.setText("32000")
                        binding.incomingsValue.setText("33000")
                        binding.cashbackValue.setText("34000")
                    } else if (binding.selectBtn2.text.equals("November")) {
                        binding.expences.setText("29000")
                        binding.incomingsValue.setText("30000")
                        binding.cashbackValue.setText("31000")
                    } else if (binding.selectBtn2.text.equals("December")) {
                        binding.expences.setText("26000")
                        binding.incomingsValue.setText("27000")
                        binding.cashbackValue.setText("28000")
                    }
                    true
                }
                else -> true
            }
        }
        binding.selectBtn1.setOnClickListener {
            try {
                val popup = PopupMenu::class.java.getDeclaredField("mPopup")
                popup.isAccessible = true
                val menu = popup.get(popupMenu)
                menu.javaClass
                    .getDeclaredMethod("setYear", Boolean::class.java)
                    .invoke(menu, true)
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                popupMenu.show()
            }
            true
        }
    }

    private fun dropdownMenu2() {
        //drop_down2
        val popupMenu2 = PopupMenu(applicationContext, binding.selectBtn2)
        popupMenu2.inflate(R.menu.popup_menu2)
        popupMenu2.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.month1 -> {
                    binding.selectBtn2.setText("January")
                    if (binding.selectBtn1.text.equals("2020")) {
                        binding.expences.setText("10000")
                        binding.incomingsValue.setText("20000")
                        binding.cashbackValue.setText("30000")
                    } else if (binding.selectBtn1.text.equals("2021")) {
                        binding.expences.setText("23000")
                        binding.incomingsValue.setText("24000")
                        binding.cashbackValue.setText("25000")
                    }
                    true
                }
                R.id.month2 -> {
                    binding.selectBtn2.setText("February")
                    if (binding.selectBtn1.text.equals("2020")) {
                        binding.expences.setText("11000")
                        binding.incomingsValue.setText("12000")
                        binding.cashbackValue.setText("13000")
                    } else if (binding.selectBtn1.text.equals("2021")) {
                        binding.expences.setText("20000")
                        binding.incomingsValue.setText("21000")
                        binding.cashbackValue.setText("22000")
                    }
                    true
                }
                R.id.month3 -> {
                    binding.selectBtn2.setText("March")
                    if (binding.selectBtn1.text.equals("2020")) {
                        binding.expences.setText("14000")
                        binding.incomingsValue.setText("15000")
                        binding.cashbackValue.setText("16000")
                    } else if (binding.selectBtn1.text.equals("2021")) {
                        binding.expences.setText("17000")
                        binding.incomingsValue.setText("18000")
                        binding.cashbackValue.setText("19000")
                    }
                    true
                }
                R.id.month4 -> {
                    binding.selectBtn2.setText("April")
                    if (binding.selectBtn1.text.equals("2020")) {
                        binding.expences.setText("17000")
                        binding.incomingsValue.setText("18000")
                        binding.cashbackValue.setText("19000")
                    } else if (binding.selectBtn1.text.equals("2021")) {
                        binding.expences.setText("14000")
                        binding.incomingsValue.setText("15000")
                        binding.cashbackValue.setText("16000")
                    }
                    true
                }
                R.id.month5 -> {
                    binding.selectBtn2.setText("May")
                    if (binding.selectBtn1.text.equals("2020")) {
                        binding.expences.setText("20000")
                        binding.incomingsValue.setText("21000")
                        binding.cashbackValue.setText("22000")
                    } else if (binding.selectBtn1.text.equals("2021")) {
                        binding.expences.setText("11000")
                        binding.incomingsValue.setText("12000")
                        binding.cashbackValue.setText("13000")
                    }
                    true
                }
                R.id.month6 -> {
                    binding.selectBtn2.setText("June")
                    if (binding.selectBtn1.text.equals("2020")) {
                        binding.expences.setText("23000")
                        binding.incomingsValue.setText("24000")
                        binding.cashbackValue.setText("25000")
                    } else if (binding.selectBtn1.text.equals("2021")) {
                        binding.expences.setText("10000")
                        binding.incomingsValue.setText("20000")
                        binding.cashbackValue.setText("30000")
                    }
                    true
                }
                R.id.month7 -> {
                    binding.selectBtn2.setText("July")
                    if (binding.selectBtn1.text.equals("2020")) {
                        binding.expences.setText("26000")
                        binding.incomingsValue.setText("27000")
                        binding.cashbackValue.setText("28000")
                    } else if (binding.selectBtn1.text.equals("2021")) {
                        binding.expences.setText("41000")
                        binding.incomingsValue.setText("42000")
                        binding.cashbackValue.setText("43000")
                    }
                    true
                }
                R.id.month8 -> {
                    binding.selectBtn2.setText("August")
                    if (binding.selectBtn1.text.equals("2020")) {
                        binding.expences.setText("29000")
                        binding.incomingsValue.setText("30000")
                        binding.cashbackValue.setText("31000")
                    } else if (binding.selectBtn1.text.equals("2021")) {
                        binding.expences.setText("38000")
                        binding.incomingsValue.setText("39000")
                        binding.cashbackValue.setText("40000")
                    }
                    true
                }
                R.id.month9 -> {
                    binding.selectBtn2.setText("September")
                    if (binding.selectBtn1.text.equals("2020")) {
                        binding.expences.setText("32000")
                        binding.incomingsValue.setText("33000")
                        binding.cashbackValue.setText("34000")
                    } else if (binding.selectBtn1.text.equals("2021")) {
                        binding.expences.setText("35000")
                        binding.incomingsValue.setText("36000")
                        binding.cashbackValue.setText("37000")
                    }
                    true
                }
                R.id.month10 -> {
                    binding.selectBtn2.setText("October")
                    if (binding.selectBtn1.text.equals("2020")) {
                        binding.expences.setText("35000")
                        binding.incomingsValue.setText("36000")
                        binding.cashbackValue.setText("37000")
                    } else if (binding.selectBtn1.text.equals("2021")) {
                        binding.expences.setText("32000")
                        binding.incomingsValue.setText("33000")
                        binding.cashbackValue.setText("34000")
                    }
                    true
                }
                R.id.month11 -> {
                    binding.selectBtn2.setText("November")
                    if (binding.selectBtn1.text.equals("2020")) {
                        binding.expences.setText("38000")
                        binding.incomingsValue.setText("39000")
                        binding.cashbackValue.setText("40000")
                    } else if (binding.selectBtn1.text.equals("2021")) {
                        binding.expences.setText("29000")
                        binding.incomingsValue.setText("30000")
                        binding.cashbackValue.setText("31000")
                    }
                    true
                }
                R.id.month12 -> {
                    binding.selectBtn2.setText("December")
                    if (binding.selectBtn1.text.equals("2020")) {
                        binding.expences.setText("41000")
                        binding.incomingsValue.setText("42000")
                        binding.cashbackValue.setText("43000")
                    } else if (binding.selectBtn1.text.equals("2021")) {
                        binding.expences.setText("26000")
                        binding.incomingsValue.setText("27000")
                        binding.cashbackValue.setText("28000")
                    }
                    true
                }
                else -> true
            }
        }
        binding.selectBtn2.setOnClickListener {
            try {
                val popup = PopupMenu::class.java.getDeclaredField("mPopup2")
                popup.isAccessible = true
                val menu = popup.get(popupMenu2)
                menu.javaClass
                    .getDeclaredMethod("setMonth", Boolean::class.java)
                    .invoke(menu, true)
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                popupMenu2.show()
            }
            true
        }
    }

    private fun dropdownMenu3() {
        //drop_down3
        val popupMenu3 = PopupMenu(applicationContext, binding.selectBtn3)
        popupMenu3.inflate(R.menu.popup_menu3)
        popupMenu3.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.type1 -> {
                    binding.selectBtn3.setText("Entertainment")
                    binding.typeId.setText("Entertainment")
                    //2020
                    if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals("January")) {
                        binding.costId.setText("1500")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "February"
                        )
                    ) {
                        binding.costId.setText("1600")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "March"
                        )
                    ) {
                        binding.costId.setText("1700")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "April"
                        )
                    ) {
                        binding.costId.setText("1800")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "May"
                        )
                    ) {
                        binding.costId.setText("1900")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "June"
                        )
                    ) {
                        binding.costId.setText("2000")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "July"
                        )
                    ) {
                        binding.costId.setText("2100")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "August"
                        )
                    ) {
                        binding.costId.setText("2200")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "September"
                        )
                    ) {
                        binding.costId.setText("2300")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "October"
                        )
                    ) {
                        binding.costId.setText("2400")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "November"
                        )
                    ) {
                        binding.costId.setText("2500")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "December"
                        )
                    ) {
                        binding.costId.setText("2600")
                    }
                    //2021
                    else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "January"
                        )
                    ) {
                        binding.costId.setText("2600")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "February"
                        )
                    ) {
                        binding.costId.setText("2500")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "March"
                        )
                    ) {
                        binding.costId.setText("2400")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "April"
                        )
                    ) {
                        binding.costId.setText("2300")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "May"
                        )
                    ) {
                        binding.costId.setText("2200")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "June"
                        )
                    ) {
                        binding.costId.setText("2100")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "July"
                        )
                    ) {
                        binding.costId.setText("2000")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "August"
                        )
                    ) {
                        binding.costId.setText("1900")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "September"
                        )
                    ) {
                        binding.costId.setText("1800")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "October"
                        )
                    ) {
                        binding.costId.setText("1700")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "November"
                        )
                    ) {
                        binding.costId.setText("1600")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "December"
                        )
                    ) {
                        binding.costId.setText("1500")
                    }

                    true
                }
                R.id.type2 -> {
                    binding.selectBtn3.setText("Transport")
                    binding.typeId.setText("Transport")
                    //2020
                    if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals("January")) {
                        binding.costId.setText("1500")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "February"
                        )
                    ) {
                        binding.costId.setText("1600")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "March"
                        )
                    ) {
                        binding.costId.setText("1700")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "April"
                        )
                    ) {
                        binding.costId.setText("1800")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "May"
                        )
                    ) {
                        binding.costId.setText("1900")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "June"
                        )
                    ) {
                        binding.costId.setText("2000")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "July"
                        )
                    ) {
                        binding.costId.setText("2100")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "August"
                        )
                    ) {
                        binding.costId.setText("2200")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "September"
                        )
                    ) {
                        binding.costId.setText("2300")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "October"
                        )
                    ) {
                        binding.costId.setText("2400")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "November"
                        )
                    ) {
                        binding.costId.setText("2500")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "December"
                        )
                    ) {
                        binding.costId.setText("2600")
                    }
                    //2021
                    else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "January"
                        )
                    ) {
                        binding.costId.setText("2600")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "February"
                        )
                    ) {
                        binding.costId.setText("2500")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "March"
                        )
                    ) {
                        binding.costId.setText("2400")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "April"
                        )
                    ) {
                        binding.costId.setText("2300")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "May"
                        )
                    ) {
                        binding.costId.setText("2200")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "June"
                        )
                    ) {
                        binding.costId.setText("2100")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "July"
                        )
                    ) {
                        binding.costId.setText("2000")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "August"
                        )
                    ) {
                        binding.costId.setText("1900")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "September"
                        )
                    ) {
                        binding.costId.setText("1800")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "October"
                        )
                    ) {
                        binding.costId.setText("1700")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "November"
                        )
                    ) {
                        binding.costId.setText("1600")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "December"
                        )
                    ) {
                        binding.costId.setText("1500")
                    }
                    true
                }
                R.id.type3 -> {
                    binding.selectBtn3.setText("Government Services")
                    binding.typeId.setText("Government Services")
                    //2020
                    if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals("January")) {
                        binding.costId.setText("1500")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "February"
                        )
                    ) {
                        binding.costId.setText("1600")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "March"
                        )
                    ) {
                        binding.costId.setText("1700")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "April"
                        )
                    ) {
                        binding.costId.setText("1800")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "May"
                        )
                    ) {
                        binding.costId.setText("1900")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "June"
                        )
                    ) {
                        binding.costId.setText("2000")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "July"
                        )
                    ) {
                        binding.costId.setText("2100")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "August"
                        )
                    ) {
                        binding.costId.setText("2200")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "September"
                        )
                    ) {
                        binding.costId.setText("2300")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "October"
                        )
                    ) {
                        binding.costId.setText("2400")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "November"
                        )
                    ) {
                        binding.costId.setText("2500")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "December"
                        )
                    ) {
                        binding.costId.setText("2600")
                    }
                    //2021
                    else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "January"
                        )
                    ) {
                        binding.costId.setText("2600")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "February"
                        )
                    ) {
                        binding.costId.setText("2500")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "March"
                        )
                    ) {
                        binding.costId.setText("2400")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "April"
                        )
                    ) {
                        binding.costId.setText("2300")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "May"
                        )
                    ) {
                        binding.costId.setText("2200")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "June"
                        )
                    ) {
                        binding.costId.setText("2100")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "July"
                        )
                    ) {
                        binding.costId.setText("2000")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "August"
                        )
                    ) {
                        binding.costId.setText("1900")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "September"
                        )
                    ) {
                        binding.costId.setText("1800")
                    } else if (binding.selectBtn1.text.equals("2020") && binding.selectBtn2.text.equals(
                            "October"
                        )
                    ) {
                        binding.costId.setText("1700")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "November"
                        )
                    ) {
                        binding.costId.setText("1600")
                    } else if (binding.selectBtn1.text.equals("2021") && binding.selectBtn2.text.equals(
                            "December"
                        )
                    ) {
                        binding.costId.setText("1500")
                    }
                    true
                }
                else -> true
            }
        }
        binding.selectBtn3.setOnClickListener {
            try {
                val popup = PopupMenu::class.java.getDeclaredField("mPopup3")
                popup.isAccessible = true
                val menu = popup.get(popupMenu3)
                menu.javaClass
                    .getDeclaredMethod("setCategoryType", Boolean::class.java)
                    .invoke(menu, true)
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                popupMenu3.show()
            }
            true
        }
    }
}
