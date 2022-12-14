package br.com.alura.orgs.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import br.com.alura.orgs.database.dao.ProdutoDao;
import br.com.alura.orgs.database.dao.ProdutoDao_Impl;
import br.com.alura.orgs.database.dao.UsuarioDao;
import br.com.alura.orgs.database.dao.UsuarioDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile ProdutoDao _produtoDao;

  private volatile UsuarioDao _usuarioDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Produto` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `nome` TEXT NOT NULL, `descricao` TEXT NOT NULL, `valor` REAL NOT NULL, `imagem` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Usuario` (`id` TEXT NOT NULL, `nome` TEXT NOT NULL, `senha` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3a7de561d456f6039d34c3f7f23c4772')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Produto`");
        _db.execSQL("DROP TABLE IF EXISTS `Usuario`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsProduto = new HashMap<String, TableInfo.Column>(5);
        _columnsProduto.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduto.put("nome", new TableInfo.Column("nome", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduto.put("descricao", new TableInfo.Column("descricao", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduto.put("valor", new TableInfo.Column("valor", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduto.put("imagem", new TableInfo.Column("imagem", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProduto = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesProduto = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProduto = new TableInfo("Produto", _columnsProduto, _foreignKeysProduto, _indicesProduto);
        final TableInfo _existingProduto = TableInfo.read(_db, "Produto");
        if (! _infoProduto.equals(_existingProduto)) {
          return new RoomOpenHelper.ValidationResult(false, "Produto(br.com.alura.orgs.model.Produto).\n"
                  + " Expected:\n" + _infoProduto + "\n"
                  + " Found:\n" + _existingProduto);
        }
        final HashMap<String, TableInfo.Column> _columnsUsuario = new HashMap<String, TableInfo.Column>(3);
        _columnsUsuario.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsuario.put("nome", new TableInfo.Column("nome", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsuario.put("senha", new TableInfo.Column("senha", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUsuario = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUsuario = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUsuario = new TableInfo("Usuario", _columnsUsuario, _foreignKeysUsuario, _indicesUsuario);
        final TableInfo _existingUsuario = TableInfo.read(_db, "Usuario");
        if (! _infoUsuario.equals(_existingUsuario)) {
          return new RoomOpenHelper.ValidationResult(false, "Usuario(br.com.alura.orgs.model.Usuario).\n"
                  + " Expected:\n" + _infoUsuario + "\n"
                  + " Found:\n" + _existingUsuario);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "3a7de561d456f6039d34c3f7f23c4772", "ce9ef5bc9b8f7e370352d8a42d121597");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Produto","Usuario");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Produto`");
      _db.execSQL("DELETE FROM `Usuario`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ProdutoDao.class, ProdutoDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(UsuarioDao.class, UsuarioDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public ProdutoDao produtoDao() {
    if (_produtoDao != null) {
      return _produtoDao;
    } else {
      synchronized(this) {
        if(_produtoDao == null) {
          _produtoDao = new ProdutoDao_Impl(this);
        }
        return _produtoDao;
      }
    }
  }

  @Override
  public UsuarioDao usuarioDao() {
    if (_usuarioDao != null) {
      return _usuarioDao;
    } else {
      synchronized(this) {
        if(_usuarioDao == null) {
          _usuarioDao = new UsuarioDao_Impl(this);
        }
        return _usuarioDao;
      }
    }
  }
}
