package org.example.oop

interface DelegationPlayer {
    fun play()
}

interface DelegationDownloader {
    fun download()
}

class DelegationMediaFile(
    private val downloader: DelegationDownloader,
    private val player: DelegationPlayer
) : DelegationPlayer by player, DelegationDownloader by downloader

class DelegationFileDownloader(private val file: String) : DelegationDownloader {
    override fun download() {
        println("$file downloaded")
    }
}

class DelegationFilePlayer(private val file: String) : DelegationPlayer {
    override fun play() {
        println("$file playing")
    }
}

fun main() {
    val file : String = "File1.kt"

    val mediaFile = DelegationMediaFile(DelegationFileDownloader(file), DelegationFilePlayer(file))

    mediaFile.download()
    mediaFile.play()
}