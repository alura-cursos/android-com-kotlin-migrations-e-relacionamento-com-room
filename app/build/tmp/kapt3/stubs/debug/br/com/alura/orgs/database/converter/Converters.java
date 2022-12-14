package br.com.alura.orgs.database.converter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lbr/com/alura/orgs/database/converter/Converters;", "", "()V", "bigDecimalParaDouble", "", "valor", "Ljava/math/BigDecimal;", "(Ljava/math/BigDecimal;)Ljava/lang/Double;", "deDouble", "(Ljava/lang/Double;)Ljava/math/BigDecimal;", "app_debug"})
public final class Converters {
    
    public Converters() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.math.BigDecimal deDouble(@org.jetbrains.annotations.Nullable()
    java.lang.Double valor) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.Double bigDecimalParaDouble(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal valor) {
        return null;
    }
}