import kotlin.test.*

class SimpleTest {

    @Test fun testFoo() {
        assertNotEquals(10, foo())
    }

    @Test fun testBar() {
        assertEquals(10, foo())
    }

    @Ignore @Test fun testFooWrong() {
        assertEquals(20, foo())
    }

}

@Ignore
class TestTest {
    @Test fun emptyTest() {
    }
}