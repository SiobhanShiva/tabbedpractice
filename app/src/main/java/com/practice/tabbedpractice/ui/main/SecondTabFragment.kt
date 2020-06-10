package com.practice.tabbedpractice.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.practice.tabbedpractice.R


class SecondTabFragment : Fragment()  {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.second_fragment, container, false)
        val textView: TextView = root.findViewById(R.id.section_label)
        return root
    }
}