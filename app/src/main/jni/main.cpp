#include "me_leolin_samples_android_ndk_NdkService.h"
JNIEXPORT jstring JNICALL Java_me_leolin_samples_android_ndk_NdkService_provideInfo
  (JNIEnv *env, jobject){
    return env->NewStringUTF("This info is provided from jni!");
  }