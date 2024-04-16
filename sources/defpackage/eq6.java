package defpackage;
/* compiled from: Multimaps.java */
/* renamed from: eq6  reason: default package */
/* loaded from: classes2.dex */
public final class eq6 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(dq6<?, ?> dq6Var, Object obj) {
        if (obj == dq6Var) {
            return true;
        }
        if (obj instanceof dq6) {
            return dq6Var.a().equals(((dq6) obj).a());
        }
        return false;
    }
}
