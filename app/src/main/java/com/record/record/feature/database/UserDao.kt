package com.record.record.feature.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    @Query("SELECT * FROM user")
    fun getAllFlow(): Flow<List<UserEntity>>

    @Query("SELECT * FROM user WHERE user_id IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<UserEntity>

    @Query("SELECT * FROM user WHERE user_name LIKE :first LIMIT 1")
    fun findByName(first: String, last: String): UserEntity

    @Insert
    fun insert(userEntities: UserEntity)

    @Update
    fun update(userEntities: UserEntity)

    @Delete
    fun delete(userEntity: UserEntity)
}