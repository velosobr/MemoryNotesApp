package com.ragnlabs.core.repository

import com.ragnlabs.core.data.Note

class NoteRepository(private val dataSource: NoteDataSource) {
    suspend fun addNote(note: Note) = dataSource.addNote(note)

    suspend fun getNote(id: Long) = dataSource.getNote(id)

    suspend fun getAllNote() = dataSource.getAllNotes()

    suspend fun removeNote(note: Note) = dataSource.removeNote(note)
}