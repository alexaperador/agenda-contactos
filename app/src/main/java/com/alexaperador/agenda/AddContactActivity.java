package com.alexaperador.agenda;

import static android.view.View.VISIBLE;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class AddContactActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.add_contact);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnGuardar = findViewById(R.id.btnGuardar);
        btnGuardar.setOnClickListener(v -> {
            if (validarCampos()) {
                guardarContacto();
            }
        });
    }
    private void mostrarMensaje(String mensaje) {
        TextView error = findViewById(R.id.error);
        error.setVisibility(VISIBLE);
        error.setText(mensaje);
    }

    private boolean validarCampos() {
        boolean camposValidos = true;
        EditText usuario = findViewById(R.id.usuario);
        EditText primerApellido = findViewById(R.id.primerApellido);
        EditText segundoApellido = findViewById(R.id.segundoApellido);
        EditText email = findViewById(R.id.email);
        EditText telefono = findViewById(R.id.telefono);
        EditText fechaNacimiento = findViewById(R.id.fechaNacimiento);

        if (usuario.getText().toString().trim().isEmpty()) {
            mostrarMensaje("El campo nombre es obligatorio");
            camposValidos = false;
        }
        if (primerApellido.getText().toString().trim().isEmpty()) {
            mostrarMensaje("El campo primer apellido es obligatorio");
            camposValidos = false;
        }

        if (segundoApellido.getText().toString().trim().isEmpty()) {
            mostrarMensaje("El campo segundo apellido es obligatorio");
            camposValidos = false;
        }

        if (email.getText().toString().trim().isEmpty()) {
            mostrarMensaje("El campo email es obligatorio");
            camposValidos = false;
        }

        if (telefono.getText().toString().trim().isEmpty()) {
            mostrarMensaje("El campo teléfono es obligatorio");
            camposValidos = false;
        }

        String fechaStr = fechaNacimiento.getText().toString().trim();
        if (fechaStr.isEmpty()) {
            mostrarMensaje("El campo fecha de nacimiento es obligatorio");
            camposValidos = false;
        } else {
            // Validar el formato de la fecha
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
            sdf.setLenient(false);
            try {
                sdf.parse(fechaStr);
            } catch (ParseException e) {
                mostrarMensaje("El formato de la fecha no es correcto, debe ser dd/mm/yyyy");
                camposValidos = false;
            }
        }

        return camposValidos;
    }

    private void guardarContacto() {
        EditText usuario = findViewById(R.id.usuario);
        EditText primerApellido = findViewById(R.id.primerApellido);
        EditText segundoApellido = findViewById(R.id.segundoApellido);
        EditText email = findViewById(R.id.email);
        EditText telefono = findViewById(R.id.telefono);
        EditText fechaNacimiento = findViewById(R.id.fechaNacimiento);

        String nombre = usuario.getText().toString();
        String primerApellidoStr = primerApellido.getText().toString();
        String segundoApellidoStr = segundoApellido.getText().toString();
        String emailStr = email.getText().toString();
        String telefonoStr = telefono.getText().toString();
        String fechaNacimientoStr = fechaNacimiento.getText().toString();
        Contacte contacte = new Contacte(nombre, primerApellidoStr, segundoApellidoStr, emailStr, telefonoStr, fechaNacimientoStr);
        MainActivity.getContacteList().add(contacte);
        finish();
    }
}
