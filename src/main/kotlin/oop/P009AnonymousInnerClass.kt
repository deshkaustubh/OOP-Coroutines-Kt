package org.example.oop

interface DownloadListener {
    fun onDownloadStarted()
    fun onDownloadCompleted(file: String)
    fun onProgressUpdate(progress: Int)
}

class DownloaderForAnonymous {

    var downloadListener: DownloadListener? = null

    fun downloadFile(file: String){
        downloadListener?.onDownloadStarted()
        for(i in 1..10){
            Thread.sleep(600)
            downloadListener?.onProgressUpdate(i * 10)
        }
        downloadListener?.onDownloadCompleted(file)
    }

}

fun main() {
    val downloader = DownloaderForAnonymous()
    downloader.downloadListener = object : DownloadListener {
        override fun onDownloadStarted() {
            println("Download Started...")
        }

        override fun onDownloadCompleted(file: String) {
            println("$file Downloaded.")
        }

        override fun onProgressUpdate(progress: Int) {
            println("$progress% Downloaded")
        }
    }
    downloader.downloadFile("FileA.mkv")
}