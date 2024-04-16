package defpackage;
/* compiled from: SignStyle.java */
/* renamed from: ika  reason: default package */
/* loaded from: classes3.dex */
public enum ika {
    NORMAL,
    ALWAYS,
    NEVER,
    NOT_NEGATIVE,
    EXCEEDS_PAD;

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(boolean z, boolean z2, boolean z3) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 4) {
                return true;
            }
            if (z2 || z3) {
                return false;
            }
            return true;
        } else if (z && z2) {
            return false;
        } else {
            return true;
        }
    }
}
