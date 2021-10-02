package com.chibufirst.palindrome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.chibufirst.palindrome.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val word = args.word
        val rWord = word.reversed()
        val info = if (word.equals(rWord, true)) {
            binding.imageGrade.setImageResource(R.drawable.ic_good)
            "\"$word\" is a palindrome"
        } else {
            binding.imageGrade.setImageResource(R.drawable.ic_bad)
            "\"$word\" is not a palindrome"
        }
        binding.textPalindrome.text = info
    }

}