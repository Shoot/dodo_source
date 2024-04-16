package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: CopyPayloadInAppCallback.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\r\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Ltw1;", "Lhx4;", "", "id", "redirectUrl", "payload", "", "a", "b", "Ljm0;", "Lbk6;", c.a, "()Ljm0;", "callbackInteractor", "Lq91;", DateTokenConverter.CONVERTER_KEY, "()Lq91;", "clipboardManager", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: tw1  reason: default package */
/* loaded from: classes.dex */
public class tw1 implements hx4 {
    static final /* synthetic */ je5<Object>[] c = {bc9.f(new ar8(tw1.class, "callbackInteractor", "getCallbackInteractor()Lcloud/mindbox/mobile_sdk/inapp/domain/interfaces/interactors/CallbackInteractor;", 0)), bc9.f(new ar8(tw1.class, "clipboardManager", "getClipboardManager()Lcloud/mindbox/mobile_sdk/inapp/presentation/ClipboardManager;", 0))};
    private final bk6 a = ck6.a(a.a);
    private final bk6 b = ck6.a(b.a);

    /* compiled from: CopyPayloadInAppCallback.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgo;", "Ljm0;", "a", "(Lgo;)Ljm0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: tw1$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<go, jm0> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final jm0 invoke(go goVar) {
            z65.h(goVar, "$this$mindboxInject");
            return goVar.e();
        }
    }

    /* compiled from: CopyPayloadInAppCallback.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgo;", "Lq91;", "a", "(Lgo;)Lq91;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: tw1$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<go, q91> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final q91 invoke(go goVar) {
            z65.h(goVar, "$this$mindboxInject");
            return goVar.getClipboardManager();
        }
    }

    private final jm0 c() {
        return (jm0) this.a.a(this, c[0]);
    }

    private final q91 d() {
        return (q91) this.b.a(this, c[1]);
    }

    @Override // defpackage.hx4
    public void a(String str, String str2, String str3) {
        z65.h(str, "id");
        z65.h(str2, "redirectUrl");
        z65.h(str3, "payload");
        if (c().b(str3)) {
            d().a(str3);
        }
    }

    @Override // defpackage.hx4
    public void b(String str) {
        z65.h(str, "id");
    }
}
