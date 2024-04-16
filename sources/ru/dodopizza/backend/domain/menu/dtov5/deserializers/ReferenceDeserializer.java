package ru.dodopizza.backend.domain.menu.dtov5.deserializers;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import kotlin.Metadata;
/* compiled from: ReferenceDeserializer.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J,\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR@\u0010\u0012\u001a.\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\u0010j\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceDeserializer;", "T", "Loa5;", "Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;", "Ljava/lang/reflect/Type;", "typeOfT", "getActualType", "Lpa5;", "json", "Lla5;", CoreConstants.CONTEXT_SCOPE_VALUE, "deserialize", "", "idTag", "Ljava/lang/String;", "refTag", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "referenceMap", "Ljava/util/HashMap;", "<init>", "()V", "backend"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ReferenceDeserializer<T> implements oa5<ReferenceWrapper<T>> {
    private final String idTag = "$id";
    private final String refTag = "$ref";
    private final HashMap<String, ReferenceWrapper<T>> referenceMap = new HashMap<>();

    private final Type getActualType(Type type) {
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            z65.g(type2, "get(...)");
            return type2;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    @Override // defpackage.oa5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ru.dodopizza.backend.domain.menu.dtov5.deserializers.ReferenceWrapper<T> deserialize(defpackage.pa5 r4, java.lang.reflect.Type r5, defpackage.la5 r6) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            defpackage.z65.h(r6, r0)
            r0 = 0
            if (r4 == 0) goto L1b
            mb5 r1 = r4.f()
            if (r1 == 0) goto L1b
            java.lang.String r2 = r3.refTag
            pa5 r1 = r1.B(r2)
            if (r1 == 0) goto L1b
            java.lang.String r1 = r1.h()
            goto L1c
        L1b:
            r1 = r0
        L1c:
            if (r1 == 0) goto L2e
            boolean r2 = defpackage.c0b.y(r1)
            if (r2 == 0) goto L25
            goto L2e
        L25:
            java.util.HashMap<java.lang.String, ru.dodopizza.backend.domain.menu.dtov5.deserializers.ReferenceWrapper<T>> r5 = r3.referenceMap
            java.lang.Object r5 = r5.get(r1)
            ru.dodopizza.backend.domain.menu.dtov5.deserializers.ReferenceWrapper r5 = (ru.dodopizza.backend.domain.menu.dtov5.deserializers.ReferenceWrapper) r5
            goto L44
        L2e:
            ru.dodopizza.backend.domain.menu.dtov5.deserializers.ReferenceWrapper r1 = new ru.dodopizza.backend.domain.menu.dtov5.deserializers.ReferenceWrapper
            if (r4 == 0) goto L37
            mb5 r2 = r4.f()
            goto L38
        L37:
            r2 = r0
        L38:
            java.lang.reflect.Type r5 = r3.getActualType(r5)
            java.lang.Object r5 = r6.a(r2, r5)
            r1.<init>(r5)
            r5 = r1
        L44:
            if (r4 == 0) goto L58
            mb5 r4 = r4.f()
            if (r4 == 0) goto L58
            java.lang.String r6 = r3.idTag
            pa5 r4 = r4.B(r6)
            if (r4 == 0) goto L58
            java.lang.String r0 = r4.h()
        L58:
            if (r0 == 0) goto L66
            boolean r4 = defpackage.c0b.y(r0)
            if (r4 == 0) goto L61
            goto L66
        L61:
            java.util.HashMap<java.lang.String, ru.dodopizza.backend.domain.menu.dtov5.deserializers.ReferenceWrapper<T>> r4 = r3.referenceMap
            r4.put(r0, r5)
        L66:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.backend.domain.menu.dtov5.deserializers.ReferenceDeserializer.deserialize(pa5, java.lang.reflect.Type, la5):ru.dodopizza.backend.domain.menu.dtov5.deserializers.ReferenceWrapper");
    }
}
