package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainDispatchers.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b!\u0010\"J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016J\u001e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lsl6;", "Lt46;", "Lvt2;", "", "x0", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "W", "", "timeMillis", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lf43;", Image.TYPE_SMALL, "r0", "Lfn0;", "", "continuation", "z0", "", "toString", "", c.a, "Ljava/lang/Throwable;", "cause", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "errorHint", "p0", "()Lt46;", "immediate", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: sl6  reason: default package */
/* loaded from: classes3.dex */
public final class sl6 extends t46 implements vt2 {
    private final Throwable c;
    private final String d;

    public sl6(Throwable th, String str) {
        this.c = th;
        this.d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Void x0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.c
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.d
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.c
            r1.<init>(r0, r2)
            throw r1
        L36:
            defpackage.w46.d()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl6.x0():java.lang.Void");
    }

    @Override // defpackage.kx1
    public boolean W(CoroutineContext coroutineContext) {
        x0();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.kx1
    /* renamed from: r0 */
    public Void x(CoroutineContext coroutineContext, Runnable runnable) {
        x0();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.vt2
    public f43 s(long j, Runnable runnable, CoroutineContext coroutineContext) {
        x0();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.t46, defpackage.kx1
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.c != null) {
            str = ", cause=" + this.c;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.vt2
    /* renamed from: z0 */
    public Void m(long j, fn0<? super Unit> fn0Var) {
        x0();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.t46
    public t46 p0() {
        return this;
    }
}
