package com.example.roomdatabase.dependenciesinjection

import android.content.Context
import com.example.roomdatabase.data.database.KrsDatabase
import com.example.roomdatabase.repository.LocalRepositoryMhs
import com.example.roomdatabase.repository.RepositoryMhs

interface InterfaceContainerApp {
    val repositoryMhs:RepositoryMhs
}

class ContainerApp(private val context: Context) : InterfaceContainerApp{
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}