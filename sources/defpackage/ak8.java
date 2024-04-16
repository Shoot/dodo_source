package defpackage;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.util.HashMap;
/* compiled from: PriorityMapping.java */
/* renamed from: ak8  reason: default package */
/* loaded from: classes2.dex */
public final class ak8 {
    private static SparseArray<xj8> a = new SparseArray<>();
    private static HashMap<xj8, Integer> b;

    static {
        HashMap<xj8, Integer> hashMap = new HashMap<>();
        b = hashMap;
        hashMap.put(xj8.DEFAULT, 0);
        b.put(xj8.VERY_LOW, 1);
        b.put(xj8.HIGHEST, 2);
        for (xj8 xj8Var : b.keySet()) {
            a.append(b.get(xj8Var).intValue(), xj8Var);
        }
    }

    public static int a(@NonNull xj8 xj8Var) {
        Integer num = b.get(xj8Var);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + xj8Var);
    }

    @NonNull
    public static xj8 b(int i) {
        xj8 xj8Var = a.get(i);
        if (xj8Var != null) {
            return xj8Var;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
