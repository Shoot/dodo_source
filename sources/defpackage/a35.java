package defpackage;

import androidx.lifecycle.r;
import androidx.lifecycle.s;
import kotlin.Metadata;
/* compiled from: InitializerViewModelFactory.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u000e\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n\"\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\u000e\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"La35;", "Landroidx/lifecycle/s$b;", "Landroidx/lifecycle/r;", "T", "Ljava/lang/Class;", "modelClass", "Ln22;", "extras", "b", "(Ljava/lang/Class;Ln22;)Landroidx/lifecycle/r;", "", "Lszb;", "a", "[Lszb;", "initializers", "<init>", "([Lszb;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: a35  reason: default package */
/* loaded from: classes.dex */
public final class a35 implements s.b {
    private final szb<?>[] a;

    public a35(szb<?>... szbVarArr) {
        z65.h(szbVarArr, "initializers");
        this.a = szbVarArr;
    }

    @Override // androidx.lifecycle.s.b
    public /* synthetic */ r a(Class cls) {
        return tzb.a(this, cls);
    }

    @Override // androidx.lifecycle.s.b
    public <T extends r> T b(Class<T> cls, n22 n22Var) {
        szb<?>[] szbVarArr;
        z65.h(cls, "modelClass");
        z65.h(n22Var, "extras");
        T t = null;
        for (szb<?> szbVar : this.a) {
            if (z65.c(szbVar.a(), cls)) {
                Object invoke = szbVar.b().invoke(n22Var);
                if (invoke instanceof r) {
                    t = (T) invoke;
                } else {
                    t = null;
                }
            }
        }
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
