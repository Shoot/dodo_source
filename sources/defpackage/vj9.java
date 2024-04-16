package defpackage;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ResourceEncoderRegistry.java */
/* renamed from: vj9  reason: default package */
/* loaded from: classes.dex */
public class vj9 {
    private final List<a<?>> a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceEncoderRegistry.java */
    /* renamed from: vj9$a */
    /* loaded from: classes.dex */
    public static final class a<T> {
        private final Class<T> a;
        final uj9<T> b;

        a(@NonNull Class<T> cls, @NonNull uj9<T> uj9Var) {
            this.a = cls;
            this.b = uj9Var;
        }

        boolean a(@NonNull Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(@NonNull Class<Z> cls, @NonNull uj9<Z> uj9Var) {
        this.a.add(new a<>(cls, uj9Var));
    }

    public synchronized <Z> uj9<Z> b(@NonNull Class<Z> cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            a<?> aVar = this.a.get(i);
            if (aVar.a(cls)) {
                return (uj9<Z>) aVar.b;
            }
        }
        return null;
    }
}
