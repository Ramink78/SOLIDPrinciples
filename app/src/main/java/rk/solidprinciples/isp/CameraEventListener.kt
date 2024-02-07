package rk.solidprinciples.isp

interface ImageCaptureListener {
    fun onTakenPictureListener()
    fun onCameraModeChangeListener()

}

interface VideoCaptureListener {
    fun onRecordVideoListener()
    fun onFrameRateChanged()
    fun onVideoResolutionChanged()
}

class ImageCapture : ImageCaptureListener {
    override fun onTakenPictureListener() {
        TODO("Not yet implemented")
    }

    override fun onCameraModeChangeListener() {
        TODO("Not yet implemented")
    }

}

