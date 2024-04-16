package defpackage;

import ch.qos.logback.core.CoreConstants;
/* compiled from: JsonScope.java */
/* renamed from: cc5  reason: default package */
/* loaded from: classes.dex */
final class cc5 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        sb.append(CoreConstants.DOLLAR);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3 || i3 == 4 || i3 == 5) {
                    sb.append(CoreConstants.DOT);
                    String str = strArr[i2];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            } else {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            }
        }
        return sb.toString();
    }
}
