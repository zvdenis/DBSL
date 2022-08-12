package Main.Types

import MetaObjects.IPropertyBase

abstract class Type {
    abstract fun getMetaObject(): IPropertyBase
    abstract fun baseTypes(): Collection<Type>
    fun canBeAssignedTo(targetType: Type): Boolean{
        if (targetType == this)
            return true
        return this.baseTypes().contains(targetType)
    }
}