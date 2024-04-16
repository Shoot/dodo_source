package defpackage;

import androidx.lifecycle.r;
import androidx.lifecycle.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: InitializerViewModelFactory.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006J\u0006\u0010\f\u001a\u00020\u000bR\u001e\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0013"}, d2 = {"Lb35;", "", "Landroidx/lifecycle/r;", "T", "Lod5;", "clazz", "Lkotlin/Function1;", "Ln22;", "initializer", "", "a", "Landroidx/lifecycle/s$b;", "b", "", "Lszb;", "Ljava/util/List;", "initializers", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: b35  reason: default package */
/* loaded from: classes.dex */
public final class b35 {
    private final List<szb<?>> a = new ArrayList();

    public final <T extends r> void a(od5<T> od5Var, Function1<? super n22, ? extends T> function1) {
        z65.h(od5Var, "clazz");
        z65.h(function1, "initializer");
        this.a.add(new szb<>(gd5.a(od5Var), function1));
    }

    public final s.b b() {
        szb[] szbVarArr = (szb[]) this.a.toArray(new szb[0]);
        return new a35((szb[]) Arrays.copyOf(szbVarArr, szbVarArr.length));
    }
}
