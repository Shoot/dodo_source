package defpackage;

import kotlin.Metadata;
/* compiled from: EntityInsertionAdapter.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Ldj3;", "T", "Laia;", "Lc3b;", "statement", "entity", "", "i", "(Lc3b;Ljava/lang/Object;)V", "j", "(Ljava/lang/Object;)V", "Lun9;", "database", "<init>", "(Lun9;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: dj3  reason: default package */
/* loaded from: classes.dex */
public abstract class dj3<T> extends aia {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj3(un9 un9Var) {
        super(un9Var);
        z65.h(un9Var, "database");
    }

    protected abstract void i(c3b c3bVar, T t);

    public final void j(T t) {
        c3b b = b();
        try {
            i(b, t);
            b.D0();
        } finally {
            h(b);
        }
    }
}
