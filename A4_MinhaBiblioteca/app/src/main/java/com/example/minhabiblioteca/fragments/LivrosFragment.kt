package com.example.minhabiblioteca.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.minhabiblioteca.databinding.FragmentLivrosBinding

class LivrosFragment : Fragment() {

    private var _binding: FragmentLivrosBinding? = null
    private val binding get() = _binding!!


    private val args: LivrosFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLivrosBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val livroRecebido = args.livroSelecionado
        binding.textViewDetalhesLivro.text = "Livro selecionado: $livroRecebido"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}