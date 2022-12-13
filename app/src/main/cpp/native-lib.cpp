#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_xulun_liuyao_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "测试下中文";
    return env->NewStringUTF(hello.c_str());
}