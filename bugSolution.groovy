```groovy
def myMethod(List<String> list) {
  list?.each { item ->
    println item.toUpperCase()
  }
}

myMethod(null) // This will now execute without exception
myMethod(['a', 'b', 'c'])