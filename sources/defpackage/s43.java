package defpackage;

import android.location.Location;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
/* compiled from: DistanceMeasurer.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Ls43;", "Lr43;", "Lov5;", RemoteMessageConst.FROM, RemoteMessageConst.TO, "", "a", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: s43  reason: default package */
/* loaded from: classes4.dex */
public final class s43 implements r43 {
    @Override // defpackage.r43
    public float a(ov5 ov5Var, ov5 ov5Var2) {
        z65.h(ov5Var, RemoteMessageConst.FROM);
        z65.h(ov5Var2, RemoteMessageConst.TO);
        float[] fArr = {0.0f};
        Location.distanceBetween(ov5Var.b(), ov5Var.c(), ov5Var2.b(), ov5Var2.c(), fArr);
        return fArr[0];
    }
}
