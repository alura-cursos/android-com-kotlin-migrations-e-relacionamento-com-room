package br.com.alura.orgs.ui.recyclerview.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001eBB\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012#\b\u0002\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\t\u00a2\u0006\u0002\u0010\u000eJ\u0014\u0010\u0014\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\r2\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R5\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001f"}, d2 = {"Lbr/com/alura/orgs/ui/recyclerview/adapter/ListaProdutosAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lbr/com/alura/orgs/ui/recyclerview/adapter/ListaProdutosAdapter$ViewHolder;", "context", "Landroid/content/Context;", "produtos", "", "Lbr/com/alura/orgs/model/Produto;", "quandoClicaNoItem", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "produto", "", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "", "getQuandoClicaNoItem", "()Lkotlin/jvm/functions/Function1;", "setQuandoClicaNoItem", "(Lkotlin/jvm/functions/Function1;)V", "atualiza", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ListaProdutosAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter.ViewHolder> {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super br.com.alura.orgs.model.Produto, kotlin.Unit> quandoClicaNoItem;
    private final java.util.List<br.com.alura.orgs.model.Produto> produtos = null;
    
    public ListaProdutosAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<br.com.alura.orgs.model.Produto> produtos, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super br.com.alura.orgs.model.Produto, kotlin.Unit> quandoClicaNoItem) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<br.com.alura.orgs.model.Produto, kotlin.Unit> getQuandoClicaNoItem() {
        return null;
    }
    
    public final void setQuandoClicaNoItem(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super br.com.alura.orgs.model.Produto, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void atualiza(@org.jetbrains.annotations.NotNull()
    java.util.List<br.com.alura.orgs.model.Produto> produtos) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lbr/com/alura/orgs/ui/recyclerview/adapter/ListaProdutosAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lbr/com/alura/orgs/databinding/ProdutoItemBinding;", "(Lbr/com/alura/orgs/ui/recyclerview/adapter/ListaProdutosAdapter;Lbr/com/alura/orgs/databinding/ProdutoItemBinding;)V", "produto", "Lbr/com/alura/orgs/model/Produto;", "vincula", "", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final br.com.alura.orgs.databinding.ProdutoItemBinding binding = null;
        private br.com.alura.orgs.model.Produto produto;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        br.com.alura.orgs.databinding.ProdutoItemBinding binding) {
            super(null);
        }
        
        public final void vincula(@org.jetbrains.annotations.NotNull()
        br.com.alura.orgs.model.Produto produto) {
        }
    }
}