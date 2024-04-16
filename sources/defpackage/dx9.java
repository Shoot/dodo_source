package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: ScreenNewAddressEventFactory.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u0011"}, d2 = {"Ldx9;", "", "", RemoteMessageConst.INPUT_TYPE, "Ldc;", "f", MessageAttributes.TYPE, "", "position", "b", e.a, "g", DateTokenConverter.CONVERTER_KEY, c.a, "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dx9  reason: default package */
/* loaded from: classes4.dex */
public final class dx9 {
    public static final dx9 a = new dx9();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScreenNewAddressEventFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dx9$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, int i) {
            super(1);
            this.a = str;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, MessageAttributes.TYPE, this.a, false, 4, null);
            bc.e(bcVar, "position", Integer.valueOf(this.b), false, 4, null);
            return vc.A(bcVar, "screen_new_address");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScreenNewAddressEventFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dx9$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return bc.e(bcVar, RemoteMessageConst.INPUT_TYPE, this.a, false, 4, null);
        }
    }

    private dx9() {
    }

    private final dc b(String str, int i) {
        return ec.a("address_suggest_selected", new a(str, i));
    }

    private final dc f(String str) {
        return ec.a("screen_new_address", new b(str));
    }

    public final dc a(int i) {
        return b("error", i);
    }

    public final dc c(int i) {
        return b("completeaddress", i);
    }

    public final dc d(int i) {
        return b("incompleteaddress", i);
    }

    public final dc e() {
        return f("map");
    }

    public final dc g() {
        return f("suggests");
    }
}
