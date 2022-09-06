package Main.Types

import MetaObjects.IMetaObject
import MetaObjects.NumberMetaObject

object NumberType: Type() {
    override fun getMetaObject(): IMetaObject {
        return NumberMetaObject
    }

    override fun baseTypes(): Collection<Type> {
        return listOf(ObjectType);
    }
}