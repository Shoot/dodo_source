package com.github.hiteshsondhi88.libffmpeg;

import android.text.TextUtils;
/* compiled from: CpuArch.java */
/* loaded from: classes2.dex */
enum b {
    x86("0dd4dbad305ff197a1ea9e6158bd2081d229e70e"),
    ARMv7("871888959ba2f063e18f56272d0d98ae01938ceb"),
    NONE(null);
    
    private String a;

    b(String str) {
        this.a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b a(String str) {
        b[] values;
        if (!TextUtils.isEmpty(str)) {
            for (b bVar : values()) {
                if (str.equalsIgnoreCase(bVar.a)) {
                    return bVar;
                }
            }
        }
        return NONE;
    }
}
