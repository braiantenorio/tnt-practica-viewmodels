package ar.unpsb.ing.pm.primerosviewmodelsapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var inputNombre: EditText
    private lateinit var botonSaludar: Button
    private lateinit var textoSaludo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        inputNombre = findViewById(R.id.inputNombre)
        botonSaludar = findViewById(R.id.buttonSaludar)
        textoSaludo = findViewById(R.id.textViewSaludo)

        botonSaludar.setOnClickListener {
            val name = inputNombre.text.toString()
            if (name.isNotBlank()) {
                textoSaludo.text = "Hola, $name"
            } else {
                Toast.makeText(this, "Escribí tu nombre!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}