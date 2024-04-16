package defpackage;
/* compiled from: ObjectArrays.java */
/* renamed from: n47  reason: default package */
/* loaded from: classes2.dex */
public final class n47 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] b(Object... objArr) {
        c(objArr, objArr.length);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] c(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            a(objArr[i2], i2);
        }
        return objArr;
    }

    public static <T> T[] d(T[] tArr, int i) {
        return (T[]) yb8.b(tArr, i);
    }
}
