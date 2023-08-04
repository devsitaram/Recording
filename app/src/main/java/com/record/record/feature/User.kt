package com.record.record.feature

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "user_id")
    val uid: Int,

    @ColumnInfo(name = "user_name")
    val userName: String?,

    @ColumnInfo(name = "record_date")
    val date: String?,

    @ColumnInfo(name = "user_word")
    val work: String?,

    @ColumnInfo(name = "due_amount")
    val amounts: String?
)