package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ReferralSystemRepository.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\u0010"}, d2 = {"Ltb9;", "", "", "b", "()Ljava/lang/Boolean;", "model", "", c.a, "a", "Lml0;", "Lml0;", "cacheInspector", "Ljava/lang/Boolean;", "cache", "<init>", "(Lml0;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: tb9  reason: default package */
/* loaded from: classes4.dex */
public final class tb9 {
    private static final a c = new a(null);
    private static final long d = TimeUnit.MINUTES.toMillis(5);
    private final ml0 a;
    private volatile Boolean b;

    /* compiled from: ReferralSystemRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ltb9$a;", "", "", "ENTER_CODE_AVAILABILITY_INFO_CACHE_KEY", "Ljava/lang/String;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: tb9$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public tb9(ml0 ml0Var) {
        z65.h(ml0Var, "cacheInspector");
        this.a = ml0Var;
    }

    public final void a() {
        this.b = null;
    }

    public final Boolean b() {
        if (this.b != null && this.a.a("enter_code_availability_info_cache_key")) {
            return this.b;
        }
        return null;
    }

    public final void c(boolean z) {
        this.b = Boolean.valueOf(z);
        this.a.b("enter_code_availability_info_cache_key", d);
    }
}
