package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: XorWowRandom.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0000\u0018\u0000 \u00192\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001aB9\b\u0000\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015B\u0019\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0018J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\b¨\u0006\u001b"}, d2 = {"Lbcc;", "Lb49;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", c.a, "bitCount", "b", "I", "x", DateTokenConverter.CONVERTER_KEY, "y", e.a, "z", "f", "w", "g", "v", Image.TYPE_HIGH, "addend", "<init>", "(IIIIII)V", "seed1", "seed2", "(II)V", "i", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: bcc  reason: default package */
/* loaded from: classes3.dex */
public final class bcc extends b49 implements Serializable {
    private static final a i = new a(null);
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    /* compiled from: XorWowRandom.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lbcc$a;", "", "", "serialVersionUID", "J", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: bcc$a */
    /* loaded from: classes3.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public bcc(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        if ((i2 | i3 | i4 | i5 | i6) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
        }
        for (int i8 = 0; i8 < 64; i8++) {
            c();
        }
    }

    @Override // defpackage.b49
    public int b(int i2) {
        return e49.e(c(), i2);
    }

    @Override // defpackage.b49
    public int c() {
        int i2 = this.c;
        int i3 = i2 ^ (i2 >>> 2);
        this.c = this.d;
        this.d = this.e;
        this.e = this.f;
        int i4 = this.g;
        this.f = i4;
        int i5 = ((i3 ^ (i3 << 1)) ^ i4) ^ (i4 << 4);
        this.g = i5;
        int i6 = this.h + 362437;
        this.h = i6;
        return i5 + i6;
    }

    public bcc(int i2, int i3) {
        this(i2, i3, 0, 0, ~i2, (i2 << 10) ^ (i3 >>> 4));
    }
}
