package DenBSL

import Main.Types.Type
import MetaObjects.IMetaObject
import java.lang.IllegalArgumentException

class TypesProvider {
    val cache : MutableMap<Type, IMetaObject> = HashMap()

    fun regType(type: Type, metaObject: IMetaObject): TypesProvider
    {
        cache[type] = metaObject
        return this
    }

    fun getMetaObject(type: Type): IMetaObject {
        return cache[type] ?: throw IllegalArgumentException()
    }

}