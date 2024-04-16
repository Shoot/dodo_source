package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Effects.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lb43;", "Lxc9;", "", "a", c.a, "b", "Lkotlin/Function1;", "Ld43;", "Lc43;", "Lkotlin/jvm/functions/Function1;", "effect", "Lc43;", "onDispose", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: b43  reason: default package */
/* loaded from: classes.dex */
public final class b43 implements xc9 {
    private final Function1<d43, c43> a;
    private c43 b;

    /* JADX WARN: Multi-variable type inference failed */
    public b43(Function1<? super d43, ? extends c43> function1) {
        z65.h(function1, "effect");
        this.a = function1;
    }

    @Override // defpackage.xc9
    public void a() {
        d43 d43Var;
        Function1<d43, c43> function1 = this.a;
        d43Var = zd3.a;
        this.b = function1.invoke(d43Var);
    }

    @Override // defpackage.xc9
    public void c() {
        c43 c43Var = this.b;
        if (c43Var != null) {
            c43Var.a();
        }
        this.b = null;
    }

    @Override // defpackage.xc9
    public void b() {
    }
}
