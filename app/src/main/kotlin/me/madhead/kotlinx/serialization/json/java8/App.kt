package me.madhead.kotlinx.serialization.json.java8

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromStream

@OptIn(ExperimentalSerializationApi::class)
fun main() {
    val json = "{}"
    val jsonStream = json.byteInputStream()

    println(Json.decodeFromStream(JsonElement.serializer(), jsonStream))
}
