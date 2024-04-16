package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: IntrinsicsPolicy.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR/\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0007\u0010\u0010¨\u0006\u0015"}, d2 = {"Ld75;", "", "Lqb6;", "measurePolicy", "", "b", "Len5;", "a", "Len5;", "getLayoutNode", "()Len5;", "layoutNode", "<set-?>", "Ler6;", "getMeasurePolicyState", "()Lqb6;", "(Lqb6;)V", "measurePolicyState", "<init>", "(Len5;)V", c.a, "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: d75  reason: default package */
/* loaded from: classes.dex */
public final class d75 {
    private static final a c = new a(null);
    private final en5 a;
    private final er6 b;

    /* compiled from: IntrinsicsPolicy.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ld75$a;", "", "", "NoPolicyError", "Ljava/lang/String;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: d75$a */
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public d75(en5 en5Var) {
        er6 c2;
        z65.h(en5Var, "layoutNode");
        this.a = en5Var;
        c2 = tpa.c(null, null, 2, null);
        this.b = c2;
    }

    private final void a(qb6 qb6Var) {
        this.b.setValue(qb6Var);
    }

    public final void b(qb6 qb6Var) {
        z65.h(qb6Var, "measurePolicy");
        a(qb6Var);
    }
}
