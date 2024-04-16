package defpackage;

import androidx.annotation.NonNull;
import defpackage.mm6;
import defpackage.uk2;
/* compiled from: UnitModelLoader.java */
/* renamed from: sqb  reason: default package */
/* loaded from: classes.dex */
public class sqb<Model> implements mm6<Model, Model> {
    private static final sqb<?> a = new sqb<>();

    /* compiled from: UnitModelLoader.java */
    /* renamed from: sqb$a */
    /* loaded from: classes.dex */
    public static class a<Model> implements nm6<Model, Model> {
        private static final a<?> a = new a<>();

        public static <T> a<T> a() {
            return (a<T>) a;
        }

        @Override // defpackage.nm6
        @NonNull
        public mm6<Model, Model> d(qp6 qp6Var) {
            return sqb.c();
        }
    }

    public static <T> sqb<T> c() {
        return (sqb<T>) a;
    }

    @Override // defpackage.mm6
    public boolean a(@NonNull Model model) {
        return true;
    }

    @Override // defpackage.mm6
    public mm6.a<Model> b(@NonNull Model model, int i, int i2, @NonNull ac7 ac7Var) {
        return new mm6.a<>(new e57(model), new b(model));
    }

    /* compiled from: UnitModelLoader.java */
    /* renamed from: sqb$b */
    /* loaded from: classes.dex */
    private static class b<Model> implements uk2<Model> {
        private final Model a;

        b(Model model) {
            this.a = model;
        }

        @Override // defpackage.uk2
        @NonNull
        public Class<Model> a() {
            return (Class<Model>) this.a.getClass();
        }

        @Override // defpackage.uk2
        public void d(@NonNull yj8 yj8Var, @NonNull uk2.a<? super Model> aVar) {
            aVar.f((Model) this.a);
        }

        @Override // defpackage.uk2
        @NonNull
        public dl2 e() {
            return dl2.LOCAL;
        }

        @Override // defpackage.uk2
        public void b() {
        }

        @Override // defpackage.uk2
        public void cancel() {
        }
    }
}
