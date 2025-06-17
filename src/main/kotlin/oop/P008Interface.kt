package org.example.oop

/*
In kotlin you cannot inherit from two classes and that is why interface is needed
    So you can inherit nay number of interfaces and then one class
 */


class Audio(private val name: String) :  Downloader, Player {

    override fun download() {
        println("Downloading Audio $name")
    }

    override fun play() {
        println("Playing Audio $name")
    }

}

interface Downloader {

    fun downloaderInfo(){
        println("Downloader V1")
    }

    fun download()
}

interface Player {

    fun playerInfo(){
        println("Player V1")
    }

    fun play()
}

class Video(private val name: String) : Downloader, Player {

    override fun download() {
        println("Downloading Video $name")
    }

    override fun play() {
        println("Playing Video $name")
    }
}

fun main() {
    val audioDownloader = Audio("Audio1.mp3")
    val videoDownloader = Video("Video1.mkv")

    audioDownloader.download()
    audioDownloader.play()
    audioDownloader.playerInfo()
    audioDownloader.downloaderInfo()

    videoDownloader.download()
    videoDownloader.play()
    videoDownloader.playerInfo()
    videoDownloader.downloaderInfo()
}