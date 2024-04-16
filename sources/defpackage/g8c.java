package defpackage;

import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: WrapScreen.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u001a\u0010\u0011\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lg8c;", "Ls64;", "Lh6c;", "Lk6c;", "Landroidx/fragment/app/Fragment;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "data", c.a, "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: g8c  reason: default package */
/* loaded from: classes4.dex */
public final class g8c implements s64, h6c, k6c {
    private final String a;
    private final Object b;
    private final boolean c;

    public g8c(String str, Object obj, boolean z) {
        z65.h(str, "screenKey");
        this.a = str;
        this.b = obj;
        this.c = z;
    }

    @Override // defpackage.s64
    public Fragment a() {
        return xp2.a.a(b(), getData());
    }

    @Override // defpackage.yw9
    public String b() {
        return this.a;
    }

    @Override // defpackage.k6c
    public boolean d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8c)) {
            return false;
        }
        g8c g8cVar = (g8c) obj;
        if (z65.c(this.a, g8cVar.a) && z65.c(this.b, g8cVar.b) && this.c == g8cVar.c) {
            return true;
        }
        return false;
    }

    @Override // defpackage.h6c
    public Object getData() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Object obj = this.b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + a91.a(this.c);
    }

    public String toString() {
        String str = this.a;
        Object obj = this.b;
        boolean z = this.c;
        return "WrapScreen(screenKey=" + str + ", data=" + obj + ", singleTop=" + z + ")";
    }

    public /* synthetic */ g8c(String str, Object obj, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? false : z);
    }
}
