package twitter.service

import fr.soat.sojesaispas.model.Tweet
import fr.soat.sojesaispas.model.TweetList
import org.slf4j.LoggerFactory
import org.springframework.social.twitter.api.UserList
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Service
@RestController
@RequestMapping("/api")
class TwitterRestApi(private val twitterClient: TwitterClient) {

    private val logger = LoggerFactory.getLogger(TwitterRestApi::class.java)


    @GetMapping("/tweets")
    fun listProfiles(): List<UserList> {
        val operations = twitterClient.getListOperations()
        logger.info(operations.toString())

        return operations
    }
}