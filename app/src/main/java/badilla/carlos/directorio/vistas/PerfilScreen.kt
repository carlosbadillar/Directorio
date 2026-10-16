package badilla.carlos.directorio.vistas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import badilla.carlos.directorio.Greeting
import badilla.carlos.directorio.modelos.Usuario
import badilla.carlos.directorio.ui.theme.DirectorioTheme

@Composable
fun PerfilScreen(usuario: Usuario) {
    Column(
        modifier = Modifier.padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = usuario.nombre,
            style = MaterialTheme.typography.headlineMedium
        )
        Text(text = usuario.correo)
        Text(text = "Carrera: ${usuario.carrera}")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DirectorioTheme {
        PerfilScreen(Usuario(1,"Carlos","carlosgmail", ""))
    }
}