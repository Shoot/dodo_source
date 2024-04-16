package defpackage;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
/* compiled from: EncoderRegistry.java */
/* renamed from: dh3  reason: default package */
/* loaded from: classes.dex */
public class dh3 {
    private final List<a<?>> a = new ArrayList();

    /* compiled from: EncoderRegistry.java */
    /* renamed from: dh3$a */
    /* loaded from: classes.dex */
    private static final class a<T> {
        private final Class<T> a;
        final bh3<T> b;

        a(@NonNull Class<T> cls, @NonNull bh3<T> bh3Var) {
            this.a = cls;
            this.b = bh3Var;
        }

        boolean a(@NonNull Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(@NonNull Class<T> cls, @NonNull bh3<T> bh3Var) {
        this.a.add(new a<>(cls, bh3Var));
    }

    public synchronized <T> bh3<T> b(@NonNull Class<T> cls) {
        for (a<?> aVar : this.a) {
            if (aVar.a(cls)) {
                return (bh3<T>) aVar.b;
            }
        }
        return null;
    }
}
