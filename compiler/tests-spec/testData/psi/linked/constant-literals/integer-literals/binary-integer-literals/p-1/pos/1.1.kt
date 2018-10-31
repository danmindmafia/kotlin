/*
 * KOTLIN PSI SPEC TEST (POSITIVE)
 *
 * SECTIONS: constant-literals, integer-literals, binary-integer-literals
 * PARAGRAPH: 1
 * SENTENCE: [1] A sequence of binary digit symbols (0 or 1) prefixed by 0b or 0B is a binary integer literal.
 * NUMBER: 1
 * DESCRIPTION: Binary integer literals with valid digit symbols.
 */

val value = 0b0000111110000
val value = 0B010101010101
val value = 0b10101010101
val value = 0B000000000000
val value = 0b0
val value = 0B0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
val value = 0b0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100000000000000000000000000000000000000000000000000000000000000
val value = 0B111111111111111111111111111111111111111111111111111111111111111
val value = 0B1
val value = 0b111111111111
val value = 0b10
val value = 0B01
val value = 0B100000000
val value = 0b000000001

val value = 0B10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000