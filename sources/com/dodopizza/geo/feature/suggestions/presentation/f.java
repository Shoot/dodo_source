package com.dodopizza.geo.feature.suggestions.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.suggestions.presentation.g;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import kotlin.Metadata;
/* compiled from: SelectedSuggestionFactory.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/dodopizza/geo/feature/suggestions/presentation/f;", "", "Ldt5;", "locality", "", "b", "Lp9a;", "selectedSuggestion", "Lcom/dodopizza/geo/feature/suggestions/presentation/g;", "a", "Ljv5;", "Ljv5;", "localityService", "Lg91;", "Lg91;", "factory", "", com.huawei.hms.opendevice.c.a, "Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, DateTokenConverter.CONVERTER_KEY, "currentLocalityId", com.huawei.hms.push.e.a, "Z", "isEmptyCart", "<init>", "(Ljv5;Lg91;Ljava/lang/String;Ljava/lang/String;Z)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class f {
    private final jv5 a;
    private final g91 b;
    private final String c;
    private final String d;
    private final boolean e;

    public f(jv5 jv5Var, g91 g91Var, String str, String str2, boolean z) {
        z65.h(jv5Var, "localityService");
        z65.h(g91Var, "factory");
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        this.a = jv5Var;
        this.b = g91Var;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    private final boolean b(dt5 dt5Var) {
        String str = this.d;
        if (str != null && !z65.c(str, dt5Var.getId()) && !this.e) {
            return true;
        }
        return false;
    }

    public final g a(p9a p9aVar) {
        z65.h(p9aVar, "selectedSuggestion");
        String e = p9aVar.e();
        if (e != null && p9aVar.f() != null) {
            if (p9aVar.d()) {
                return new g.b(p9aVar.c());
            }
            dt5 b = this.a.b(this.c, e);
            if (b != null) {
                return new g.a(b, this.b.a(p9aVar), b(b));
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        return g.c.a;
    }
}
