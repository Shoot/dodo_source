package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: R8$$SyntheticClass */
/* renamed from: q7c  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class q7c {
    public static /* synthetic */ boolean a(AtomicReferenceArray atomicReferenceArray, int i, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }
}
