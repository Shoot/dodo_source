package defpackage;

import defpackage.h80;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Cicerone.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u0007*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0005B\u0011\b\u0002\u0012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0005\u001a\u00020\u0004R\u0017\u0010\t\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lr71;", "Lh80;", "T", "", "Ldv6;", "a", "Lh80;", "b", "()Lh80;", "router", "<init>", "(Lh80;)V", "cicerone"}, k = 1, mv = {1, 5, 1})
/* renamed from: r71  reason: default package */
/* loaded from: classes2.dex */
public final class r71<T extends h80> {
    public static final a b = new a(null);
    private final T a;

    /* compiled from: Cicerone.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lr71$a;", "", "Lh80;", "T", "customRouter", "Lr71;", "a", "(Lh80;)Lr71;", "<init>", "()V", "cicerone"}, k = 1, mv = {1, 5, 1})
    /* renamed from: r71$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T extends h80> r71<T> a(T t) {
            z65.h(t, "customRouter");
            return new r71<>(t, null);
        }
    }

    public /* synthetic */ r71(h80 h80Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(h80Var);
    }

    public final dv6 a() {
        return this.a.b();
    }

    public final T b() {
        return this.a;
    }

    private r71(T t) {
        this.a = t;
    }
}
