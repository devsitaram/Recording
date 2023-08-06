package com.record.record.feature.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class UserEntity(

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