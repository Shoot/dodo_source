package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
/* compiled from: Platform.java */
/* renamed from: yb8  reason: default package */
/* loaded from: classes2.dex */
final class yb8 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T[] a(Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T[] b(T[] tArr, int i) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> Map<K, V> c() {
        return hk1.E();
    }
}
