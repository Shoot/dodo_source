package defpackage;

import android.util.SparseArray;
/* compiled from: QosTier.java */
/* renamed from: ru8  reason: default package */
/* loaded from: classes2.dex */
public enum ru8 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    
    private static final SparseArray<ru8> h;
    private final int a;

    static {
        ru8 ru8Var = DEFAULT;
        ru8 ru8Var2 = UNMETERED_ONLY;
        ru8 ru8Var3 = UNMETERED_OR_DAILY;
        ru8 ru8Var4 = FAST_IF_RADIO_AWAKE;
        ru8 ru8Var5 = NEVER;
        ru8 ru8Var6 = UNRECOGNIZED;
        SparseArray<ru8> sparseArray = new SparseArray<>();
        h = sparseArray;
        sparseArray.put(0, ru8Var);
        sparseArray.put(1, ru8Var2);
        sparseArray.put(2, ru8Var3);
        sparseArray.put(3, ru8Var4);
        sparseArray.put(4, ru8Var5);
        sparseArray.put(-1, ru8Var6);
    }

    ru8(int i2) {
        this.a = i2;
    }
}
