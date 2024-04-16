package defpackage;

import kotlin.Metadata;
/* compiled from: RootComponentDependenciesRegistry.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lrl6;", "Lkm1;", "Ljm1;", "T", "Lod5;", "clazz", "a", "(Lod5;)Ljm1;", "<init>", "()V", "di_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: rl6  reason: default package */
/* loaded from: classes.dex */
public final class rl6 implements km1 {
    @Override // defpackage.km1
    public <T extends jm1> T a(od5<? extends T> od5Var) {
        z65.h(od5Var, "clazz");
        throw new IllegalStateException(("There is no active component dependencies implementing " + od5Var).toString());
    }
}
