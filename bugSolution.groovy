```groovy
def myMethod(param) {
  if (param == null) {
    println "Parameter is null"  //Handle null case gracefully
    return //Or return a default value
  } else {
    println param
  }
}

myMethod(null)
myMethod("Hello")
```