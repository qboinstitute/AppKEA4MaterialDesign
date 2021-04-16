package edu.pe.idat.appkea4materialdesign.ui.fragmets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import edu.pe.idat.appkea4materialdesign.R
import edu.pe.idat.appkea4materialdesign.databinding.FragmentPrincipalBinding

class PrincipalFragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentPrincipalBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        _binding = FragmentPrincipalBinding.inflate(inflater, container, false)
        binding.btnregistrar.setOnClickListener(this)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onClick(v: View?) {
        val infousuario = "Usuario: ${binding.etusuario.text.toString()}" +
                "- Password: ${binding.etpassword.text.toString()} - " +
                " Genero: ${obtenerGeneroSeleccionado()}"
        enviarMensaje(v!!, infousuario)
    }

    fun enviarMensaje(vista: View, mensaje: String){
        val snackBar = Snackbar.make(vista, mensaje, Snackbar.LENGTH_LONG)
        val snackBarView: View = snackBar.view
        snackBarView.setBackgroundColor(
            ContextCompat.getColor(requireActivity(),
            R.color.success)
        )
        snackBar.show()
    }

    fun obtenerGeneroSeleccionado(): String{
        var genero = ""
        when(binding.rggenero.checkedRadioButtonId){
            R.id.rbmasculino -> {
                genero = binding.rbmasculino.text.toString()
            }
            R.id.rbfemenino -> {
                genero = binding.rbfemenino.text.toString()
            }
        }
        return genero
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}