package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StartupMonitor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0005j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lfxa;", "", "", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "stepName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", Image.TYPE_HIGH, "j", "k", "l", Image.TYPE_MEDIUM, "n", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fxa  reason: default package */
/* loaded from: classes4.dex */
public final class fxa {
    public static final fxa b = new fxa("KUSTO_LOGGER_INIT", 0, "initKustoLogger");
    public static final fxa c = new fxa("REALM_INIT", 1, "initRealm");
    public static final fxa d = new fxa("OSM_INIT", 2, "initOsmMap");
    public static final fxa e = new fxa("CREATE_APP_SCOPE", 3, "AppScope::createComponent");
    public static final fxa f = new fxa("START_APP_SCOPE", 4, "AppScopeLifecycleHandler::onStart");
    public static final fxa g = new fxa("CREATE_LOCALITY_SCOPE", 5, "LocalityScope::createComponent");
    public static final fxa h = new fxa("START_LOCALITY_SCOPE", 6, "LocalityScopeLifecycleHandler::onStart");
    public static final fxa i = new fxa("APPS_FLYER_INIT", 7, "appsFlyerInit");
    public static final fxa j = new fxa("APP_INITIALIZER_INIT", 8, "AppInitializer::initApplication");
    public static final fxa k = new fxa("MAIN_SCREEN_SHOWN", 9, "mainScreenShown");
    public static final fxa l = new fxa("SELECT_LOCATION_SCREEN_SHOWN", 10, "SelectLocationPresenter::onFirstViewAttach");
    public static final fxa m = new fxa("MENU_SHOWN", 11, "startup_menu_shown");
    public static final fxa n = new fxa("ONBOARDING_SHOWN", 12, "startup_onboarding_shown");
    private static final /* synthetic */ fxa[] o;
    private static final /* synthetic */ kj3 p;
    private final String a;

    static {
        fxa[] a = a();
        o = a;
        p = lj3.a(a);
    }

    private fxa(String str, int i2, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ fxa[] a() {
        return new fxa[]{b, c, d, e, f, g, h, i, j, k, l, m, n};
    }

    public static fxa valueOf(String str) {
        return (fxa) Enum.valueOf(fxa.class, str);
    }

    public static fxa[] values() {
        return (fxa[]) o.clone();
    }

    public final String i() {
        return this.a;
    }
}
