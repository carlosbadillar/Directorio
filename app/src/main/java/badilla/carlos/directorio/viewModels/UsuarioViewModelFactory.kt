package badilla.carlos.directorio.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import badilla.carlos.directorio.modelos.UsuarioRepositorio

class UsuarioViewModelFactory(
    private val repositorio: UsuarioRepositorio
) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UsuarioViewModel::class.java)) {
            return UsuarioViewModel(repositorio) as T
        }
        throw IllegalArgumentException("ViewModel desconocido")
    }
}
