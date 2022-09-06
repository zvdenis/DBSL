package Main.Types

import MetaObjects.IMetaObject
import MetaObjects.StringMetaObject

object StringType: Type() {
    override fun getMetaObject(): IMetaObject {
        return StringMetaObject
    }

    override fun baseTypes(): Collection<Type> {
        return listOf(ObjectType);
    }
}