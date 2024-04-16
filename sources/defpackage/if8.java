package defpackage;

import java.util.ArrayList;
import kotlin.Metadata;
/* compiled from: PoolingContainer.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0007j\b\u0012\u0004\u0012\u00020\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\r"}, d2 = {"Lif8;", "", "Lhf8;", "listener", "", "a", "b", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "listeners", "<init>", "()V", "customview-poolingcontainer_release"}, k = 1, mv = {1, 6, 0})
/* renamed from: if8  reason: default package */
/* loaded from: classes.dex */
final class if8 {
    private final ArrayList<hf8> a = new ArrayList<>();

    public final void a(hf8 hf8Var) {
        z65.h(hf8Var, "listener");
        this.a.add(hf8Var);
    }

    public final void b(hf8 hf8Var) {
        z65.h(hf8Var, "listener");
        this.a.remove(hf8Var);
    }
}
