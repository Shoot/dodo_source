package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: HoursMinSecTimerFormatter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lkp4;", "Lahb;", "", "millis", "", "a", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: kp4  reason: default package */
/* loaded from: classes4.dex */
public final class kp4 implements ahb {

    /* compiled from: HoursMinSecTimerFormatter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kp4$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function0<Boolean> {
        final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j) {
            super(0);
            this.a = j;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.a > 0);
        }
    }

    /* compiled from: HoursMinSecTimerFormatter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00060\u0000j\u0002`\u00012\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "a", "(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kp4$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<StringBuilder, StringBuilder> {
        final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j) {
            super(1);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final StringBuilder invoke(StringBuilder sb) {
            z65.h(sb, "builder");
            sb.append(this.a);
            sb.append(":");
            z65.g(sb, "append(...)");
            return sb;
        }
    }

    /* compiled from: HoursMinSecTimerFormatter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kp4$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function0<Boolean> {
        final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j) {
            super(0);
            this.a = j;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.a < 10);
        }
    }

    /* compiled from: HoursMinSecTimerFormatter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00060\u0000j\u0002`\u00012\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "a", "(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kp4$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function1<StringBuilder, StringBuilder> {
        public static final d a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final StringBuilder invoke(StringBuilder sb) {
            z65.h(sb, "builder");
            sb.append("0");
            z65.g(sb, "append(...)");
            return sb;
        }
    }

    /* compiled from: HoursMinSecTimerFormatter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kp4$e */
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function0<Boolean> {
        final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j) {
            super(0);
            this.a = j;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.a < 10);
        }
    }

    /* compiled from: HoursMinSecTimerFormatter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/StringBuilder;", "kotlin.jvm.PlatformType", "builder", "a", "(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kp4$f */
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function1<StringBuilder, StringBuilder> {
        public static final f a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final StringBuilder invoke(StringBuilder sb) {
            sb.append("0");
            return sb;
        }
    }

    @Override // defpackage.ahb
    public String a(long j) {
        long j2 = 1000;
        long j3 = 60;
        long j4 = ((j / j2) / j3) / j3;
        long j5 = j - (((j4 * j2) * j3) * j3);
        long j6 = (j5 / j2) / j3;
        long j7 = (j5 - ((j6 * j2) * j3)) / j2;
        StringBuilder sb = (StringBuilder) lp4.a(lp4.a(new StringBuilder(), new a(j4), new b(j4)), new c(j6), d.a);
        sb.append(j6);
        sb.append(":");
        StringBuilder sb2 = (StringBuilder) lp4.a(sb, new e(j7), f.a);
        sb2.append(j7);
        String sb3 = sb2.toString();
        z65.g(sb3, "toString(...)");
        return sb3;
    }
}
