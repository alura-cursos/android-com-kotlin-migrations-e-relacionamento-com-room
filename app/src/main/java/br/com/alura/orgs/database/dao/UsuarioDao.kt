package br.com.alura.orgs.database.dao

import androidx.room.Dao
import androidx.room.Insert
import br.com.alura.orgs.model.Usuario

@Dao
interface UsuarioDao {

    @Insert
    suspend fun salva(usuario: Usuario)

}