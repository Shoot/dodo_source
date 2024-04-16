package com.dodopizza.profile.feature.profilesettings.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ContactInfoData.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0016BU\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b%\u0010&J\u0006\u0010\u0003\u001a\u00020\u0002Ji\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b!\u0010$¨\u0006'"}, d2 = {"Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "", "", Image.TYPE_MEDIUM, "", "phone", "email", "vk", "twitter", "instagram", "youtube", "facebook", "pizzeriasMapUrl", "", "Lwo5;", "legalInformationList", "b", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", Image.TYPE_HIGH, "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, c.a, "k", "j", e.a, "f", "l", "g", "i", "Ljava/util/List;", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class a {
    public static final C0212a j = new C0212a(null);
    private static final a k;
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final List<wo5> i;

    /* compiled from: ContactInfoData.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dodopizza/profile/feature/profilesettings/presentation/a$a;", "", "Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "EMPTY", "Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "a", "()Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "<init>", "()V", "profile_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.profile.feature.profilesettings.presentation.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0212a {
        private C0212a() {
        }

        public /* synthetic */ C0212a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.k;
        }
    }

    static {
        List l;
        l = kc1.l();
        k = new a("", "", "", "", "", "", "", "", l);
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<wo5> list) {
        z65.h(str, "phone");
        z65.h(str2, "email");
        z65.h(str3, "vk");
        z65.h(str4, "twitter");
        z65.h(str5, "instagram");
        z65.h(str6, "youtube");
        z65.h(str7, "facebook");
        z65.h(str8, "pizzeriasMapUrl");
        z65.h(list, "legalInformationList");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a c(a aVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i, Object obj) {
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        List<wo5> list2;
        if ((i & 1) != 0) {
            str9 = aVar.a;
        } else {
            str9 = str;
        }
        if ((i & 2) != 0) {
            str10 = aVar.b;
        } else {
            str10 = str2;
        }
        if ((i & 4) != 0) {
            str11 = aVar.c;
        } else {
            str11 = str3;
        }
        if ((i & 8) != 0) {
            str12 = aVar.d;
        } else {
            str12 = str4;
        }
        if ((i & 16) != 0) {
            str13 = aVar.e;
        } else {
            str13 = str5;
        }
        if ((i & 32) != 0) {
            str14 = aVar.f;
        } else {
            str14 = str6;
        }
        if ((i & 64) != 0) {
            str15 = aVar.g;
        } else {
            str15 = str7;
        }
        if ((i & 128) != 0) {
            str16 = aVar.h;
        } else {
            str16 = str8;
        }
        if ((i & 256) != 0) {
            list2 = aVar.i;
        } else {
            list2 = list;
        }
        return aVar.b(str9, str10, str11, str12, str13, str14, str15, str16, list2);
    }

    public final a b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<wo5> list) {
        z65.h(str, "phone");
        z65.h(str2, "email");
        z65.h(str3, "vk");
        z65.h(str4, "twitter");
        z65.h(str5, "instagram");
        z65.h(str6, "youtube");
        z65.h(str7, "facebook");
        z65.h(str8, "pizzeriasMapUrl");
        z65.h(list, "legalInformationList");
        return new a(str, str2, str3, str4, str5, str6, str7, str8, list);
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (z65.c(this.a, aVar.a) && z65.c(this.b, aVar.b) && z65.c(this.c, aVar.c) && z65.c(this.d, aVar.d) && z65.c(this.e, aVar.e) && z65.c(this.f, aVar.f) && z65.c(this.g, aVar.g) && z65.c(this.h, aVar.h) && z65.c(this.i, aVar.i)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.e;
    }

    public final List<wo5> g() {
        return this.i;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        return (((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String i() {
        return this.h;
    }

    public final String j() {
        return this.d;
    }

    public final String k() {
        return this.c;
    }

    public final String l() {
        return this.f;
    }

    public final boolean m() {
        if (this.a.length() > 0 || this.b.length() > 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        String str6 = this.f;
        String str7 = this.g;
        String str8 = this.h;
        List<wo5> list = this.i;
        return "ContactInfoData(phone=" + str + ", email=" + str2 + ", vk=" + str3 + ", twitter=" + str4 + ", instagram=" + str5 + ", youtube=" + str6 + ", facebook=" + str7 + ", pizzeriasMapUrl=" + str8 + ", legalInformationList=" + list + ")";
    }
}
