package com.ragnlabs.core.usecase

import com.ragnlabs.core.repository.NoteRepository

class GetAllNotes(private val noteRepository: NoteRepository) {
    suspend operator fun invoke() = noteRepository.getAllNote()
}