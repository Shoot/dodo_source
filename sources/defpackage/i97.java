package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OnboardingFlow.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Li97;", "Ljava/io/Serializable;", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "Li97$a;", "Li97$b;", "Li97$c;", "Li97$d;", "onboarding_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: i97  reason: default package */
/* loaded from: classes2.dex */
public abstract class i97 implements Serializable {

    /* compiled from: OnboardingFlow.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Li97$a;", "Li97;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "baseUrl", "<init>", "(Ljava/lang/String;)V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: i97$a */
    /* loaded from: classes2.dex */
    public static final class a extends i97 {
        private final String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            z65.h(str, "baseUrl");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && z65.c(this.a, ((a) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            String str = this.a;
            return "BaseUrlUpdateRequiredFlow(baseUrl=" + str + ")";
        }
    }

    /* compiled from: OnboardingFlow.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Li97$b;", "Li97;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "<init>", "(Ljava/lang/String;)V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: i97$b */
    /* loaded from: classes2.dex */
    public static final class b extends i97 implements Serializable {
        private final String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
            this.a = str;
        }

        public final String a() {
            return this.a;
        }
    }

    /* compiled from: OnboardingFlow.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Li97$d;", "Li97;", "Ljava/io/Serializable;", "<init>", "()V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: i97$d */
    /* loaded from: classes2.dex */
    public static final class d extends i97 implements Serializable {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    private i97() {
    }

    public /* synthetic */ i97(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: OnboardingFlow.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\t\u0010\u0006¨\u0006\u0011"}, d2 = {"Li97$c;", "Li97;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "Lha4;", "b", "Lha4;", com.huawei.hms.opendevice.c.a, "()Lha4;", "scenario", "currentAddress", "<init>", "(Ljava/lang/String;Lha4;Ljava/lang/String;)V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: i97$c */
    /* loaded from: classes2.dex */
    public static final class c extends i97 implements Serializable {
        private final String a;
        private final ha4 b;
        private final String c;

        public /* synthetic */ c(String str, ha4 ha4Var, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? ha4.a : ha4Var, (i & 4) != 0 ? null : str2);
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.c;
        }

        public final ha4 c() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, ha4 ha4Var, String str2) {
            super(null);
            z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
            z65.h(ha4Var, "scenario");
            this.a = str;
            this.b = ha4Var;
            this.c = str2;
        }
    }
}
