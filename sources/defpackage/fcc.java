package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: YaCaptchaError.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \t2\u00020\u0001:\u0004\u0003\t\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lfcc;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "message", "<init>", "(Ljava/lang/String;)V", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "Lfcc$c;", "Lfcc$a;", "Lfcc$d;", "yandex-captcha_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: fcc  reason: default package */
/* loaded from: classes2.dex */
public abstract class fcc {
    public static final b b = new b(null);
    private final String a;

    /* compiled from: YaCaptchaError.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfcc$a;", "Lfcc;", "", "message", "<init>", "(Ljava/lang/String;)V", "yandex-captcha_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: fcc$a */
    /* loaded from: classes2.dex */
    public static final class a extends fcc {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(str, null);
            z65.h(str, "message");
        }
    }

    /* compiled from: YaCaptchaError.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lfcc$b;", "", "", "errorCode", "Lfcc;", "a", "CHALLENGE_CLOSED", "I", "NO_INTERNET_CONNECTION", "<init>", "()V", "yandex-captcha_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: fcc$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final fcc a(int i) {
            if (i != 7) {
                if (i != 30) {
                    return new d("Unknown error");
                }
                return new a("Challenge Closed");
            }
            return new c("No internet connection");
        }
    }

    /* compiled from: YaCaptchaError.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfcc$c;", "Lfcc;", "", "message", "<init>", "(Ljava/lang/String;)V", "yandex-captcha_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: fcc$c */
    /* loaded from: classes2.dex */
    public static final class c extends fcc {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(str, null);
            z65.h(str, "message");
        }
    }

    /* compiled from: YaCaptchaError.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfcc$d;", "Lfcc;", "", "message", "<init>", "(Ljava/lang/String;)V", "yandex-captcha_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: fcc$d */
    /* loaded from: classes2.dex */
    public static final class d extends fcc {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(str, null);
            z65.h(str, "message");
        }
    }

    private fcc(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public /* synthetic */ fcc(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
