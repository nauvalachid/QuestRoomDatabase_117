package com.example.roomdatabase.repository

import com.example.roomdatabase.data.entity.Mahasiswa

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
}