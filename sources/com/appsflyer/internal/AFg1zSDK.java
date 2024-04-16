package com.appsflyer.internal;
/* loaded from: classes.dex */
public final class AFg1zSDK {
    public static final Object AFInAppEventParameterName = new Object();
    public static int AFInAppEventType;
    public static int valueOf;
    public static int values;

    public static void AFInAppEventParameterName(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int values(int i) {
        int[][] iArr = AFf1mSDK.AFInAppEventParameterName.AFInAppEventType;
        return ((iArr[0][i >>> 24] + iArr[1][(i >>> 16) & 255]) ^ iArr[2][(i >>> 8) & 255]) + iArr[3][i & 255];
    }
}
