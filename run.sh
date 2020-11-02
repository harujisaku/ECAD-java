#!/usr/bin/env bash

compile(){
	echo "compile"
	javac -d bin/ -sourcepath src/ src/ecad/ECAD.java
	echo "finish"
}

run(){
	echo "run"
	java -cp bin/ ecad/ECAD
	echo "finish"
}

doc(){
echo "javadoc"
rm -r doc
javadoc -d doc -author -version -sourcepath src/ -subpackages ecad src/ecad/ECAD.java
echo "finish"
}

djar(){
echo "jar"
jar cvf code/ECAD.jar -C bin/ .
jar uvfm code/ECAD.jar  ECAD.mani
echo "finish"
}

usage_exit() {
	echo "aa"
}

if [ $# = 0 ]; then
	compile
	run
	exit
fi

while [ "$1" != "" ]
do
	case $1 in
	*t*)
	compile
	djar
	run
	exit 0
	;;
  	*d* )
	doc
		;;
	*c* )
	compile
	;;
	*j* )
	djar
	;;
	*r* )
	run
  esac
  shift
done
