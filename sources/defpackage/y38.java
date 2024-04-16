package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.presentation.phonenumberlogin.e;
/* compiled from: PhoneNumberLoginScreen.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Ly38;", "Ls64;", "Landroidx/fragment/app/Fragment;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lru/dodopizza/app/presentation/phonenumberlogin/e;", "Lru/dodopizza/app/presentation/phonenumberlogin/e;", "data", "b", "()Ljava/lang/String;", "screenKey", "<init>", "(Lru/dodopizza/app/presentation/phonenumberlogin/e;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: y38  reason: default package */
/* loaded from: classes4.dex */
public final class y38 implements s64 {
    public static final a b = new a(null);
    private final e a;

    /* compiled from: PhoneNumberLoginScreen.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ly38$a;", "", "", "REGISTRATION_PHONE_FRAGMENT_SCREEN_KEY", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: y38$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public y38(e eVar) {
        z65.h(eVar, "data");
        this.a = eVar;
    }

    @Override // defpackage.s64
    public Fragment a() {
        return p38.s.a(this.a);
    }

    @Override // defpackage.yw9
    public String b() {
        return "registration_phone_fragment";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y38) && z65.c(this.a, ((y38) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        e eVar = this.a;
        return "PhoneNumberLoginScreen(data=" + eVar + ")";
    }
}
