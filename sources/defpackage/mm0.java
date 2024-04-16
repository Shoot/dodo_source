package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
/* compiled from: CallbackRepositoryImpl.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lmm0;", "Llm0;", "", "userString", "", "b", RemoteMessageConst.Notification.URL, "a", "Lybc;", "Lybc;", "xmlValidator", "Lxc5;", "Lxc5;", "jsonValidator", "Lbub;", c.a, "Lbub;", "urlValidator", "<init>", "(Lybc;Lxc5;Lbub;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: mm0  reason: default package */
/* loaded from: classes.dex */
public final class mm0 implements lm0 {
    private final ybc a;
    private final xc5 b;
    private final bub c;

    public mm0(ybc ybcVar, xc5 xc5Var, bub bubVar) {
        z65.h(ybcVar, "xmlValidator");
        z65.h(xc5Var, "jsonValidator");
        z65.h(bubVar, "urlValidator");
        this.a = ybcVar;
        this.b = xc5Var;
        this.c = bubVar;
    }

    @Override // defpackage.lm0
    public boolean a(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        return this.c.a(str);
    }

    @Override // defpackage.lm0
    public boolean b(String str) {
        boolean y;
        z65.h(str, "userString");
        if (!this.a.a(str) && !this.b.a(str) && !this.c.a(str)) {
            y = l0b.y(str);
            if (!y) {
                return true;
            }
        }
        return false;
    }
}
