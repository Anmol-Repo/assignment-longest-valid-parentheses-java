# Longest Valid Parentheses (Java)

## Problem Statement

Given a string containing only the characters `(` and `)`, return the length of the longest valid (well-formed) parentheses substring.

### Example

**Input**
```
(()
```

**Output**
```
2
```

---

## Approach

This solution uses a stack to store the indexes of unmatched parentheses.

- Push `-1` initially as a boundary.
- Push the index of every `'('`.
- When a `')'` is encountered, pop the stack.
- If the stack becomes empty, push the current index as the new boundary.
- Otherwise, calculate the length of the current valid substring using:
  ```
  currentIndex - stack.peek()
  ```
- Keep track of the maximum length found.

---

## Time Complexity

**O(n)**

## Space Complexity

**O(n)**

---

## How to Run

Compile:

```bash
javac Main.java
```

Run:

```bash
java Main
```

---

## Sample Input

```
)()())
```

## Sample Output

```
4
```
