package com.github.hiteshsondhi88.libffmpeg;

import android.os.Build;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CpuArchHelper.java */
/* loaded from: classes2.dex */
public class c {
    static String a() {
        return "arm64-v8a";
    }

    static String b() {
        return "armeabi-v7a";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b c() {
        StringBuilder sb = new StringBuilder();
        sb.append("Build.CPU_ABI : ");
        String str = Build.CPU_ABI;
        sb.append(str);
        j.a(sb.toString());
        if (!str.equals(d()) && !str.equals(e())) {
            if (str.equals(b())) {
                ArmArchHelper armArchHelper = new ArmArchHelper();
                if (armArchHelper.a(armArchHelper.cpuArchFromJNI())) {
                    return b.ARMv7;
                }
            } else if (str.equals(a())) {
                return b.ARMv7;
            }
            return b.NONE;
        }
        return b.x86;
    }

    static String d() {
        return "x86";
    }

    static String e() {
        return "x86_64";
    }
}
