package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import defpackage.s7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: AddressFieldViewFactory.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lu7;", "Lvs3;", "Lis3;", "fieldInfo", "Lus3;", "a", "Landroid/content/Context;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: u7  reason: default package */
/* loaded from: classes4.dex */
public final class u7 implements vs3 {
    private final Context a;

    public u7(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = context;
    }

    @Override // defpackage.vs3
    public us3 a(is3 is3Var) {
        z65.h(is3Var, "fieldInfo");
        s7 s7Var = (s7) is3Var;
        if (s7Var instanceof s7.b) {
            return new yla(this.a);
        }
        if (s7Var instanceof s7.a) {
            return new t00(this.a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
