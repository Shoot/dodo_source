package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ToggleVO.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lbib;", "", "<init>", "()V", "a", "b", "Lbib$a;", "Lbib$b;", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bib  reason: default package */
/* loaded from: classes.dex */
public abstract class bib {

    /* compiled from: ToggleVO.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\nR\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0015\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011¨\u0006\u0018"}, d2 = {"Lbib$a;", "Lbib;", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "title", "Lbq3;", "Lbq3;", "()Lbq3;", "featureCode", "", c.a, "Z", "()Z", e.a, "(Z)V", "isEnabled", DateTokenConverter.CONVERTER_KEY, "f", "isSetLocally", "<init>", "(Ljava/lang/String;Lbq3;ZZ)V", "core_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: bib$a */
    /* loaded from: classes.dex */
    public static final class a extends bib {
        private final String a;
        private final bq3 b;
        private boolean c;
        private boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, bq3 bq3Var, boolean z, boolean z2) {
            super(null);
            z65.h(str, "title");
            z65.h(bq3Var, "featureCode");
            this.a = str;
            this.b = bq3Var;
            this.c = z;
            this.d = z2;
        }

        public final bq3 a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final boolean c() {
            return this.c;
        }

        public final boolean d() {
            return this.d;
        }

        public final void e(boolean z) {
            this.c = z;
        }

        public final void f(boolean z) {
            this.d = z;
        }
    }

    /* compiled from: ToggleVO.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lbib$b;", "Lbib;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "title", "<init>", "(Ljava/lang/String;)V", "core_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: bib$b */
    /* loaded from: classes.dex */
    public static final class b extends bib {
        private final String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            z65.h(str, "title");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }
    }

    private bib() {
    }

    public /* synthetic */ bib(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
