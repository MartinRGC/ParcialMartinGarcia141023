
package com.example.parcialmartingarcia141023.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.parcialmartingarcia141023.R


class TKambioFragment : Fragment() {

    lateinit var edttipcam: EditText
    lateinit var edtmonto: EditText
    lateinit var tvresulsol: TextView
    lateinit var tvresulbil: TextView
    lateinit var btncalc: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_t_kambio,container,false)

        val edttipcam: EditText = view.findViewById(R.id.edttipcam)
        val edtmonto: EditText = view.findViewById(R.id.edtmonto)
        val tvresulsol: EditText = view.findViewById(R.id.tvresulsol)
        val tvresulbil: EditText = view.findViewById(R.id.tvresulbil)
        val btncalc: EditText = view.findViewById(R.id.btncalc)
        val resul: Float

        resul = resulsol(edttipcam.toString(),edtmonto.toString())

        return inflater.inflate(R.layout.fragment_t_kambio, container, false)
    }
    fun resulsol(edttipcam: String,edtmonto: String): Float {

        var edtip: Float = edttipcam.toFloat()
        var edtmon: Float = edtmonto.toFloat()
        var res: Float

        res = edtip*edtmon

        println("El resultado en soles es : "+res)

        return res

    }

}