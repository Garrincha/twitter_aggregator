package twitter

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.social.twitter.api.impl.TwitterTemplate


@Configuration
class TwitterConfigurationTemplate {
    @Value("\${twitter.consumer-key}")
    private val consumerKey: String? = null

    @Value("\${twitter.consumer-secret}")
    private val consumerSecret: String? = null

    @Value("\${twitter.access-token}")
    private val accessToken: String? = null

    @Value("\${twitter.access-token-secret}")
    private val accessTokenSecret: String? = null


    @Bean
    fun twitterTemplate(): TwitterTemplate {
        return TwitterTemplate(consumerKey!!,
                consumerSecret!!, accessToken!!, accessTokenSecret!!)
    }


}