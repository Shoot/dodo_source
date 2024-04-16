package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: HalvesItemInfo.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0003\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lil4;", "", "Ltja;", "a", "Ltja;", "b", "()Ltja;", "firstHalve", c.a, "secondHalve", "Lw63;", "Lw63;", "()Lw63;", "doughType", "Lfna;", DateTokenConverter.CONVERTER_KEY, "Lfna;", "()Lfna;", "sizeGroup", "<init>", "(Ltja;Ltja;Lw63;Lfna;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: il4  reason: default package */
/* loaded from: classes.dex */
public final class il4 {
    private final tja a;
    private final tja b;
    private final w63 c;
    private final fna d;

    public il4(tja tjaVar, tja tjaVar2, w63 w63Var, fna fnaVar) {
        z65.h(tjaVar, "firstHalve");
        z65.h(tjaVar2, "secondHalve");
        z65.h(w63Var, "doughType");
        z65.h(fnaVar, "sizeGroup");
        this.a = tjaVar;
        this.b = tjaVar2;
        this.c = w63Var;
        this.d = fnaVar;
    }

    public final w63 a() {
        return this.c;
    }

    public final tja b() {
        return this.a;
    }

    public final tja c() {
        return this.b;
    }

    public final fna d() {
        return this.d;
    }
}
