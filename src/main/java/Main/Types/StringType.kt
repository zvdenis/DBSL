package Main.Types

import MetaObjects.IPropertyBase
import MetaObjects.StringMetaObject

object StringType: Type() {
    override fun getMetaObject(): IPropertyBase {
        return StringMetaObject
    }

    override fun baseTypes(): Collection<Type> {
        return listOf(ObjectType);
    }
}