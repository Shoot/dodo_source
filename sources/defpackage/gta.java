package defpackage;

import defpackage.sk9;
import kotlin.Metadata;
/* compiled from: StackTraceRecovery.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001c\u0010\b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007\"\u001c\u0010\n\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007*\f\b\u0000\u0010\f\"\u00020\u000b2\u00020\u000b*\f\b\u0000\u0010\u000e\"\u00020\r2\u00020\r¨\u0006\u000f"}, d2 = {"", "E", "exception", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "baseContinuationImplClassName", "b", "stackTraceRecoveryClassName", "Ltx1;", "CoroutineStackFrame", "Ljava/lang/StackTraceElement;", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: gta  reason: default package */
/* loaded from: classes3.dex */
public final class gta {
    private static final String a;
    private static final String b;

    static {
        Object b2;
        Object b3;
        try {
            sk9.a aVar = sk9.b;
            b2 = sk9.b(e70.class.getCanonicalName());
        } catch (Throwable th) {
            sk9.a aVar2 = sk9.b;
            b2 = sk9.b(vk9.a(th));
        }
        if (sk9.d(b2) != null) {
            b2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        a = (String) b2;
        try {
            b3 = sk9.b(gta.class.getCanonicalName());
        } catch (Throwable th2) {
            sk9.a aVar3 = sk9.b;
            b3 = sk9.b(vk9.a(th2));
        }
        if (sk9.d(b3) != null) {
            b3 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        b = (String) b3;
    }

    public static final <E extends Throwable> E a(E e) {
        return e;
    }
}
