package fr.soat.sojesaispas.model

data class Tweet (val id:Long, val from:String,val message:String)
data class TweetList(val tweets:List<Tweet>)