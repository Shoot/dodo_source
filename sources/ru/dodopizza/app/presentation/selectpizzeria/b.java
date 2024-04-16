package ru.dodopizza.app.presentation.selectpizzeria;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.z75;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.osmdroid.views.MapView;
/* compiled from: PizzeriasMap.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/b;", "Lz75$d;", "Lqm7;", "", "index", "item", "", DateTokenConverter.CONVERTER_KEY, com.huawei.hms.opendevice.c.a, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class b implements z75.d<qm7> {
    final /* synthetic */ PizzeriasMap a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(PizzeriasMap pizzeriasMap) {
        this.a = pizzeriasMap;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    @Override // defpackage.z75.d
    /* renamed from: c */
    public boolean b(int i, qm7 qm7Var) {
        List list;
        if (this.a.getOnPizzeriaTapListener() != null) {
            PizzeriasMap pizzeriasMap = this.a;
            Function1<b68, Unit> onPizzeriaTapListener = pizzeriasMap.getOnPizzeriaTapListener();
            if (onPizzeriaTapListener != null) {
                list = pizzeriasMap.e;
                onPizzeriaTapListener.invoke(list.get(i));
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    @Override // defpackage.z75.d
    /* renamed from: d */
    public boolean a(int i, qm7 qm7Var) {
        z75 z75Var;
        MapView mapView;
        List list;
        z75Var = this.a.o;
        if (z75Var != null) {
            z75Var.E(qm7Var);
        }
        if (this.a.getOnPizzeriaTapListener() != null) {
            PizzeriasMap pizzeriasMap = this.a;
            Function1<b68, Unit> onPizzeriaTapListener = pizzeriasMap.getOnPizzeriaTapListener();
            if (onPizzeriaTapListener != null) {
                list = pizzeriasMap.e;
                onPizzeriaTapListener.invoke(list.get(i));
            }
            mapView = pizzeriasMap.l;
            if (mapView != null) {
                mapView.postInvalidate();
                return true;
            }
            return true;
        }
        return false;
    }
}
