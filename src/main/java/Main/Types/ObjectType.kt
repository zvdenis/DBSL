package Main.Types

import MetaObjects.IMetaObject
import MetaObjects.ObjectMetaObject

object ObjectType: Type() {
    override fun getMetaObject(): IMetaObject {
        return ObjectMetaObject
    }

    override fun baseTypes(): Collection<Type> {
        return listOf(this);
    }
}