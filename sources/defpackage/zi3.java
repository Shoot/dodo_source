package defpackage;

import kotlin.Metadata;
/* compiled from: EntityDeletionOrUpdateAdapter.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¨\u0006\u0011"}, d2 = {"Lzi3;", "T", "Laia;", "Lc3b;", "statement", "entity", "", "i", "(Lc3b;Ljava/lang/Object;)V", "", "entities", "", "j", "Lun9;", "database", "<init>", "(Lun9;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: zi3  reason: default package */
/* loaded from: classes.dex */
public abstract class zi3<T> extends aia {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi3(un9 un9Var) {
        super(un9Var);
        z65.h(un9Var, "database");
    }

    protected abstract void i(c3b c3bVar, T t);

    public final int j(Iterable<? extends T> iterable) {
        z65.h(iterable, "entities");
        c3b b = b();
        try {
            int i = 0;
            for (T t : iterable) {
                i(b, t);
                i += b.I();
            }
            return i;
        } finally {
            h(b);
        }
    }
}
