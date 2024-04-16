package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.huawei.hms.opendevice.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: AppsFlyerDeepLinksReporter.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\"\u0010\u000f\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nj\u0002`\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u001c\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000bH\u0016R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R#\u0010'\u001a\n #*\u0004\u0018\u00010\"0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0017\u0010&R\u001c\u0010)\u001a\n #*\u0004\u0018\u00010\u001f0\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010(¨\u0006,"}, d2 = {"Liq;", "Lcom/appsflyer/deeplink/DeepLinkListener;", "Lcom/appsflyer/AppsFlyerConversionListener;", "Leq;", "deeplinkData", "", c.a, "Lcom/appsflyer/deeplink/DeepLinkResult;", "deepLinkResult", "onDeepLinking", "", "", "", "Lru/dodopizza/app/application/appsflyer/AppsFlyerConversionData;", "conversionData", "onConversionDataSuccess", "errorMessage", "onConversionDataFail", "", "attributionData", "onAppOpenAttribution", "onAttributionFailure", "Lfq;", "a", "Lfq;", "deepLinkExtractor", "Lb79;", "b", "Lb79;", "rawDeepLinkDataBuilder", "Las8;", "Lru/dodopizza/app/presentation/main/a;", "Las8;", "rawDeepLinksProcessorProvider", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lrn5;", "()Lorg/slf4j/Logger;", "logger", "()Lru/dodopizza/app/presentation/main/a;", "rawDeepLinksProcessor", "<init>", "(Lfq;Lb79;Las8;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: iq  reason: default package */
/* loaded from: classes3.dex */
public final class iq implements DeepLinkListener, AppsFlyerConversionListener {
    private final fq a;
    private final b79 b;
    private final as8<ru.dodopizza.app.presentation.main.a> c;
    private final rn5 d;

    /* compiled from: AppsFlyerDeepLinksReporter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: iq$a */
    /* loaded from: classes3.dex */
    static final class a extends ej5 implements Function0<Logger> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("AppsFlyerDeepLinksReporter");
        }
    }

    public iq(fq fqVar, b79 b79Var, as8<ru.dodopizza.app.presentation.main.a> as8Var) {
        rn5 b;
        z65.h(fqVar, "deepLinkExtractor");
        z65.h(b79Var, "rawDeepLinkDataBuilder");
        z65.h(as8Var, "rawDeepLinksProcessorProvider");
        this.a = fqVar;
        this.b = b79Var;
        this.c = as8Var;
        b = yn5.b(a.a);
        this.d = b;
    }

    private final Logger a() {
        return (Logger) this.d.getValue();
    }

    private final ru.dodopizza.app.presentation.main.a b() {
        return this.c.get();
    }

    private final void c(eq eqVar) {
        a79 b = b79.b(this.b, eqVar.b(), null, eqVar.a(), 2, null);
        if (b != null) {
            b().l(b);
        }
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map<String, String> map) {
        z65.h(map, "attributionData");
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
        z65.h(str, "errorMessage");
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
        z65.h(str, "errorMessage");
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map<String, ? extends Object> map) {
        z65.h(map, "conversionData");
        Logger a2 = a();
        a2.info("conversion data: " + map);
        eq c = this.a.c(map);
        if (c == null) {
            return;
        }
        c(c);
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public void onDeepLinking(DeepLinkResult deepLinkResult) {
        z65.h(deepLinkResult, "deepLinkResult");
        Logger a2 = a();
        a2.info("deep link result: " + deepLinkResult);
        eq b = this.a.b(deepLinkResult);
        if (b == null) {
            return;
        }
        c(b);
    }
}
