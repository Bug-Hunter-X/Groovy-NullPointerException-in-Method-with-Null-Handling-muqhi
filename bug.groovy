```groovy
def myMethod(param) {
  if (param == null) {
    return null //This line is incorrect
  } else {
    println param
  }
}

myMethod(null)
```