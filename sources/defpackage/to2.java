package defpackage;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: DeepLinkAnalytics.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¨\u0006\n"}, d2 = {"Lto2;", "", "", RemoteMessageConst.Notification.URL, "campaign", "mediaSource", "Ldc;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: to2  reason: default package */
/* loaded from: classes4.dex */
public final class to2 {
    public static final to2 a = new to2();

    /* compiled from: DeepLinkAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: to2$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2, String str3) {
            super(1);
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, RemoteMessageConst.Notification.URL, this.a, false, 4, null);
            bc.e(bcVar, "campaign", this.b, false, 4, null);
            return bc.e(bcVar, "media_source", this.c, false, 4, null);
        }
    }

    private to2() {
    }

    public final dc a(String str, String str2, String str3) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        return ec.a("deeplink_received", new a(str, str2, str3));
    }
}
