package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: InAppCallbackWrapper.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u0010"}, d2 = {"Lix4;", "Lhx4;", "", "id", "redirectUrl", "payload", "", "a", "b", "Lhx4;", "callback", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "afterDismiss", "<init>", "(Lhx4;Lkotlin/jvm/functions/Function0;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ix4  reason: default package */
/* loaded from: classes.dex */
public final class ix4 implements hx4 {
    private final hx4 a;
    private final Function0<Unit> b;

    public ix4(hx4 hx4Var, Function0<Unit> function0) {
        z65.h(hx4Var, "callback");
        z65.h(function0, "afterDismiss");
        this.a = hx4Var;
        this.b = function0;
    }

    @Override // defpackage.hx4
    public void a(String str, String str2, String str3) {
        z65.h(str, "id");
        z65.h(str2, "redirectUrl");
        z65.h(str3, "payload");
        this.a.a(str, str2, str3);
    }

    @Override // defpackage.hx4
    public void b(String str) {
        z65.h(str, "id");
        this.a.b(str);
        this.b.invoke();
    }
}
