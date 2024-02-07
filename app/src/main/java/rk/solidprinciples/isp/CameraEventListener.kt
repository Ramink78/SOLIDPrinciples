package rk.solidprinciples.isp

// Violating ISP
interface CameraEventListener {
    fun onTakenPictureListener()
    fun onRecordVideoListener()
    fun onFrameRateChanged()
    fun onVideoResolutionChanged()
    fun onCameraModeChangeListener()
}

class ImageCapture : CameraEventListener {
    override fun onTakenPictureListener() {
        TODO("Not yet implemented")
    }

    override fun onRecordVideoListener() {
        // It doesn't need to expose.
    }

    override fun onFrameRateChanged() {
        // It doesn't need to expose.
    }

    override fun onVideoResolutionChanged() {
        // It doesn't need to expose.
    }

    override fun onCameraModeChangeListener() {
        TODO("Not yet implemented")
    }
}

