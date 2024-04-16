package defpackage;

import kotlin.Metadata;
/* compiled from: LoggingExceptionHandler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\b"}, d2 = {"Lyx5;", "Lol3;", "", "exception", "", "a", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: yx5  reason: default package */
/* loaded from: classes.dex */
public final class yx5 extends ol3 {
    public static final yx5 a = new yx5();

    private yx5() {
    }

    @Override // defpackage.ol3
    protected void a(Throwable th) {
        z65.h(th, "exception");
        try {
            fk6.a.f(mj6.a, "Mindbox caught unhandled error", th);
        } catch (Throwable th2) {
            System.out.println((Object) th2.getMessage());
        }
    }
}
