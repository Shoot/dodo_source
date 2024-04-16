package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: SaveableStateRegistry.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b\u0018\u00010\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b0\u0006H\u0016R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR(\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR.\u0010\u0013\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00110\u00100\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0016"}, d2 = {"Lft9;", "Let9;", "", "value", "", "b", "", "", "", "a", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "canBeSaved", "", "Ljava/util/Map;", "restored", "", "Lkotlin/Function0;", c.a, "valueProviders", "<init>", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ft9  reason: default package */
/* loaded from: classes.dex */
final class ft9 implements et9 {
    private final Function1<Object, Boolean> a;
    private final Map<String, List<Object>> b;
    private final Map<String, List<Function0<Object>>> c;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = defpackage.g86.x(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ft9(java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>> r2, kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "canBeSaved"
            defpackage.z65.h(r3, r0)
            r1.<init>()
            r1.a = r3
            if (r2 == 0) goto L12
            java.util.Map r2 = defpackage.d86.x(r2)
            if (r2 != 0) goto L17
        L12:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
        L17:
            r1.b = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ft9.<init>(java.util.Map, kotlin.jvm.functions.Function1):void");
    }

    @Override // defpackage.et9
    public Map<String, List<Object>> a() {
        Map<String, List<Object>> x;
        ArrayList h;
        x = g86.x(this.b);
        for (Map.Entry<String, List<Function0<Object>>> entry : this.c.entrySet()) {
            String key = entry.getKey();
            List<Function0<Object>> value = entry.getValue();
            if (value.size() == 1) {
                Object invoke = value.get(0).invoke();
                if (invoke == null) {
                    continue;
                } else if (b(invoke)) {
                    h = kc1.h(invoke);
                    x.put(key, h);
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                int size = value.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object invoke2 = value.get(i).invoke();
                    if (invoke2 != null && !b(invoke2)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    arrayList.add(invoke2);
                }
                x.put(key, arrayList);
            }
        }
        return x;
    }

    public boolean b(Object obj) {
        z65.h(obj, "value");
        return this.a.invoke(obj).booleanValue();
    }
}
