package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: result.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ld98;", "", "<init>", "()V", "a", "b", "Ld98$a;", "Ld98$b;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: d98  reason: default package */
/* loaded from: classes4.dex */
public abstract class d98 {

    /* compiled from: result.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\nR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0018"}, d2 = {"Ld98$a;", "Ld98;", "Ld88;", "a", "Ld88;", "b", "()Ld88;", "pizzeria", "Lc8a;", "Lc8a;", "()Lc8a;", "mode", "Ln9a;", c.a, "Ln9a;", "()Ln9a;", "selectedPizzeriaType", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isNearestPizzeria", "<init>", "(Ld88;Lc8a;Ln9a;Ljava/lang/Boolean;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: d98$a */
    /* loaded from: classes4.dex */
    public static final class a extends d98 {
        private final d88 a;
        private final c8a b;
        private final n9a c;
        private final Boolean d;

        public /* synthetic */ a(d88 d88Var, c8a c8aVar, n9a n9aVar, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(d88Var, c8aVar, n9aVar, (i & 8) != 0 ? null : bool);
        }

        public final c8a a() {
            return this.b;
        }

        public final d88 b() {
            return this.a;
        }

        public final n9a c() {
            return this.c;
        }

        public final Boolean d() {
            return this.d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d88 d88Var, c8a c8aVar, n9a n9aVar, Boolean bool) {
            super(null);
            z65.h(d88Var, "pizzeria");
            z65.h(c8aVar, "mode");
            z65.h(n9aVar, "selectedPizzeriaType");
            this.a = d88Var;
            this.b = c8aVar;
            this.c = n9aVar;
            this.d = bool;
        }
    }

    /* compiled from: result.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld98$b;", "Ld98;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: d98$b */
    /* loaded from: classes4.dex */
    public static final class b extends d98 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    private d98() {
    }

    public /* synthetic */ d98(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
