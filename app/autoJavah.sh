#!/bin/sh
export ModulePath=$(cd "$(dirname "$1")"; pwd)
export TargetClassName="me.leolin.samples.android.ndk.NdkService"

export SourceFile="${ModulePath}/src/main/java"
export TargetPath="${ModulePath}/src/main/jni"

cd "${SourceFile}"
javah -d ${TargetPath} -classpath "${SourceFile}" "${TargetClassName}"
echo -d ${TargetPath} -classpath "${SourceFile}" "${TargetClassName}"
