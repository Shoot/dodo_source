package defpackage;

import java.util.List;
import kotlin.Metadata;
/* compiled from: ComposableInAppCallback.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e\"\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Ldn1;", "Lhx4;", "", "id", "redirectUrl", "payload", "", "a", "b", "", "Ljava/util/List;", "getCallbacks", "()Ljava/util/List;", "callbacks", "", "<init>", "([Lhx4;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: dn1  reason: default package */
/* loaded from: classes.dex */
public class dn1 implements hx4 {
    private final List<hx4> a;

    public dn1(hx4... hx4VarArr) {
        List<hx4> U;
        z65.h(hx4VarArr, "callbacks");
        U = yr.U(hx4VarArr);
        this.a = U;
    }

    @Override // defpackage.hx4
    public void a(String str, String str2, String str3) {
        z65.h(str, "id");
        z65.h(str2, "redirectUrl");
        z65.h(str3, "payload");
        for (hx4 hx4Var : this.a) {
            hx4Var.a(str, str2, str3);
        }
    }

    @Override // defpackage.hx4
    public void b(String str) {
        z65.h(str, "id");
        for (hx4 hx4Var : this.a) {
            hx4Var.b(str);
        }
    }
}
