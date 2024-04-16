package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: ReferrerInfo.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0007\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001b\u0010\fR\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001e\u0010\fR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010&\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010)\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b\u0014\u0010(¨\u0006,"}, d2 = {"Lac9;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "referralCode", "", "b", "D", "i", "()D", "totalCoinsEarned", c.a, "I", "j", "()I", "totalInvitedFriend", "g", "referrerReward", e.a, Image.TYPE_HIGH, "referrerRewardDescription", "f", "referralGift", "referralGiftDescription", "inviteLink", "inviteMessage", "Z", "k", "()Z", "isEnterCodeAvailable", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "maxReferralsCount", "<init>", "(Ljava/lang/String;DILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ac9  reason: default package */
/* loaded from: classes4.dex */
public final class ac9 {
    private final String a;
    private final double b;
    private final int c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final boolean j;
    private final Integer k;

    public ac9(String str, double d, int i, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, Integer num) {
        z65.h(str, "referralCode");
        z65.h(str2, "referrerReward");
        z65.h(str3, "referrerRewardDescription");
        z65.h(str4, "referralGift");
        z65.h(str5, "referralGiftDescription");
        z65.h(str6, "inviteLink");
        z65.h(str7, "inviteMessage");
        this.a = str;
        this.b = d;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = z;
        this.k = num;
    }

    public final String a() {
        return this.h;
    }

    public final String b() {
        return this.i;
    }

    public final Integer c() {
        return this.k;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac9)) {
            return false;
        }
        ac9 ac9Var = (ac9) obj;
        if (z65.c(this.a, ac9Var.a) && Double.compare(this.b, ac9Var.b) == 0 && this.c == ac9Var.c && z65.c(this.d, ac9Var.d) && z65.c(this.e, ac9Var.e) && z65.c(this.f, ac9Var.f) && z65.c(this.g, ac9Var.g) && z65.c(this.h, ac9Var.h) && z65.c(this.i, ac9Var.i) && this.j == ac9Var.j && z65.c(this.k, ac9Var.k)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.g;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((((((this.a.hashCode() * 31) + nkb.a(this.b)) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + a91.a(this.j)) * 31;
        Integer num = this.k;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final double i() {
        return this.b;
    }

    public final int j() {
        return this.c;
    }

    public final boolean k() {
        return this.j;
    }

    public String toString() {
        String str = this.a;
        double d = this.b;
        int i = this.c;
        String str2 = this.d;
        String str3 = this.e;
        String str4 = this.f;
        String str5 = this.g;
        String str6 = this.h;
        String str7 = this.i;
        boolean z = this.j;
        Integer num = this.k;
        return "ReferrerInfo(referralCode=" + str + ", totalCoinsEarned=" + d + ", totalInvitedFriend=" + i + ", referrerReward=" + str2 + ", referrerRewardDescription=" + str3 + ", referralGift=" + str4 + ", referralGiftDescription=" + str5 + ", inviteLink=" + str6 + ", inviteMessage=" + str7 + ", isEnterCodeAvailable=" + z + ", maxReferralsCount=" + num + ")";
    }
}
