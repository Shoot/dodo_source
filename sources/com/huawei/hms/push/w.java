package com.huawei.hms.push;
/* compiled from: BaseUtil.java */
/* loaded from: classes3.dex */
public abstract class w {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        return new String(bArr, x.a);
    }
}
