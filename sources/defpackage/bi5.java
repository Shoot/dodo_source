package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.b77;
import defpackage.oh5;
import defpackage.zh5;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/* compiled from: KustoModule.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0007J\b\u0010\u0010\u001a\u00020\u000fH\u0007J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000fH\u0007J\u0012\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0018\u001a\u00020\u0016H\u0007¨\u0006\u001d"}, d2 = {"Lbi5;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lai5;", "kustoMetaDataCollector", "Loh5;", "b", "Lld9;", "remoteConfigService", "Lzh5$a;", "a", "applicationContext", "Lji5;", "f", "Lsh5;", c.a, "kustoRepository", "Lih4;", "googlePlayServicesHelper", e.a, "settings", "Lretrofit2/Retrofit;", "g", "retrofit", "Lth5;", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: bi5  reason: default package */
/* loaded from: classes3.dex */
public final class bi5 {
    public static final bi5 a = new bi5();

    /* compiled from: KustoModule.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Loh5$a;", "", "a", "(Loh5$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bi5$a */
    /* loaded from: classes3.dex */
    static final class a extends ej5 implements Function1<oh5.a, Unit> {
        final /* synthetic */ ai5 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ai5 ai5Var) {
            super(1);
            this.a = ai5Var;
        }

        public final void a(oh5.a aVar) {
            z65.h(aVar, "$this$invoke");
            aVar.b(this.a);
            aVar.c(TimeUnit.SECONDS.toMillis(30L));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(oh5.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    private bi5() {
    }

    public final zh5.a a(ld9 ld9Var) {
        z65.h(ld9Var, "remoteConfigService");
        return new zh5.a(ld9Var);
    }

    public final oh5 b(Context context, ai5 ai5Var) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(ai5Var, "kustoMetaDataCollector");
        return oh5.a.a(context, new a(ai5Var));
    }

    public final sh5 c() {
        return new sh5(60L, 300L, "https://eventstream.dodopizza.com/");
    }

    public final th5 d(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return new th5(retrofit);
    }

    public final ai5 e(ji5 ji5Var, ih4 ih4Var) {
        z65.h(ji5Var, "kustoRepository");
        z65.h(ih4Var, "googlePlayServicesHelper");
        return new l78(ji5Var, ih4Var);
    }

    public final ji5 f(Context context) {
        z65.h(context, "applicationContext");
        SharedPreferences sharedPreferences = context.getSharedPreferences("KUSTO", 0);
        z65.g(sharedPreferences, "getSharedPreferences(...)");
        return new ki5(sharedPreferences);
    }

    public final Retrofit g(sh5 sh5Var) {
        z65.h(sh5Var, "settings");
        Retrofit.Builder addConverterFactory = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create());
        b77.a aVar = new b77.a();
        long b = sh5Var.b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Retrofit build = addConverterFactory.client(aVar.e(b, timeUnit).S(sh5Var.c(), timeUnit).O(5L, timeUnit).c()).baseUrl(sh5Var.a()).build();
        z65.g(build, "build(...)");
        return build;
    }
}
