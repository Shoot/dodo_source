package defpackage;

import android.animation.TypeEvaluator;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
/* compiled from: OrderSummaryMapFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lbm5;", "Landroid/animation/TypeEvaluator;", "Lcom/google/android/gms/maps/model/LatLng;", "", "fraction", "startValue", "endValue", "a", "<init>", "()V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bm5  reason: default package */
/* loaded from: classes.dex */
public final class bm5 implements TypeEvaluator<LatLng> {
    @Override // android.animation.TypeEvaluator
    /* renamed from: a */
    public LatLng evaluate(float f, LatLng latLng, LatLng latLng2) {
        z65.h(latLng, "startValue");
        z65.h(latLng2, "endValue");
        double d = latLng2.a;
        double d2 = latLng.a;
        double d3 = f;
        double d4 = ((d - d2) * d3) + d2;
        double d5 = latLng2.b;
        double d6 = latLng.b;
        return new LatLng(d4, ((d5 - d6) * d3) + d6);
    }
}
