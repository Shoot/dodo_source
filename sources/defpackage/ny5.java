package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.util.NoSuchElementException;
import kotlin.Metadata;
/* compiled from: ProgressionIterators.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007¨\u0006\u0014"}, d2 = {"Lny5;", "Lly5;", "", "hasNext", "", "b", "a", "J", "getStep", "()J", "step", "finalElement", c.a, "Z", DateTokenConverter.CONVERTER_KEY, StatisticManager.NEXT, "first", "last", "<init>", "(JJJ)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: ny5  reason: default package */
/* loaded from: classes3.dex */
public final class ny5 extends ly5 {
    private final long a;
    private final long b;
    private boolean c;
    private long d;

    public ny5(long j, long j2, long j3) {
        this.a = j3;
        this.b = j2;
        boolean z = true;
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i <= 0 ? i2 < 0 : i2 > 0) {
            z = false;
        }
        this.c = z;
        this.d = z ? j : j2;
    }

    @Override // defpackage.ly5
    public long b() {
        long j = this.d;
        if (j == this.b) {
            if (this.c) {
                this.c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.d = this.a + j;
        }
        return j;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c;
    }
}
