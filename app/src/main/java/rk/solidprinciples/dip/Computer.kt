package rk.solidprinciples.dip

// Violation DIP
// Consider RaminOS is a new Operation System
class RaminOS(processor: IntelProcessor) {
    // some methods
}

class IntelProcessor

// RaminOS Only support Intel processors
// What about AMD's processors or Apple's processors?