package defpackage;

import kotlin.Metadata;
/* compiled from: SingleProcessDataStore.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Ldv3;", "T", "Lyta;", "", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "finalException", "<init>", "(Ljava/lang/Throwable;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
/* renamed from: dv3  reason: default package */
/* loaded from: classes.dex */
final class dv3<T> extends yta<T> {
    private final Throwable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv3(Throwable th) {
        super(null);
        z65.h(th, "finalException");
        this.a = th;
    }

    public final Throwable a() {
        return this.a;
    }
}
