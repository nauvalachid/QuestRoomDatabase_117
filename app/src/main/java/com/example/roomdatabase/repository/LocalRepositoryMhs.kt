package com.example.roomdatabase.repository

import com.example.roomdatabase.data.dao.MahasiswaDao
import com.example.roomdatabase.data.entity.Mahasiswa

class LocalRepositoryMhs (
    private val mahasiswaDao: MahasiswaDao
) : RepositoryMhs{
    override suspend fun insertMhs(mahasiswa: Mahasiswa){
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }
}
