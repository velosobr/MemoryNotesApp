package com.ragnlabs.core.usecase

import com.ragnlabs.core.data.Note
import com.ragnlabs.core.repository.NoteRepository

class AddNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.addNote(note)
}