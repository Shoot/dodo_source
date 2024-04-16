package defpackage;

import com.dodopizza.feature.webinfo.presentation.a;
import com.dodopizza.feature.webinfo.presentation.d;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PhoneNumberCollectorRouter.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0011\b\u0007\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Li38;", "Lh38;", "Lg38;", "phoneNumber", "", c.a, "", RemoteMessageConst.Notification.URL, "b", "a", "Lf63;", "Lf63;", "router", "<init>", "(Lf63;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: i38  reason: default package */
/* loaded from: classes2.dex */
public final class i38 implements h38 {
    public static final a b = new a(null);
    private static final int c = dy8.phone_number_send_result_id;
    private final f63 a;

    /* compiled from: PhoneNumberCollectorRouter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Li38$a;", "", "", "PHONE_NUMBER_SEND_RESULT_ID", "I", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: i38$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public i38(f63 f63Var) {
        z65.h(f63Var, "router");
        this.a = f63Var;
    }

    @Override // defpackage.h38
    public void a() {
        this.a.d();
    }

    @Override // defpackage.h38
    public void b(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        this.a.e(d.a(new com.dodopizza.feature.webinfo.presentation.a((String) null, str, (a.InterfaceC0123a) null, 4, (DefaultConstructorMarker) null)));
    }

    @Override // defpackage.h38
    public void c(g38 g38Var) {
        z65.h(g38Var, "phoneNumber");
        this.a.i(c, g38Var);
    }
}
