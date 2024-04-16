package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SelectLocationVO.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\fBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b$\u0010%JO\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e\"\u0004\b \u0010!R\"\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010!¨\u0006&"}, d2 = {"Lmv5;", "Ln6a;", "", "id", MessageAttributes.UUID, "", Action.NAME_ATTRIBUTE, LocalityEntity.FIELD_COUNTRY_CODE, "", "isLastTop", "isSelected", "isCurrentLocality", "a", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "f", c.a, "Ljava/lang/CharSequence;", e.a, "()Ljava/lang/CharSequence;", "Z", Image.TYPE_HIGH, "()Z", "i", "j", "(Z)V", "g", "setCurrentLocality", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;ZZZ)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: mv5  reason: default package */
/* loaded from: classes4.dex */
public final class mv5 extends n6a {
    public static final a h = new a(null);
    private final String a;
    private final String b;
    private final CharSequence c;
    private final String d;
    private final boolean e;
    private boolean f;
    private boolean g;

    /* compiled from: SelectLocationVO.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lmv5$a;", "", "", "SELECTION_CHANGED", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: mv5$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv5(String str, String str2, CharSequence charSequence, String str3, boolean z, boolean z2, boolean z3) {
        super(null);
        z65.h(str, "id");
        z65.h(str2, MessageAttributes.UUID);
        z65.h(charSequence, Action.NAME_ATTRIBUTE);
        z65.h(str3, LocalityEntity.FIELD_COUNTRY_CODE);
        this.a = str;
        this.b = str2;
        this.c = charSequence;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public static /* synthetic */ mv5 b(mv5 mv5Var, String str, String str2, CharSequence charSequence, String str3, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mv5Var.a;
        }
        if ((i & 2) != 0) {
            str2 = mv5Var.b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            charSequence = mv5Var.c;
        }
        CharSequence charSequence2 = charSequence;
        if ((i & 8) != 0) {
            str3 = mv5Var.d;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            z = mv5Var.e;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            z2 = mv5Var.f;
        }
        boolean z5 = z2;
        if ((i & 64) != 0) {
            z3 = mv5Var.g;
        }
        return mv5Var.a(str, str4, charSequence2, str5, z4, z5, z3);
    }

    public final mv5 a(String str, String str2, CharSequence charSequence, String str3, boolean z, boolean z2, boolean z3) {
        z65.h(str, "id");
        z65.h(str2, MessageAttributes.UUID);
        z65.h(charSequence, Action.NAME_ATTRIBUTE);
        z65.h(str3, LocalityEntity.FIELD_COUNTRY_CODE);
        return new mv5(str, str2, charSequence, str3, z, z2, z3);
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.a;
    }

    public final CharSequence e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv5)) {
            return false;
        }
        mv5 mv5Var = (mv5) obj;
        if (z65.c(this.a, mv5Var.a) && z65.c(this.b, mv5Var.b) && z65.c(this.c, mv5Var.c) && z65.c(this.d, mv5Var.d) && this.e == mv5Var.e && this.f == mv5Var.f && this.g == mv5Var.g) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.b;
    }

    public final boolean g() {
        return this.g;
    }

    public final boolean h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + a91.a(this.e)) * 31) + a91.a(this.f)) * 31) + a91.a(this.g);
    }

    public final boolean i() {
        return this.f;
    }

    public final void j(boolean z) {
        this.f = z;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        CharSequence charSequence = this.c;
        String str3 = this.d;
        boolean z = this.e;
        boolean z2 = this.f;
        boolean z3 = this.g;
        return "LocalityVO(id=" + str + ", uuid=" + str2 + ", name=" + ((Object) charSequence) + ", countryCode=" + str3 + ", isLastTop=" + z + ", isSelected=" + z2 + ", isCurrentLocality=" + z3 + ")";
    }
}
