package defpackage;

import android.net.Uri;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.huawei.hms.opendevice.c;
import defpackage.a79;
import defpackage.tmb;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: AppsFlyerDeepLinkExtractor.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\"\u0010\r\u001a\u0004\u0018\u00010\u00042\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u0002`\u000b¨\u0006\u0010"}, d2 = {"Lfq;", "", "Lcom/appsflyer/deeplink/DeepLink;", "appsFlyerDeepLink", "Leq;", "a", "Lcom/appsflyer/deeplink/DeepLinkResult;", "deepLinkResult", "b", "", "", "Lru/dodopizza/app/application/appsflyer/AppsFlyerConversionData;", "conversionData", c.a, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: fq  reason: default package */
/* loaded from: classes3.dex */
public final class fq {
    private final eq a(DeepLink deepLink) {
        String str;
        String deepLinkValue;
        if (deepLink != null && (deepLinkValue = deepLink.getDeepLinkValue()) != null) {
            str = Uri.decode(deepLinkValue);
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        Uri parse = Uri.parse(str);
        z65.g(parse, "parse(...)");
        String campaign = deepLink.getCampaign();
        String str2 = "";
        if (campaign == null) {
            campaign = "";
        }
        String mediaSource = deepLink.getMediaSource();
        if (mediaSource != null) {
            str2 = mediaSource;
        }
        return new eq(parse, new a79.a(campaign, str2));
    }

    public final eq b(DeepLinkResult deepLinkResult) {
        z65.h(deepLinkResult, "deepLinkResult");
        if (deepLinkResult.getStatus() != DeepLinkResult.Status.FOUND) {
            return null;
        }
        return a(deepLinkResult.getDeepLink());
    }

    public final eq c(Map<String, ? extends Object> map) {
        String b;
        String b2;
        String b3;
        String b4;
        String b5;
        z65.h(map, "conversionData");
        b = gq.b(map, "deep_link_value");
        String decode = Uri.decode(b);
        if (decode != null && decode.length() != 0) {
            b2 = gq.b(map, "af_status");
            if (z65.c(b2, "Non-Organic")) {
                b3 = gq.b(map, "is_first_launch");
                if (z65.c(b3, tmb.h.TRUE_JSON_NAME)) {
                    Uri parse = Uri.parse(decode);
                    z65.g(parse, "parse(...)");
                    b4 = gq.b(map, "campaign");
                    b5 = gq.b(map, "media_source");
                    return new eq(parse, new a79.a(b4, b5));
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
