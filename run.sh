#!/bin/bash
set -e

mkdir -p test-src/edu/txst/assignment2
mkdir -p out

{
  echo "package edu.txst.assignment2;"
  cat src/edu/txst/assignment2/ShapeManager.java
} > test-src/edu/txst/assignment2/ShapeManager.java

javac -d out \
  src/edu/txst/assignment2/Shape.java \
  src/edu/txst/assignment2/Circle.java \
  src/edu/txst/assignment2/Square.java \
  src/edu/txst/assignment2/Rectangle.java \
  src/edu/txst/assignment2/Triangle.java \
  test-src/edu/txst/assignment2/ShapeManager.java

java -cp out edu.txst.assignment2.ShapeManager
