package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: R8$$SyntheticClass */
/* renamed from: ho1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ho1 {
    public static /* synthetic */ boolean a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
