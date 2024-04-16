package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.util.NoSuchElementException;
import kotlin.Metadata;
/* compiled from: ProgressionIterators.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\b¨\u0006\u0015"}, d2 = {"Lhw0;", "Lgw0;", "", "hasNext", "", "b", "", "a", "I", "getStep", "()I", "step", "finalElement", c.a, "Z", DateTokenConverter.CONVERTER_KEY, StatisticManager.NEXT, "first", "last", "<init>", "(CCI)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: hw0  reason: default package */
/* loaded from: classes3.dex */
public final class hw0 extends gw0 {
    private final int a;
    private final int b;
    private boolean c;
    private int d;

    public hw0(char c, char c2, int i) {
        this.a = i;
        this.b = c2;
        boolean z = true;
        if (i <= 0 ? z65.j(c, c2) < 0 : z65.j(c, c2) > 0) {
            z = false;
        }
        this.c = z;
        this.d = z ? c : c2;
    }

    @Override // defpackage.gw0
    public char b() {
        int i = this.d;
        if (i == this.b) {
            if (this.c) {
                this.c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.d = this.a + i;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c;
    }
}
