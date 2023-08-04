package com.record.record.feature.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.record.record.feature.User

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}