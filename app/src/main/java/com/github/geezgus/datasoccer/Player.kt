package com.github.geezgus.datasoccer

data class Player(
    var name: String,
    var titles: Array<String>,
    var soccerClubs: Array<String>,
    var worldCups: Array<String>,
    var age: Int,
    var position: String,
    var picture: Int
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Player

        if (!titles.contentEquals(other.titles)) return false
        if (!soccerClubs.contentEquals(other.soccerClubs)) return false
        if (!worldCups.contentEquals(other.worldCups)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = titles.contentHashCode()
        result = 31 * result + soccerClubs.contentHashCode()
        result = 31 * result + worldCups.contentHashCode()
        return result
    }
}
