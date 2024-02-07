package rk.solidprinciples.lsp

// Violating LSP
open class Bird {
    open fun fly() {}
}

// Parrot can fly.
class Parrot : Bird() {}

// Hen can't fly.
class Hen : Bird() {}



