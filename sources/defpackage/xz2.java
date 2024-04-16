package defpackage;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: DellveryAddressAnalytic.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0002"}, d2 = {"Ldc;", "a", "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* renamed from: xz2  reason: default package */
/* loaded from: classes4.dex */
public final class xz2 {

    /* compiled from: DellveryAddressAnalytic.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xz2$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<bc, bc> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return bc.e(bcVar, RemoteMessageConst.INPUT_TYPE, "old_fields", false, 4, null);
        }
    }

    public static final dc a() {
        return ec.a("screen_new_address", a.a);
    }
}
