package defpackage;

import android.view.View;
import defpackage.o3b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: SplitListeners.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\r"}, d2 = {"Lisa;", "Lo3b;", "", "isCompleted", "", "a", "b", "Lkotlin/Function0;", "Lta7;", "Lkotlin/jvm/functions/Function0;", "getSecretItemHolderFun", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: isa  reason: default package */
/* loaded from: classes2.dex */
public final class isa implements o3b {
    private final Function0<ta7> a;

    /* JADX WARN: Multi-variable type inference failed */
    public isa(Function0<? extends ta7> function0) {
        z65.h(function0, "getSecretItemHolderFun");
        this.a = function0;
    }

    @Override // defpackage.o3b
    public void a(boolean z) {
        ta7 invoke;
        if (z && (invoke = this.a.invoke()) != null) {
            invoke.onOpened();
        }
    }

    @Override // defpackage.o3b
    public void c(View view, float f) {
        o3b.a.b(this, view, f);
    }

    @Override // defpackage.o3b
    public void d(View view) {
        o3b.a.a(this, view);
    }

    @Override // defpackage.o3b
    public void b() {
    }
}
