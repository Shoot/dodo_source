package defpackage;

import androidx.lifecycle.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: InitializerViewModelFactory.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lszb;", "Landroidx/lifecycle/r;", "T", "", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "()Ljava/lang/Class;", "clazz", "Lkotlin/Function1;", "Ln22;", "b", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "initializer", "<init>", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: szb  reason: default package */
/* loaded from: classes.dex */
public final class szb<T extends r> {
    private final Class<T> a;
    private final Function1<n22, T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public szb(Class<T> cls, Function1<? super n22, ? extends T> function1) {
        z65.h(cls, "clazz");
        z65.h(function1, "initializer");
        this.a = cls;
        this.b = function1;
    }

    public final Class<T> a() {
        return this.a;
    }

    public final Function1<n22, T> b() {
        return this.b;
    }
}
