package com.github.hiteshsondhi88.libffmpeg;
/* loaded from: classes2.dex */
class ArmArchHelper {
    static {
        System.loadLibrary("ARM_ARCH");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) {
        return str.contains("v7");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public native String cpuArchFromJNI();
}
