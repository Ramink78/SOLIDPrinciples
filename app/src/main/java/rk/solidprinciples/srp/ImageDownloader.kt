package rk.solidprinciples.srp

// Violating SRP
class ImageDownloader {

    fun requestToDownload(url: String) {}
    fun saveToStorage(fileName: String) {}
    fun cropImage(width: Int, height: Int) {}

}