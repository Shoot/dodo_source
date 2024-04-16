package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import androidx.appcompat.app.d;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.tmb;
import im.threads.business.transport.MessageAttributes;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: KustoDefaultInterceptor.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0015BQ\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020(\u0012\u0006\u0010-\u001a\u00020+\u0012\u0006\u00100\u001a\u00020.¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010/¨\u00063"}, d2 = {"Lwh5;", "Lrc;", "", "j", "", "", "f", "", "g", "()[Ljava/lang/String;", "i", "", DateTokenConverter.CONVERTER_KEY, Image.TYPE_HIGH, "b", e.a, c.a, "Llc;", "consumer", "Lqc;", "event", "a", "Lf8c;", "Lf8c;", "workflowIdProvider", "Lnh5;", "Lnh5;", "localityResolver", "Ln52;", "Ln52;", "customerRepository", "Lpq;", "Lpq;", "appsFlyerService", "Ls80;", "Ls80;", "baseUrlService", "Lava;", "Lava;", "stateProvider", "Lwv5;", "Lwv5;", "locationPermissionChecker", "Li32;", "Li32;", "currentLocaleProvider", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lf8c;Lnh5;Ln52;Lpq;Ls80;Lava;Lwv5;Li32;Landroid/content/Context;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: wh5  reason: default package */
/* loaded from: classes3.dex */
public final class wh5 implements rc {
    private static final a j = new a(null);
    private static final String k = Build.MANUFACTURER + ". " + Build.MODEL;
    private static final String l = Build.VERSION.RELEASE;
    private static final String m = ht4.a.a();
    private static final SimpleDateFormat n;
    private final f8c a;
    private final nh5 b;
    private final n52 c;
    private final pq d;
    private final s80 e;
    private final ava f;
    private final wv5 g;
    private final i32 h;
    private final Context i;

    /* compiled from: KustoDefaultInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004R\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R\u0014\u0010 \u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0014\u0010!\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0004R\u0014\u0010\"\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0014\u0010#\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0004R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lwh5$a;", "", "", "ANALYTICS_VERSION", "Ljava/lang/String;", "ANALYTICS_VERSION_PARAM", "ANDROID", "APPSFLYER_ID_PARAM", "APP_THEME", "APP_VERSION_PARAM", "BASE_URL_PARAM", "BUILD_PARAM", "CLIENT_CITY_PARAM", "CLIENT_ID_PARAM", "COUNTRY_PARAM", "CURRENT_APP_LANGUAGE", "DARK", "DEVICE_TYPE_PARAM", "EVENT_ID_PARAM", "FOLLOW_SYSTEM_THEME", "GEO_PERMISSION_PARAM", "KUSTO_SOURCE", "LIGHT", "ORDER_TYPE_PARAM", "OS_VERSION_PARAM", "PLATFORM_PARAM", "SOURCE_PARAM", "SYSTEM_PREFERRED_LANGUAGES_PARAM", "SYSTEM_THEME", "THEME_SETTINGS", "TIMESTAMP_PARAM", "TIMEZONE", "TIME_FORMAT_PATTERN", GrsBaseInfo.CountryCodeSource.UNKNOWN, "VISIT_ID_PARAM", "WORKFLOW_ID_PARAM", "Ljava/text/SimpleDateFormat;", "timeFormat", "Ljava/text/SimpleDateFormat;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wh5$a */
    /* loaded from: classes3.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: KustoDefaultInterceptor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wh5$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ry7.values().length];
            try {
                iArr[ry7.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ry7.DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ry7.DENIED_FOREVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ry7.NOT_ASKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        n = simpleDateFormat;
    }

    public wh5(f8c f8cVar, nh5 nh5Var, n52 n52Var, pq pqVar, s80 s80Var, ava avaVar, wv5 wv5Var, i32 i32Var, Context context) {
        z65.h(f8cVar, "workflowIdProvider");
        z65.h(nh5Var, "localityResolver");
        z65.h(n52Var, "customerRepository");
        z65.h(pqVar, "appsFlyerService");
        z65.h(s80Var, "baseUrlService");
        z65.h(avaVar, "stateProvider");
        z65.h(wv5Var, "locationPermissionChecker");
        z65.h(i32Var, "currentLocaleProvider");
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = f8cVar;
        this.b = nh5Var;
        this.c = n52Var;
        this.d = pqVar;
        this.e = s80Var;
        this.f = avaVar;
        this.g = wv5Var;
        this.h = i32Var;
        this.i = context;
    }

    private final String b() {
        int l2 = d.l();
        if (l2 != -1) {
            if (l2 != 1) {
                if (l2 != 2) {
                    if (l2 != 3) {
                        return "unknown";
                    }
                    return h();
                }
                return "dark";
            }
            return "light";
        }
        return h();
    }

    private final String c() {
        String language = this.h.get().getLanguage();
        z65.g(language, "getLanguage(...)");
        return language;
    }

    private final boolean d() {
        int l2 = d.l();
        if (l2 == -1 || l2 == 3) {
            return true;
        }
        return false;
    }

    private final String e() {
        int i = b.$EnumSwitchMapping$0[this.g.a().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return "null";
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return "never";
            }
            return "denied once";
        }
        return "in-app";
    }

    private final Map<String, Object> f() {
        String i;
        Map<String, Object> k2;
        String a2 = this.e.a();
        n42 n42Var = this.c.get();
        if (z65.c(n42Var.i(), "1")) {
            i = "";
        } else {
            i = n42Var.i();
        }
        k2 = g86.k(lnb.a("eventId", UUID.randomUUID().toString()), lnb.a("baseUrl", a2), lnb.a(UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, this.a.b()), lnb.a("clientCity", this.b.c()), lnb.a(MessageAttributes.CLIENT_ID, i), lnb.a("appsflyerId", this.d.a()), lnb.a("appVersion", "10.5.0"), lnb.a("build", "274"), lnb.a("deviceType", k), lnb.a("osVersion", l), lnb.a("platform", "android"), lnb.a("visitId", m), lnb.a("analitycsVersion", "2020-04-09v"), lnb.a(KustoStorage.KustoTable.COLUMN_SOURCE, "app"), lnb.a(tmb.c.COUNTRY_JSON_NAME, this.b.a()), lnb.a("timestamp", j()), lnb.a("orderType", uc.a.b(((Number) mh5.c(this.f.e().getCurrentOrderType(), Integer.valueOf(jk7.e.i()))).intValue())), lnb.a("geoPermission", e()), lnb.a("current_app_language", c()), lnb.a("themeSettings", i()), lnb.a("system_preferred_languages", g()));
        return k2;
    }

    private final String[] g() {
        String[] strArr;
        LocaleList locales;
        String languageTags;
        List y0;
        int w;
        List y02;
        Configuration configuration = this.i.getResources().getConfiguration();
        z65.g(configuration, "getConfiguration(...)");
        if (Build.VERSION.SDK_INT >= 24) {
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            z65.g(languageTags, "toLanguageTags(...)");
            y0 = m0b.y0(languageTags, new String[]{","}, false, 0, 6, null);
            List<String> list = y0;
            w = lc1.w(list, 10);
            ArrayList arrayList = new ArrayList(w);
            for (String str : list) {
                y02 = m0b.y0(str, new String[]{"-"}, false, 0, 6, null);
                arrayList.add((String) y02.get(0));
            }
            strArr = (String[]) arrayList.toArray(new String[0]);
        } else {
            strArr = new String[]{configuration.locale.getLanguage()};
        }
        if (strArr.length == 0) {
            return new String[]{"unknown"};
        }
        return strArr;
    }

    private final String h() {
        int i = this.i.getResources().getConfiguration().uiMode & 48;
        if (i != 16) {
            if (i != 32) {
                return "unknown";
            }
            return "dark";
        }
        return "light";
    }

    private final Map<String, Object> i() {
        Map<String, Object> k2;
        k2 = g86.k(lnb.a("systemTheme", h()), lnb.a("appTheme", b()), lnb.a("followSystemTheme", Boolean.valueOf(d())));
        return k2;
    }

    private final String j() {
        String format = n.format(new Date());
        z65.g(format, "format(...)");
        return format;
    }

    @Override // defpackage.rc
    public qc a(lc lcVar, qc qcVar) {
        Map o;
        z65.h(lcVar, "consumer");
        z65.h(qcVar, "event");
        if (lcVar instanceof ph5) {
            o = g86.o(qcVar.d(), f());
            return qc.b(qcVar, null, null, o, 3, null);
        }
        return qcVar;
    }
}
