package defpackage;

import ch.qos.logback.core.CoreConstants;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: n3d  reason: default package */
/* loaded from: classes2.dex */
final class n3d extends x2d {
    private final char a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n3d(char c) {
        this.a = c;
    }

    @Override // defpackage.k6d
    public final boolean a(char c) {
        if (c == this.a) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CharMatcher.is('");
        int i = this.a;
        char[] cArr = {CoreConstants.ESCAPE_CHAR, 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
