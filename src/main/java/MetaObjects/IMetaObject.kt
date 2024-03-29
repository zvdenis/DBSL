package MetaObjects

interface IMetaObject {

    fun getPropertiesNamesList(): List<String>
    fun getProperty(baseObject: IObjectBase, propName: String): Object
    fun setProperty(baseObject: IObjectBase, propName: String, value: Object)
}