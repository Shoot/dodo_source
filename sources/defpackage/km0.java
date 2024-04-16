package defpackage;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
/* compiled from: CallbackInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lkm0;", "Ljm0;", "", "userString", "", "b", RemoteMessageConst.Notification.URL, "a", "Llm0;", "Llm0;", "callbackRepository", "<init>", "(Llm0;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: km0  reason: default package */
/* loaded from: classes.dex */
public final class km0 implements jm0 {
    private final lm0 a;

    public km0(lm0 lm0Var) {
        z65.h(lm0Var, "callbackRepository");
        this.a = lm0Var;
    }

    @Override // defpackage.jm0
    public boolean a(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        return this.a.a(str);
    }

    @Override // defpackage.jm0
    public boolean b(String str) {
        z65.h(str, "userString");
        return this.a.b(str);
    }
}
