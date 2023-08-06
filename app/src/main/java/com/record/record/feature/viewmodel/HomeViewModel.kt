package com.record.record.feature.viewmodel

import androidx.lifecycle.ViewModel
import com.record.record.feature.database.UserEntity
import com.record.record.feature.repository.RecordRepository
import kotlinx.coroutines.flow.Flow

interface HomeViewModelAbstract {
    val userListFlow: Flow<List<UserEntity>>
    fun addUser(userEntity: UserEntity)
    fun updateUser(userEntity: UserEntity)
    fun deleteUser(userEntity: UserEntity)
}

class HomeViewModel
constructor( private val userRepository: RecordRepository ): ViewModel(), HomeViewModelAbstract{

    override val userListFlow: Flow<List<UserEntity>> = userRepository.getAllFlow()

    override fun addUser(userEntity: UserEntity) = userRepository.insert(userEntity = userEntity)

    override fun updateUser(userEntity: UserEntity) = userRepository.update(userEntity = userEntity)

    override fun deleteUser(userEntity: UserEntity) = userRepository.delete(userEntity = userEntity)
}