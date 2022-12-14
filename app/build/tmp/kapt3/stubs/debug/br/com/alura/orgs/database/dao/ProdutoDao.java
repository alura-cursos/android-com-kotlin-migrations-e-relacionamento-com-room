package br.com.alura.orgs.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0003H\'J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ%\u0010\r\u001a\u00020\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000e\"\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lbr/com/alura/orgs/database/dao/ProdutoDao;", "", "buscaPorId", "Lkotlinx/coroutines/flow/Flow;", "Lbr/com/alura/orgs/model/Produto;", "id", "", "buscaTodos", "", "remove", "", "produto", "(Lbr/com/alura/orgs/model/Produto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "salva", "", "([Lbr/com/alura/orgs/model/Produto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ProdutoDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Produto")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<br.com.alura.orgs.model.Produto>> buscaTodos();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object salva(@org.jetbrains.annotations.NotNull()
    br.com.alura.orgs.model.Produto[] produto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object remove(@org.jetbrains.annotations.NotNull()
    br.com.alura.orgs.model.Produto produto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Produto WHERE id = :id")
    public abstract kotlinx.coroutines.flow.Flow<br.com.alura.orgs.model.Produto> buscaPorId(long id);
}