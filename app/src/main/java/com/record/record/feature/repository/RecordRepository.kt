package com.record.record.feature.repository

import com.record.record.feature.database.UserDao
import com.record.record.feature.database.UserEntity
import kotlinx.coroutines.flow.Flow

class RecordRepository(private val userDao: UserDao) {
    fun getAllFlow(): Flow<List<UserEntity>> = userDao.getAllFlow()
    fun insert(userEntity: UserEntity) = userDao.insert(userEntities = userEntity)
    fun update(userEntity: UserEntity) = userDao.update(userEntities = userEntity)
    fun delete(userEntity: UserEntity) = userDao.delete(userEntity = userEntity)
}