package Main.Types

import MetaObjects.IPropertyBase
import MetaObjects.ObjectMetaObject

object ObjectType: Type() {
    override fun getMetaObject(): IPropertyBase {
        return ObjectMetaObject
    }

    override fun baseTypes(): Collection<Type> {
        return listOf(this);
    }
}