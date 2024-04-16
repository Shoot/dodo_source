package defpackage;

import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.s64;
import kotlin.Metadata;
/* compiled from: ProfileFragmentScreen.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u001a\u0010\u0011\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lfo8;", "Ls64;", "Lk6c;", "Landroidx/fragment/app/Fragment;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "b", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: fo8  reason: default package */
/* loaded from: classes4.dex */
public final class fo8 implements s64, k6c {
    public static final fo8 a = new fo8();
    private static final boolean b = false;

    private fo8() {
    }

    @Override // defpackage.s64
    public Fragment a() {
        return an8.S4.a();
    }

    @Override // defpackage.yw9
    public String b() {
        return s64.a.a(this);
    }

    @Override // defpackage.k6c
    public boolean d() {
        return b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo8)) {
            return false;
        }
        fo8 fo8Var = (fo8) obj;
        return true;
    }

    public int hashCode() {
        return -1066066768;
    }

    public String toString() {
        return "ProfileScreen";
    }
}
