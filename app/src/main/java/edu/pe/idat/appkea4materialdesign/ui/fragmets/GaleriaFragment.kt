package edu.pe.idat.appkea4materialdesign.ui.fragmets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import edu.pe.idat.appkea4materialdesign.R
import edu.pe.idat.appkea4materialdesign.adapter.AndroidAdapter
import edu.pe.idat.appkea4materialdesign.databinding.FragmentGaleriaBinding
import edu.pe.idat.appkea4materialdesign.service.DatosService


class GaleriaFragment : Fragment() {

    private var _binding: FragmentGaleriaBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGaleriaBinding.inflate(inflater, container, false)
        binding.rvandroidfrag.adapter = AndroidAdapter(
            DatosService().listaVersionesAndroid(), requireActivity())
        binding.rvandroidfrag.layoutManager = LinearLayoutManager(
            requireActivity())
        return binding.root
    }

}