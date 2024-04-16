package defpackage;

import defpackage.v27;
import kotlin.Metadata;
/* compiled from: RawDeepLinkAnalyzer.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Ly69;", "", "La79;", "rawDeepLinkData", "", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: y69  reason: default package */
/* loaded from: classes4.dex */
public final class y69 {
    public final boolean a(a79 a79Var) {
        z65.h(a79Var, "rawDeepLinkData");
        String str = a79Var.a().get("notification_sender");
        if (str == null) {
            str = "";
        }
        v27.a aVar = v27.b;
        v27 v27Var = v27.c;
        if (aVar.a(str, v27Var) != v27Var) {
            return true;
        }
        return false;
    }
}
