package br.com.alura.orgs.ui.activity

import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import br.com.alura.orgs.databinding.ActivityPerfilUsuarioBinding
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.launch

class PerfilUsuarioActivity : UsuarioBaseActivity() {

    private val binding by lazy {
        ActivityPerfilUsuarioBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        configuraBotaoSairDoApp()
        preencheCampos()
    }

    private fun preencheCampos() {
        lifecycleScope.launch {
            usuario
                .filterNotNull()
                .collect { usuarioLogado ->
                    binding.activityPerfilUsuarioId.text = usuarioLogado.id
                    binding.activitiyPerfilUsuarioNome.text = usuarioLogado.nome
                }
        }
    }

    private fun configuraBotaoSairDoApp() {
        binding.activityPerfilUsuarioBotaoSairDoApp.setOnClickListener {
            lifecycleScope.launch {
                deslogaUsuario()
            }
        }
    }

}