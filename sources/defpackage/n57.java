package defpackage;

import java.util.Arrays;
/* compiled from: Objects.java */
/* renamed from: n57  reason: default package */
/* loaded from: classes2.dex */
public final class n57 extends co3 {
    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
