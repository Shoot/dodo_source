package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.gson.Gson;
import com.huawei.hms.opendevice.c;
import defpackage.tmb;
import im.threads.business.UserInfoBuilder;
import kotlin.Metadata;
/* compiled from: ThreadsLibUserInfoBuilder.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001c\u0010\u001d\u001a\n \u001a*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lmfb;", "", "", "firstName", "lastName", c.a, "Lf28;", "phone", "countryIsoName", "a", "Lau6;", "user", "Lyt6;", "topic", "Lim/threads/business/UserInfoBuilder;", "b", "Lcom/google/gson/Gson;", "Lcom/google/gson/Gson;", "gson", "Las8;", "Lay1;", "Las8;", "countryProvider", "Ljeb;", "Ljeb;", "appMarkerCreator", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "()Lay1;", tmb.c.COUNTRY_JSON_NAME, "<init>", "(Lcom/google/gson/Gson;Las8;Ljeb;)V", "chat_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mfb  reason: default package */
/* loaded from: classes.dex */
public final class mfb {
    private final Gson a;
    private final as8<ay1> b;
    private final jeb c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ThreadsLibUserInfoBuilder.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lmfb$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "phone", "b", tmb.c.COUNTRY_JSON_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "chat_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: mfb$a */
    /* loaded from: classes.dex */
    public static final class a {
        @uca("phone")
        private final String a;
        @uca("Country")
        private final String b;

        public a(String str, String str2) {
            z65.h(str, "phone");
            z65.h(str2, tmb.c.COUNTRY_JSON_NAME);
            this.a = str;
            this.b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && z65.c(this.b, aVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            return "ClientData(phone=" + str + ", country=" + str2 + ")";
        }
    }

    public mfb(Gson gson, as8<ay1> as8Var, jeb jebVar) {
        z65.h(gson, "gson");
        z65.h(as8Var, "countryProvider");
        z65.h(jebVar, "appMarkerCreator");
        this.a = gson;
        this.b = as8Var;
        this.c = jebVar;
    }

    private final String a(f28 f28Var, String str) {
        String t = this.a.t(new a(f28Var.toString(), str));
        z65.g(t, "toJson(...)");
        return t;
    }

    private final String c(String str, String str2) {
        return str + " " + str2;
    }

    private final ay1 d() {
        return this.b.get();
    }

    public final UserInfoBuilder b(au6 au6Var, yt6 yt6Var) {
        z65.h(au6Var, "user");
        String b = au6Var.b();
        if (b.length() > 0) {
            return new UserInfoBuilder(b).setAppMarker(this.c.a(yt6Var)).setUserName(c(au6Var.a(), au6Var.c())).setClientData(a(au6Var.d(), d().f()));
        }
        throw new IllegalArgumentException(("Id is empty for " + au6Var).toString());
    }
}
