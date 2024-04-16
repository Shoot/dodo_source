package defpackage;

import kotlin.Metadata;
/* compiled from: LoggingInAppCallback.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lzx5;", "Lhx4;", "", "id", "redirectUrl", "payload", "", "a", "b", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zx5  reason: default package */
/* loaded from: classes.dex */
public class zx5 implements hx4 {
    @Override // defpackage.hx4
    public void a(String str, String str2, String str3) {
        z65.h(str, "id");
        z65.h(str2, "redirectUrl");
        z65.h(str3, "payload");
        gk6.d(this, "Click on InApp with id = " + str + ", redirectUrl = " + str2 + " and payload = " + str3);
    }

    @Override // defpackage.hx4
    public void b(String str) {
        z65.h(str, "id");
        gk6.d(this, "Dismiss inApp with id = " + str);
    }
}
