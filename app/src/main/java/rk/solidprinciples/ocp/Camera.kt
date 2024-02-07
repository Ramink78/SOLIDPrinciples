package rk.solidprinciples.ocp

// Violation OCP
class Camera {
    fun takePicture(mode: String) {
        when (mode) {
            "Pro" -> {
                // Take picture in pro mode.
            }

            "Wide" -> {
                // Take picture with wide lens.
            }

            else -> {
                throw Exception(message = "Unknown camera mode")
            }
        }
    }
}