package com.dodopizza.activeorder.feature.activeorderwidget.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ActiveOrderVO.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\b\u0005\rB%\b\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e;", "", "", "a", "I", com.huawei.hms.opendevice.c.a, "()I", "titleRes", "b", "statusMessageRes", "orderNumber", "<init>", "(III)V", DateTokenConverter.CONVERTER_KEY, "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e$a;", "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e$b;", "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e$c;", "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e$d;", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class e {
    private final int a;
    private final int b;
    private final int c;

    /* compiled from: ActiveOrderVO.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e$a;", "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e;", "<init>", "()V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class a extends e {
        public static final a d = new a();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private a() {
            /*
                r3 = this;
                int r0 = defpackage.d19.order_state_unknown
                r1 = 0
                r2 = 0
                r3.<init>(r0, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.activeorder.feature.activeorderwidget.presentation.e.a.<init>():void");
        }
    }

    /* compiled from: ActiveOrderVO.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0013\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0004\u0010\u0011R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e$b;", "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e;", "", "", DateTokenConverter.CONVERTER_KEY, "[Ljava/lang/String;", com.huawei.hms.push.e.a, "()[Ljava/lang/String;", "statusArgs", "", "J", "g", "()J", "timeRemaining", "", "f", "Z", "()Z", "showTimer", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "subtitleRes", "titleRes", "statusMessageRes", "orderNumber", "<init>", "(III[Ljava/lang/String;JZLjava/lang/Integer;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class b extends e {
        private final String[] d;
        private final long e;
        private final boolean f;
        private final Integer g;

        public /* synthetic */ b(int i, int i2, int i3, String[] strArr, long j, boolean z, Integer num, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, i3, strArr, j, z, (i4 & 64) != 0 ? null : num);
        }

        public final boolean d() {
            return this.f;
        }

        public final String[] e() {
            return this.d;
        }

        public final Integer f() {
            return this.g;
        }

        public final long g() {
            return this.e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, int i2, int i3, String[] strArr, long j, boolean z, Integer num) {
            super(i, i2, i3, null);
            z65.h(strArr, "statusArgs");
            this.d = strArr;
            this.e = j;
            this.f = z;
            this.g = num;
        }
    }

    /* compiled from: ActiveOrderVO.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e$c;", "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e;", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "subtitleRes", "titleRes", "statusMessageRes", "orderNumber", "<init>", "(IIILjava/lang/Integer;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class c extends e {
        private final Integer d;

        public c(int i, int i2, int i3, Integer num) {
            super(i, i2, i3, null);
            this.d = num;
        }

        public final Integer d() {
            return this.d;
        }
    }

    /* compiled from: ActiveOrderVO.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e$d;", "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e;", "", "titleRes", "statusMessageRes", "orderNumber", "<init>", "(III)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class d extends e {
        public d(int i, int i2, int i3) {
            super(i, i2, i3, null);
        }
    }

    public /* synthetic */ e(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3);
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    private e(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
