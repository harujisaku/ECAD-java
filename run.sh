#!/usr/bin/env bash

compile(){
	echo "compile"
	javac -d bin/ -sourcepath src/ src/ECAD.java
	echo "finish"
}

run(){
	echo "run"
	java -cp bin/ ECAD
	echo "finish"
}

doc(){
echo "javadoc"
rm -r doc
javadoc -d doc -sourcepath src/	Wire src/ECAD.java
echo "finish"
}

usage_exit() {
	echo "aa"
	# echo "Usage: $0 [-a] [-d dir] item ..."
	# exit 1
}

if [ $# = 0 ]; then
	compile
	run
	exit 1
fi

while [ "$1" != "" ]
do
  case $1 in
  	-d )
	doc
  		;;
	-c )
	compile
	;;
	-r )
	run
  esac
  shift
done