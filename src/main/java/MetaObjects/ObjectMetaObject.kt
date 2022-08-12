package MetaObjects

import java.lang.IllegalStateException

object ObjectMetaObject : IPropertyBase {

    override fun getPropertiesNamesList(): List<String> {
        return emptyList()
    }

    override fun getProperty(baseObject: IObjectBase, propName: String): Object {
        throw IllegalStateException()
    }

    override fun setProperty(baseObject: IObjectBase, propName: String, value: Object) {
        throw IllegalStateException()
    }
}