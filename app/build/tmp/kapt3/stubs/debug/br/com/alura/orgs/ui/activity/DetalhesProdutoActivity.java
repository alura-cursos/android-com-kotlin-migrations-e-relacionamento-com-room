package br.com.alura.orgs.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0014J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\nH\u0002J\b\u0010!\u001a\u00020\u0013H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lbr/com/alura/orgs/ui/activity/DetalhesProdutoActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lbr/com/alura/orgs/databinding/ActivityDetalhesProdutoBinding;", "getBinding", "()Lbr/com/alura/orgs/databinding/ActivityDetalhesProdutoBinding;", "binding$delegate", "Lkotlin/Lazy;", "produto", "Lbr/com/alura/orgs/model/Produto;", "produtoDao", "Lbr/com/alura/orgs/database/dao/ProdutoDao;", "getProdutoDao", "()Lbr/com/alura/orgs/database/dao/ProdutoDao;", "produtoDao$delegate", "produtoId", "", "buscaProduto", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onResume", "preencheCampos", "produtoCarregado", "tentaCarregarProduto", "app_debug"})
public final class DetalhesProdutoActivity extends androidx.appcompat.app.AppCompatActivity {
    private long produtoId = 0L;
    private br.com.alura.orgs.model.Produto produto;
    private final kotlin.Lazy binding$delegate = null;
    private final kotlin.Lazy produtoDao$delegate = null;
    
    public DetalhesProdutoActivity() {
        super();
    }
    
    private final br.com.alura.orgs.databinding.ActivityDetalhesProdutoBinding getBinding() {
        return null;
    }
    
    private final br.com.alura.orgs.database.dao.ProdutoDao getProdutoDao() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void buscaProduto() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void tentaCarregarProduto() {
    }
    
    private final void preencheCampos(br.com.alura.orgs.model.Produto produtoCarregado) {
    }
}