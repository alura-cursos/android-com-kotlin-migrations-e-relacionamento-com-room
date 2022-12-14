package br.com.alura.orgs.database.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import br.com.alura.orgs.database.converter.Converters;
import br.com.alura.orgs.model.Produto;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class ProdutoDao_Impl implements ProdutoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Produto> __insertionAdapterOfProduto;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<Produto> __deletionAdapterOfProduto;

  public ProdutoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProduto = new EntityInsertionAdapter<Produto>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Produto` (`id`,`nome`,`descricao`,`valor`,`imagem`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Produto value) {
        stmt.bindLong(1, value.getId());
        if (value.getNome() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNome());
        }
        if (value.getDescricao() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescricao());
        }
        final Double _tmp;
        _tmp = __converters.bigDecimalParaDouble(value.getValor());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindDouble(4, _tmp);
        }
        if (value.getImagem() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImagem());
        }
      }
    };
    this.__deletionAdapterOfProduto = new EntityDeletionOrUpdateAdapter<Produto>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Produto` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Produto value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public Object salva(final Produto[] produto, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfProduto.insert(produto);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object remove(final Produto produto, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfProduto.handle(produto);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Flow<List<Produto>> buscaTodos() {
    final String _sql = "SELECT * FROM Produto";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Produto"}, new Callable<List<Produto>>() {
      @Override
      public List<Produto> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
          final int _cursorIndexOfDescricao = CursorUtil.getColumnIndexOrThrow(_cursor, "descricao");
          final int _cursorIndexOfValor = CursorUtil.getColumnIndexOrThrow(_cursor, "valor");
          final int _cursorIndexOfImagem = CursorUtil.getColumnIndexOrThrow(_cursor, "imagem");
          final List<Produto> _result = new ArrayList<Produto>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Produto _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpNome;
            if (_cursor.isNull(_cursorIndexOfNome)) {
              _tmpNome = null;
            } else {
              _tmpNome = _cursor.getString(_cursorIndexOfNome);
            }
            final String _tmpDescricao;
            if (_cursor.isNull(_cursorIndexOfDescricao)) {
              _tmpDescricao = null;
            } else {
              _tmpDescricao = _cursor.getString(_cursorIndexOfDescricao);
            }
            final BigDecimal _tmpValor;
            final Double _tmp;
            if (_cursor.isNull(_cursorIndexOfValor)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getDouble(_cursorIndexOfValor);
            }
            _tmpValor = __converters.deDouble(_tmp);
            final String _tmpImagem;
            if (_cursor.isNull(_cursorIndexOfImagem)) {
              _tmpImagem = null;
            } else {
              _tmpImagem = _cursor.getString(_cursorIndexOfImagem);
            }
            _item = new Produto(_tmpId,_tmpNome,_tmpDescricao,_tmpValor,_tmpImagem);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<Produto> buscaPorId(final long id) {
    final String _sql = "SELECT * FROM Produto WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Produto"}, new Callable<Produto>() {
      @Override
      public Produto call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
          final int _cursorIndexOfDescricao = CursorUtil.getColumnIndexOrThrow(_cursor, "descricao");
          final int _cursorIndexOfValor = CursorUtil.getColumnIndexOrThrow(_cursor, "valor");
          final int _cursorIndexOfImagem = CursorUtil.getColumnIndexOrThrow(_cursor, "imagem");
          final Produto _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpNome;
            if (_cursor.isNull(_cursorIndexOfNome)) {
              _tmpNome = null;
            } else {
              _tmpNome = _cursor.getString(_cursorIndexOfNome);
            }
            final String _tmpDescricao;
            if (_cursor.isNull(_cursorIndexOfDescricao)) {
              _tmpDescricao = null;
            } else {
              _tmpDescricao = _cursor.getString(_cursorIndexOfDescricao);
            }
            final BigDecimal _tmpValor;
            final Double _tmp;
            if (_cursor.isNull(_cursorIndexOfValor)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getDouble(_cursorIndexOfValor);
            }
            _tmpValor = __converters.deDouble(_tmp);
            final String _tmpImagem;
            if (_cursor.isNull(_cursorIndexOfImagem)) {
              _tmpImagem = null;
            } else {
              _tmpImagem = _cursor.getString(_cursorIndexOfImagem);
            }
            _result = new Produto(_tmpId,_tmpNome,_tmpDescricao,_tmpValor,_tmpImagem);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
