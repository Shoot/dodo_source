package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.FeatureEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.mk2;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
/* compiled from: FeatureAppModule.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J0\u0010\u0017\u001a*\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0012j\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014`\u0016H\u0007¨\u0006\u001a"}, d2 = {"Lup3;", "", "Ljk2;", "daoFactory", "Lfq3;", "a", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lyhb;", e.a, "Liq3;", "impl", "Lhq3;", "b", "Lld9;", "remoteConfigService", "Lgy3;", c.a, "Ljava/util/HashMap;", "", "", "Lbq3;", "Lkotlin/collections/HashMap;", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: up3  reason: default package */
/* loaded from: classes3.dex */
public final class up3 {
    public static final up3 a = new up3();

    private up3() {
    }

    public final fq3 a(jk2 jk2Var) {
        z65.h(jk2Var, "daoFactory");
        return new gq3(jk2Var.a(bc9.b(FeatureEntity.class), mk2.b.a));
    }

    public final hq3 b(iq3 iq3Var) {
        z65.h(iq3Var, "impl");
        return iq3Var;
    }

    public final gy3 c(ld9 ld9Var) {
        z65.h(ld9Var, "remoteConfigService");
        return new hy3(ld9Var);
    }

    public final HashMap<String, List<bq3>> d() {
        List e;
        List l;
        List l2;
        List l3;
        List l4;
        List l5;
        List l6;
        List l7;
        List l8;
        List l9;
        List l10;
        List l11;
        List l12;
        List l13;
        List l14;
        List l15;
        List l16;
        List l17;
        List l18;
        List l19;
        List l20;
        List l21;
        List l22;
        List l23;
        List l24;
        List l25;
        List l26;
        List l27;
        HashMap<String, List<bq3>> j;
        e = jc1.e(bq3.b7);
        l = kc1.l();
        l2 = kc1.l();
        l3 = kc1.l();
        l4 = kc1.l();
        l5 = kc1.l();
        l6 = kc1.l();
        l7 = kc1.l();
        l8 = kc1.l();
        l9 = kc1.l();
        l10 = kc1.l();
        l11 = kc1.l();
        l12 = kc1.l();
        l13 = kc1.l();
        l14 = kc1.l();
        l15 = kc1.l();
        l16 = kc1.l();
        l17 = kc1.l();
        l18 = kc1.l();
        l19 = kc1.l();
        l20 = kc1.l();
        l21 = kc1.l();
        l22 = kc1.l();
        l23 = kc1.l();
        l24 = kc1.l();
        l25 = kc1.l();
        l26 = kc1.l();
        l27 = kc1.l();
        j = g86.j(lnb.a("643", e), lnb.a("112", l), lnb.a("398", l2), lnb.a("642", l3), lnb.a("440", l4), lnb.a("233", l5), lnb.a("616", l6), lnb.a("566", l7), lnb.a("826", l8), lnb.a("276", l9), lnb.a("705", l10), lnb.a("417", l11), lnb.a("860", l12), lnb.a("762", l13), lnb.a("246", l14), lnb.a("203", l15), lnb.a("784", l16), lnb.a("051", l17), lnb.a("51", l18), lnb.a("688", l19), lnb.a("792", l20), lnb.a("196", l21), lnb.a("191", l22), lnb.a("100", l23), lnb.a("031", l24), lnb.a("31", l25), lnb.a("268", l26), lnb.a("360", l27));
        return j;
    }

    public final yhb e(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        SharedPreferences sharedPreferences = context.getSharedPreferences("TOGGLES", 0);
        z65.e(sharedPreferences);
        return new zhb(sharedPreferences);
    }
}
