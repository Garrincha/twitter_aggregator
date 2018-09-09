package twitter

import kotlin.test.assertEquals
import org.junit.Test
import twitter.messageHello

class TwitterAggregatorTest {
    @Test fun f() {

        assertEquals("Twitter aggregator!!!", messageHello())
    }
}
