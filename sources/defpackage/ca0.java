package defpackage;

import kotlin.Metadata;
/* compiled from: BePaidAcquirer.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lca0;", "Ll4;", "Lxo0;", "cardCredentials", "", "a", "Lzo0;", "cardEncryptor", "<init>", "(Lzo0;)V", "bepaidpayments_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: ca0  reason: default package */
/* loaded from: classes.dex */
public final class ca0 extends l4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca0(zo0 zo0Var) {
        super("BePaid", zo0Var);
        z65.h(zo0Var, "cardEncryptor");
    }

    @Override // defpackage.l4
    public boolean a(xo0 xo0Var) {
        z65.h(xo0Var, "cardCredentials");
        return true;
    }
}
