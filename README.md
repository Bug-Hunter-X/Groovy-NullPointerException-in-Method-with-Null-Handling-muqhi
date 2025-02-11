# Groovy NullPointerException in Method with Null Handling

This repository demonstrates a common issue in Groovy related to handling null values within methods. The provided code snippet shows a method that does not correctly manage null input, resulting in unexpected behavior.  The solution focuses on providing robust null handling to prevent unexpected exceptions.

## Bug Description

The `myMethod` function does not correctly handle null input. When the `param` argument is null, the method simply returns null, potentially leading to NullPointerExceptions further down the call stack if the return value isn't appropriately checked.

## Solution

The solution provides improved null handling. Instead of returning null directly, it checks for null input explicitly and handles this case gracefully, preventing any unexpected exceptions.