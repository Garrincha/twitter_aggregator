package twitter.service

import org.springframework.social.twitter.api.CursoredList
import org.springframework.social.twitter.api.SearchResults
import org.springframework.social.twitter.api.TwitterProfile
import org.springframework.social.twitter.api.UserList
import org.springframework.social.twitter.api.impl.TwitterTemplate
import org.springframework.stereotype.Service

@Service
class TwitterClient(private val twitterTemplate: TwitterTemplate) {

    fun getListOperations(): List<UserList> {
        return twitterTemplate.listOperations().getLists()
    }

    fun searchResults(query: String) : SearchResults {
        return twitterTemplate.searchOperations().search(query)
    }

    fun getListProfiles(accountName: String, techno: String): CursoredList<TwitterProfile> {
        return twitterTemplate.listOperations().getListMembers(accountName, techno)
    }
}