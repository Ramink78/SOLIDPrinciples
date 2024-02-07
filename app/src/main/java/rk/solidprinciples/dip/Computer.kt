package rk.solidprinciples.dip


// Consider RaminOS is a new Operation System
class RaminOS(processor: Processor) {
    // some methods
}

open class Processor
class IntelProcessor : Processor()
class AppleProcessor : Processor()
class AMDProcessor : Processor()

// Now RaminOS supports any type of processor

