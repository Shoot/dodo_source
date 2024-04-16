package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Timeout.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lygb;", "U", "T", "Ltw9;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "run", "", "F0", "()Ljava/lang/String;", "", DateTokenConverter.CONVERTER_KEY, "J", CrashHianalyticsData.TIME, "Lcv1;", "uCont", "<init>", "(JLcv1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: ygb  reason: default package */
/* loaded from: classes3.dex */
public final class ygb<U, T extends U> extends tw9<T> implements Runnable {
    public final long d;

    public ygb(long j, cv1<? super U> cv1Var) {
        super(cv1Var.getContext(), cv1Var);
        this.d = j;
    }

    @Override // defpackage.e1, defpackage.v95
    public String F0() {
        return super.F0() + "(timeMillis=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // java.lang.Runnable
    public void run() {
        J(zgb.a(this.d, this));
    }
}
