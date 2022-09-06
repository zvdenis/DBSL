package Main.Types

import MetaObjects.IMetaObject

abstract class Type {
    abstract fun getMetaObject(): IMetaObject
    abstract fun baseTypes(): Collection<Type>
    fun canBeAssignedTo(targetType: Type): Boolean{
        if (targetType == this)
            return true
        return this.baseTypes().contains(targetType)
    }
}