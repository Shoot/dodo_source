package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.fz4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: InAppStoryAnalytics.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lbz4;", "", "Lfz4$a;", "click", "Ldc;", "a", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bz4  reason: default package */
/* loaded from: classes2.dex */
public final class bz4 {
    public static final bz4 a = new bz4();

    /* compiled from: InAppStoryAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bz4$a */
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ fz4.a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(fz4.a aVar) {
            super(1);
            this.a = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "storiesId", Integer.valueOf(this.a.b()), false, 4, null);
            bc.e(bcVar, Action.NAME_ATTRIBUTE, this.a.c(), false, 4, null);
            return bc.e(bcVar, RemoteMessageConst.Notification.URL, this.a.a(), false, 4, null);
        }
    }

    private bz4() {
    }

    public final dc a(fz4.a aVar) {
        z65.h(aVar, "click");
        return ec.a("stories_button_click", new a(aVar));
    }
}
