package com.ragnlabs.memorynotesapp.framework.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ragnlabs.core.data.Note

@Entity(tableName = "note")
data class NoteEntity(
    val title: String,
    val content: String,
    @ColumnInfo(name = "creation_date")
    val creationTime: Long,
    @ColumnInfo(name = "udate_time")
    val updateTime: Long,
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L
) {
    fun toNote() = Note(title, content, creationTime, updateTime, id)

    companion object {
        fun fromNoteMapper(note: Note) =
            NoteEntity(
                note.title,
                note.content,
                note.updateTime,
                note.creationTime
            )
    }
}