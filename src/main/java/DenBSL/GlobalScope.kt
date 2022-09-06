package DenBSL

import Main.Types.NumberType
import Main.Types.ObjectType
import Main.Types.StringType
import MetaObjects.NumberMetaObject
import MetaObjects.ObjectMetaObject
import MetaObjects.StringMetaObject

object GlobalScope {
    private val typesProvider: TypesProvider =
            TypesProvider().regType(ObjectType, ObjectMetaObject)
                    .regType(NumberType, NumberMetaObject)
                    .regType(StringType, StringMetaObject)

}