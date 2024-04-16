package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Bindings.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0007B%\u0012\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u00002\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\n\u001a\u00020\tR*\u0010\r\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00028\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lpn5;", "T", "V", "Lk79;", "thisRef", "Lje5;", "property", "a", "(Ljava/lang/Object;Lje5;)Ljava/lang/Object;", "", c.a, "Lkotlin/Function2;", "Lkotlin/jvm/functions/Function2;", "initializer", "", "b", "Ljava/lang/Object;", "value", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pn5  reason: default package */
/* loaded from: classes.dex */
public final class pn5<T, V> implements k79<T, V> {
    private final Function2<T, je5<?>, V> a;
    private Object b;

    /* compiled from: Bindings.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpn5$a;", "", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pn5$a */
    /* loaded from: classes.dex */
    private static final class a {
        public static final a a = new a();

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pn5(Function2<? super T, ? super je5<?>, ? extends V> function2) {
        z65.h(function2, "initializer");
        this.a = function2;
        this.b = a.a;
    }

    @Override // defpackage.k79
    public V a(T t, je5<?> je5Var) {
        z65.h(je5Var, "property");
        lb0 lb0Var = lb0.a;
        z65.e(t);
        lb0Var.b(t, this);
        if (z65.c(this.b, a.a)) {
            this.b = this.a.invoke(t, je5Var);
        }
        return (V) this.b;
    }

    public final void c() {
        this.b = a.a;
    }
}
