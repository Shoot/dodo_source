package defpackage;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: StoriesAnalytics.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b¨\u0006\u000e"}, d2 = {"Lvxa;", "", "", "storiesId", "", "storiesName", "tags", "slidesCount", "Lqd;", "sender", "Ldc;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vxa  reason: default package */
/* loaded from: classes4.dex */
public final class vxa {
    public static final vxa a = new vxa();

    /* compiled from: StoriesAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: vxa$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ qd a;
        final /* synthetic */ int b;
        final /* synthetic */ String c;
        final /* synthetic */ int d;
        final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(qd qdVar, int i, String str, int i2, String str2) {
            super(1);
            this.a = qdVar;
            this.b = i;
            this.c = str;
            this.d = i2;
            this.e = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.A(bcVar, this.a.getValue());
            bc.e(bcVar, "storiesId", Integer.valueOf(this.b), false, 4, null);
            bc.e(bcVar, "stories_id", Integer.valueOf(this.b), false, 4, null);
            bc.e(bcVar, "tags", this.c, false, 4, null);
            bc.e(bcVar, "slides_count", Integer.valueOf(this.d), false, 4, null);
            return bc.e(bcVar, Action.NAME_ATTRIBUTE, this.e, false, 4, null);
        }
    }

    private vxa() {
    }

    public final dc a(int i, String str, String str2, int i2, qd qdVar) {
        z65.h(str, "storiesName");
        z65.h(str2, "tags");
        z65.h(qdVar, "sender");
        return ec.a("open_stories", new a(qdVar, i, str2, i2, str));
    }
}
