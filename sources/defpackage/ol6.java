package defpackage;

import java.util.Arrays;
import kotlin.Metadata;
/* compiled from: MinutesTimerFormatter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lol6;", "Lahb;", "", "millils", "", "a", "Ljava/lang/String;", "patternGeneral", "<init>", "(Ljava/lang/String;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ol6  reason: default package */
/* loaded from: classes4.dex */
public final class ol6 implements ahb {
    private final String a;

    public ol6(String str) {
        z65.h(str, "patternGeneral");
        this.a = str;
    }

    @Override // defpackage.ahb
    public String a(long j) {
        pza pzaVar = pza.a;
        String format = String.format(this.a, Arrays.copyOf(new Object[]{Long.valueOf((j / 1000) / 60)}, 1));
        z65.g(format, "format(...)");
        return format;
    }
}
