package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: DeepLinkInAppCallback.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\r\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lzo2;", "Lhx4;", "", "id", "redirectUrl", "payload", "", "a", "b", "Ln5;", "Lbk6;", c.a, "()Ln5;", "activityManager", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zo2  reason: default package */
/* loaded from: classes.dex */
public class zo2 implements hx4 {
    static final /* synthetic */ je5<Object>[] b = {bc9.f(new ar8(zo2.class, "activityManager", "getActivityManager()Lcloud/mindbox/mobile_sdk/inapp/presentation/ActivityManager;", 0))};
    private final bk6 a = ck6.a(a.a);

    /* compiled from: DeepLinkInAppCallback.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgo;", "Ln5;", "a", "(Lgo;)Ln5;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: zo2$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<go, n5> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final n5 invoke(go goVar) {
            z65.h(goVar, "$this$mindboxInject");
            return goVar.j();
        }
    }

    private final n5 c() {
        return (n5) this.a.a(this, b[0]);
    }

    @Override // defpackage.hx4
    public void a(String str, String str2, String str3) {
        z65.h(str, "id");
        z65.h(str2, "redirectUrl");
        z65.h(str3, "payload");
        c().a(str2);
    }

    @Override // defpackage.hx4
    public void b(String str) {
        z65.h(str, "id");
    }
}
