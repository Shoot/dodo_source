package defpackage;
/* compiled from: Exceptions.java */
/* renamed from: rl3  reason: default package */
/* loaded from: classes3.dex */
public final class rl3 {
    public static RuntimeException a(Throwable th) {
        throw pl3.d(th);
    }

    public static void b(Throwable th) {
        if (!(th instanceof VirtualMachineError)) {
            if (!(th instanceof ThreadDeath)) {
                if (!(th instanceof LinkageError)) {
                    return;
                }
                throw ((LinkageError) th);
            }
            throw ((ThreadDeath) th);
        }
        throw ((VirtualMachineError) th);
    }
}
