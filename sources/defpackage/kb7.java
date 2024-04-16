package defpackage;
/* compiled from: OptBoolean.java */
/* renamed from: kb7  reason: default package */
/* loaded from: classes2.dex */
public enum kb7 {
    TRUE,
    FALSE,
    DEFAULT;

    public static boolean i(Boolean bool, Boolean bool2) {
        if (bool == null) {
            if (bool2 == null) {
                return true;
            }
            return false;
        }
        return bool.equals(bool2);
    }

    public Boolean a() {
        if (this == DEFAULT) {
            return null;
        }
        if (this == TRUE) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
