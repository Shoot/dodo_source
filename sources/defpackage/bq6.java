package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: MultiWidgetSelectionDelegate.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\b¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lbq6;", "Lh9a;", "", "a", "J", "getSelectableId", "()J", "selectableId", "Lkotlin/Function0;", "Lom5;", "b", "Lkotlin/jvm/functions/Function0;", "coordinatesCallback", "Lbcb;", c.a, "layoutResultCallback", "", DateTokenConverter.CONVERTER_KEY, "I", "_previousLastVisibleOffset", "<init>", "(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: bq6  reason: default package */
/* loaded from: classes.dex */
public final class bq6 implements h9a {
    private final long a;
    private final Function0<om5> b;
    private final Function0<bcb> c;
    private int d;

    /* JADX WARN: Multi-variable type inference failed */
    public bq6(long j, Function0<? extends om5> function0, Function0<bcb> function02) {
        z65.h(function0, "coordinatesCallback");
        z65.h(function02, "layoutResultCallback");
        this.a = j;
        this.b = function0;
        this.c = function02;
        this.d = -1;
    }
}
