package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RateAppServiceImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\b¨\u0006\f"}, d2 = {"Ly49;", "Lx49;", "", "a", "", "b", c.a, "Lci8;", "Lci8;", "preferences", "<init>", "(Lci8;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: y49  reason: default package */
/* loaded from: classes.dex */
public final class y49 implements x49 {
    public static final a b = new a(null);
    private final ci8 a;

    /* compiled from: RateAppServiceImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ly49$a;", "", "", "MAX_ATTEMPTS", "I", "getMAX_ATTEMPTS$annotations", "()V", "<init>", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: y49$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public y49(ci8 ci8Var) {
        z65.h(ci8Var, "preferences");
        this.a = ci8Var;
    }

    @Override // defpackage.x49
    public boolean a() {
        if (this.a.v() || this.a.x() >= 3) {
            return false;
        }
        return true;
    }

    @Override // defpackage.x49
    public void b() {
        this.a.e();
    }

    @Override // defpackage.x49
    public void c() {
        this.a.B(this.a.x() + 1);
    }
}
