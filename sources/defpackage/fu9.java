package defpackage;

import kotlin.Metadata;
/* compiled from: SberbankPaymentsAcquirer.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lfu9;", "Ll4;", "Lxo0;", "cardCredentials", "", "a", "", "sberbankCode", "Lzo0;", "cardEncryptor", "<init>", "(Ljava/lang/String;Lzo0;)V", "sberpayments_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: fu9  reason: default package */
/* loaded from: classes2.dex */
public final class fu9 extends l4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu9(String str, zo0 zo0Var) {
        super(str, zo0Var);
        z65.h(str, "sberbankCode");
        z65.h(zo0Var, "cardEncryptor");
    }

    @Override // defpackage.l4
    public boolean a(xo0 xo0Var) {
        z65.h(xo0Var, "cardCredentials");
        return true;
    }
}
