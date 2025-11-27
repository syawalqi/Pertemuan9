package com.example.pertemuan9.repositori

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>


}

