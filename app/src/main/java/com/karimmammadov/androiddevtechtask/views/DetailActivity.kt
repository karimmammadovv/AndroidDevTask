package com.karimmammadov.androiddevtechtask.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.karimmammadov.androiddevtechtask.adapters.DetailsRecyclerAdapter
import com.karimmammadov.androiddevtechtask.databinding.ActivityDetailBinding
import com.karimmammadov.androiddevtechtask.models.DetailsModel


class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    private lateinit var recyclerAdapter : DetailsRecyclerAdapter
    private lateinit var detailsList : ArrayList<DetailsModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val currentCtg = intent.getStringExtra("ctg")
        val currentDate = intent.getStringExtra("date")
        val currentPrice = intent.getStringExtra("price")

        binding.txtCtg.text = currentCtg
        binding.txtDate.text = currentDate
        binding.txtPrice.text = currentPrice + " AZN"

        detailsList = ArrayList<DetailsModel>()
        binding.detailsRecycler.layoutManager = LinearLayoutManager(this)

        if (currentCtg.equals("Entertainment")){
            val ent1 = DetailsModel("Netflix", "01:01 01.01.2022", "199 AZN")
            val ent2 = DetailsModel("Netflix", "02:02 02.02.2022", "299 AZN")
            val ent3 = DetailsModel("Netflix", "03:03 03.03.2022", "399 AZN")
            val ent4 = DetailsModel("Netflix", "04:04 04.04.2022", "499 AZN")
            val ent5 = DetailsModel("Netflix", "05:05 05.05.2022", "599 AZN")
            val ent6 = DetailsModel("Netflix", "06:06 06.06.2022", "699 AZN")
            val ent7 = DetailsModel("Netflix", "07:07 07.07.2022", "799 AZN")
            detailsList.add(ent1)
            detailsList.add(ent2)
            detailsList.add(ent3)
            detailsList.add(ent4)
            detailsList.add(ent5)
            detailsList.add(ent6)
            detailsList.add(ent7)
            recyclerAdapter = DetailsRecyclerAdapter(detailsList)
            binding.detailsRecycler.adapter = recyclerAdapter
            recyclerAdapter.notifyDataSetChanged()
        }else if (currentCtg.equals("Transport")){
            val trn1 = DetailsModel("Uber", "01:01 01.01.2022", "199 AZN")
            val trn2 = DetailsModel("Uber", "02:02 02.02.2022", "299 AZN")
            val trn3 = DetailsModel("Uber", "03:03 03.03.2022", "399 AZN")
            val trn4 = DetailsModel("Uber", "04:04 04.04.2022", "499 AZN")
            val trn5 = DetailsModel("Uber", "05:05 05.05.2022", "599 AZN")
            val trn6 = DetailsModel("Uber", "06:06 06.06.2022", "699 AZN")
            val trn7 = DetailsModel("Uber", "07:07 07.07.2022", "799 AZN")
            detailsList.add(trn1)
            detailsList.add(trn2)
            detailsList.add(trn3)
            detailsList.add(trn4)
            detailsList.add(trn5)
            detailsList.add(trn6)
            detailsList.add(trn7)
            recyclerAdapter = DetailsRecyclerAdapter(detailsList)
            binding.detailsRecycler.adapter = recyclerAdapter
            recyclerAdapter.notifyDataSetChanged()
        }else{
            val gvr1 = DetailsModel("E-Gov", "01:01 01.01.2022", "199 AZN")
            val gvr2 = DetailsModel("E-Gov", "02:02 02.02.2022", "299 AZN")
            val gvr3 = DetailsModel("E-Gov", "03:03 03.03.2022", "399 AZN")
            val gvr4 = DetailsModel("E-Gov", "04:04 04.04.2022", "499 AZN")
            val gvr5 = DetailsModel("E-Gov", "05:05 05.05.2022", "599 AZN")
            val gvr6 = DetailsModel("E-Gov", "06:06 06.06.2022", "699 AZN")
            val gvr7 = DetailsModel("E-Gov", "07:07 07.07.2022", "799 AZN")
            detailsList.add(gvr1)
            detailsList.add(gvr2)
            detailsList.add(gvr3)
            detailsList.add(gvr4)
            detailsList.add(gvr5)
            detailsList.add(gvr6)
            detailsList.add(gvr7)
            recyclerAdapter = DetailsRecyclerAdapter(detailsList)
            binding.detailsRecycler.adapter = recyclerAdapter
            recyclerAdapter.notifyDataSetChanged()
        }
    }
}
