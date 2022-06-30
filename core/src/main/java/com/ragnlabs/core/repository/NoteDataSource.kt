package com.ragnlabs.core.repository

import com.ragnlabs.core.data.Note

interface NoteDataSource {
    suspend fun addNote(note: Note)

    suspend fun getNote(id: Long): Note?

    suspend fun getAllNotes(): List<Note>

    suspend fun removeNote(note: Note)
}