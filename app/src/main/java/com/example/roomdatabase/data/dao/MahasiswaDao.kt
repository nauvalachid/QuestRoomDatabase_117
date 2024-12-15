package com.example.roomdatabase.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.roomdatabase.data.entity.Mahasiswa

@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(
        mahasiswa: Mahasiswa
    )
}