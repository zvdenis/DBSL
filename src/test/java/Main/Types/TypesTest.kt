package Main.Types

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TypesTest
{
    @Test
    fun testObj()
    {
        assertTrue(StringType.canBeAssignedTo(ObjectType))
        assertTrue(NumberType.canBeAssignedTo(ObjectType))
        assertTrue(StringType.canBeAssignedTo(StringType))
        assertTrue(NumberType.canBeAssignedTo(NumberType))

        assertFalse(ObjectType.canBeAssignedTo(StringType))
        assertFalse(ObjectType.canBeAssignedTo(NumberType))
        assertFalse(NumberType.canBeAssignedTo(StringType))
        assertFalse(StringType.canBeAssignedTo(NumberType))
    }
}