package br.com.alura.orgs.ui.activity

import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.ConcatAdapter
import br.com.alura.orgs.database.AppDatabase
import br.com.alura.orgs.databinding.ActivityTodosProdutosBinding
import br.com.alura.orgs.extensions.vaiPara
import br.com.alura.orgs.model.Produto
import br.com.alura.orgs.ui.recyclerview.adapter.CabecalhoAdapter
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class TodosProdutosActivity : UsuarioBaseActivity() {

    private val binding by lazy {
        ActivityTodosProdutosBinding.inflate(layoutInflater)
    }
    private val dao by lazy {
        AppDatabase.instancia(this).produtoDao()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val recyclerview = binding.activityTodosProdutosRecyclerview
        lifecycleScope.launch {
            dao.buscaTodos()
                .map { produtos ->
                    produtos
                        .sortedBy {
                            it.usuarioId
                        }
                        .groupBy {
                            it.usuarioId
                        }.map { produtosUsuario ->
                            criaAdapterDeProdutosComCabecalho(produtosUsuario)
                        }.flatten()
                }
                .collect { adapter ->
                    recyclerview.adapter = ConcatAdapter(adapter)
                }
        }
    }
    
    private fun criaAdapterDeProdutosComCabecalho(produtosUsuario: Map.Entry<String?, List<Produto>>) =
        listOf(
            CabecalhoAdapter(this, listOf(produtosUsuario.key)),
            ListaProdutosAdapter(
                        this,
                        produtosUsuario.value
                    ) { produtoClicado ->
                        vaiPara(DetalhesProdutoActivity::class.java) {
                            putExtra(CHAVE_PRODUTO_ID, produtoClicado.id)
                        }
                    }
        )

}