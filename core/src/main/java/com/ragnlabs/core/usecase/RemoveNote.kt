package com.ragnlabs.core.usecase

import com.ragnlabs.core.data.Note
import com.ragnlabs.core.repository.NoteRepository

class RemoveNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.removeNote(note)
}