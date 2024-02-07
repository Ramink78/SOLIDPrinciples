package rk.solidprinciples.lsp

open class Bird {}
open class FlyingBird : Bird() {
    fun fly() {}
}

// Parrot can fly.
class Parrot : FlyingBird() {}

// Hen can't fly.
class Hen : Bird() {}



