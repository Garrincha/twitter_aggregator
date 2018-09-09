package fr.soat.sojesaispas.model

data class Techno(val id:Long, val name:String, val description: String)
data class TechnoList(val technos:List<Techno>)
