package defpackage;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: vlc  reason: default package */
/* loaded from: classes2.dex */
public final class vlc {
    public static byte a(Boolean bool) {
        if (bool != null) {
            if (!bool.booleanValue()) {
                return (byte) 0;
            }
            return (byte) 1;
        }
        return (byte) -1;
    }

    public static Boolean b(byte b) {
        if (b != 0) {
            if (b != 1) {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
