package MetaObjects

import java.lang.IllegalStateException

object StringMetaObject : IMetaObject {

    override fun getPropertiesNamesList(): List<String> {
        return listOf("value")
    }

    override fun getProperty(baseObject: IObjectBase, propName: String): Object {
        if (propName == "value")
            return (baseObject as StringObject).value as Object
        throw IllegalStateException()
    }

    override fun setProperty(baseObject: IObjectBase, propName: String, value: Object) {
        if (propName == "value")
            (baseObject as StringObject).value = value as String
        throw IllegalStateException()
    }
}